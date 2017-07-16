package com.mi.module.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mi.common.model.BaseResult;
import com.mi.common.model.ReturnCode;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.ArticleType;
import com.mi.module.blog.entity.Type;
import com.mi.module.blog.service.IArticleTypeService;
import com.mi.module.blog.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文章类别管理控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/7/15.
 */
@Controller
@RequestMapping("/admin/type")
public class AdminTypeController {

    @Autowired
    private ITypeService iTypeService;
    @Autowired
    private IArticleTypeService iArticleTypeService;

    /**
     * 初始化分页信息 获取totalcount
     * @param pager 分页对象
     * @return
     */
    @RequestMapping("/initPage")
    @ResponseBody
    public Pager initPage(Pager pager){
        iTypeService.initPage(pager);
        return pager;
    }


    /**
     * 加载分类信息列表
     * @param pager 分页对象
     * @param param  搜索条件
     * @param model
     * @return
     */
    @RequestMapping("/load")
    public String load(Pager pager ,String param,Model model){
        List<Type> typeList = iTypeService.load(pager,param);
        model.addAttribute("typeList",typeList);
        return "admin/type/typeTable";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/addJump")
    public String addPage(){
        return "admin/type/typeAdd";
    }

    /**
     * 添加分类信息
     * @param type 分类信息对象
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public BaseResult save(Type type){
        if (type.getSort()==null){
            type.setSort(0);
        }
        //检查数据是否存在
        boolean result =  iTypeService.checkExist(type);
        if (result){
            return new BaseResult(null, ReturnCode.FAIL,"已存在分类");
        }else if (iTypeService.insert(type)){
            return new BaseResult(null, ReturnCode.SUCCESS);
        }else {
            return new BaseResult(null, ReturnCode.FAIL,"添加分类失败");
        }

    }

    /**
     * 跳转修改页面
     * @param typeId 分类id
     * @param model
     * @return
     */
    @RequestMapping("/editJump")
    public String editPage(String typeId, Model model){
        Type type = iTypeService.selectById(typeId);
        model.addAttribute("type",type);
        return "admin/type/typeEdit";
    }

    /**
     * 更新分类信息
     * @param type 分类信息对象
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public BaseResult update(Type type){
        if (type.getSort()==null){
            type.setSort(0);
        }
        //检查数据是否存在
        boolean result =  iTypeService.checkExist(type);
        if (result){
            return new BaseResult(null, ReturnCode.FAIL,"已存在分类");
        }else if (iTypeService.updateById(type)){
            return new BaseResult(null, ReturnCode.SUCCESS);
        }else {
            return new BaseResult(null, ReturnCode.FAIL,"修改分类失败");
        }

    }

    /**
     * 删除之前查询是否存在文章
     * @param typeId
     * @return
     */
    @RequestMapping("/delCheckExist")
    @ResponseBody
    public BaseResult delCheckExist(String typeId){
        EntityWrapper<ArticleType> ew = new EntityWrapper<>();
        ArticleType articleType =new ArticleType();
        articleType.setTypeId(typeId);
        ew.setEntity(articleType);

        int count = iArticleTypeService.selectCount(ew);
        if (count > 0){
            return new BaseResult(null, ReturnCode.FAIL,"当前分类已存在文章");
        }
        return new BaseResult(null, ReturnCode.SUCCESS);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public BaseResult delete(String typeId){
        if(iTypeService.deleteById(typeId)){
            return new BaseResult(null, ReturnCode.SUCCESS);
        }
        return new BaseResult(null, ReturnCode.FAIL);

    }

}
