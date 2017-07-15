package com.mi.module.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.mi.common.model.BaseResult;
import com.mi.common.model.ReturnCode;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Friendlink;
import com.mi.module.blog.service.IFriendlinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 友情链接管理控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/7/15.
 */
@Controller
@RequestMapping("/admin/flink")
public class AdminFlinkController {

    @Autowired
    private IFriendlinkService iFriendlinkService;

    @RequestMapping("/initPage")
    @ResponseBody
    public Pager initPage(Pager pager){
        iFriendlinkService.initPage(pager);
        return pager;
    }

    /**
     * 加载友链列表
     * @return
     */
    @RequestMapping("/load")
    public String  load(Pager pager,String param,Model model){
        List<Friendlink> flinkList = iFriendlinkService.loadList(pager,param);
        model.addAttribute("flinkList",flinkList);
        return "admin/flink/flinkTable";
    }

    /**
     * 保存友链
     * @param flink
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public BaseResult save(Friendlink flink){
//        try {
//            partner.setSiteName(URLDecoder.decode(partner.getSiteName(), "utf-8"));
//            partner.setSiteDesc(URLDecoder.decode(partner.getSiteDesc(), "utf-8"));
//            partner.setSiteUrl(URLDecoder.decode(partner.getSiteUrl(), "utf-8"));
//            partnerService.savePartner(partner);
//        }catch (Exception e){
//
//            return ResultInfoFactory.getErrorResultInfo();
//        }
//        return ResultInfoFactory.getSuccessResultInfo();

        return null;
    }

    /**
     * 更新友链
     * @param flink
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public BaseResult update(Friendlink flink) {
//        try {
//            partner.setSiteName(URLDecoder.decode(partner.getSiteName(), "utf-8"));
//            partner.setSiteDesc(URLDecoder.decode(partner.getSiteDesc(), "utf-8"));
//            partner.setSiteUrl(URLDecoder.decode(partner.getSiteUrl(), "utf-8"));
//            if (partner.getSort()==null){
//                partner.setSort(0);
//            }
//            partnerService.updatePartner(partner);
//        } catch (Exception e) {
//            return ResultInfoFactory.getErrorResultInfo();
//        }
//        return ResultInfoFactory.getSuccessResultInfo();
       return  null;
    }

    /**
     * 删除友链
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public BaseResult delete(@PathVariable Integer id){
        BaseResult br = new BaseResult();
        boolean result = iFriendlinkService.deleteById(id);
        if (result){
            br.setMsg("删除成功。"+id);
            br.setCode(ReturnCode.SUCCESS);
        }

        return  br;
    }
}
