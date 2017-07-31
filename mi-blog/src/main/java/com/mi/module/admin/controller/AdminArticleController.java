package com.mi.module.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mi.common.model.BaseResult;
import com.mi.common.model.ReturnCode;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.mi.module.blog.entity.Tag;
import com.mi.module.blog.entity.Type;
import com.mi.module.blog.entity.User;
import com.mi.module.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 后台-文章; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Controller
@RequestMapping("/admin/article")
public class AdminArticleController {

    @Autowired
    IArticleService iArticleService; //文章service
    @Autowired
    ITypeService iTypeService; //分类service
    @Autowired
    ITagService iTagService; //标签service
    @Autowired
    IUserInfoService iUserInfoService;
    @Autowired
    IUserService iUserService;

    /**
     * 初始化文章分页信息
     * @param pager
     * @return
     */
    @RequestMapping("/initPage")
    @ResponseBody
    public Pager initPage(Pager pager) {
        iArticleService.initPage(pager);
        return pager;
    }

    /**
     * 初始化文章列表
     * @param pager 分页对象
     * @param typeId 搜索条件 分类id
     * @param tagIds 搜索条件 tag集合
     * @param title 搜索条件 文章标题
     * @param model
     * @return
     */

    @RequestMapping("/load")
    public String loadArticle(Pager pager, String typeId, String tagIds, String title, Model model) {
        /**
         * 设置start位置
         */
        pager.setStart(pager.getStart());
        //封装查询条件
        Map<String, Object> param = new HashMap<>();
        if (tagIds != null && !"".equals(tagIds)) {
            param.put("tags", tagIds.split(","));
        }else {
            param.put("tags", null);
        }
        param.put("typeId", typeId);
        param.put("title",title);
        param.put("pager", pager);
        //获取文章列表
        List<Article> articleList = iArticleService.loadArticle(param);
        model.addAttribute("articleList", articleList);
        return "admin/article/articleTable";
    }

    /**
     * 获取条件,所有tag和category
     * @param model
     * @return
     */
    @RequestMapping("/term")
    public String getArticleTerm(Model model) {
        EntityWrapper<Tag> ewTag = new EntityWrapper<>();
        List<Tag> tagList = iTagService.selectList(ewTag);
        EntityWrapper<Type> ewType = new EntityWrapper<>();
        List<Type> typeList = iTypeService.selectList(ewType);
        model.addAttribute("tagList", tagList);
        model.addAttribute("typeList", typeList);
        return "admin/article/articleInfo";
    }


    /**
     * 更新文章可用状态
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updateStatue")
    @ResponseBody
    public BaseResult updateStatue(String id, int status) {

        EntityWrapper<Article> ew = new EntityWrapper<>();
        Article article = new Article();
        article.setArticleId(id);
        article.setStatus(status);
        ew.setEntity(article);
        iArticleService.updateById(article);
        return  new BaseResult(null,ReturnCode.SUCCESS);
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage(){
        return "admin/article/articleAdd";
    }


    /**
     * 保存文章
     * @param article
     * @param tags
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public BaseResult insert(Article article,String[] tags,String typeId){
        User user = iUserService.getCurrentUser();
        article.setAuthor(user.getUserName());
        article.setCreateTime(new Date());
        article.setStatus(1);
        Integer result = iArticleService.insertArticle(article,tags,typeId);
        if (result == 1){
            return  new BaseResult(null,ReturnCode.SUCCESS);
        }

        return  new BaseResult(null,ReturnCode.FAIL);
    }


}
