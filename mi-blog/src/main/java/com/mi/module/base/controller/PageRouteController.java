package com.mi.module.base.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mi.data.vo.Pager;
import com.mi.data.vo.TypeVo;
import com.mi.module.blog.entity.Friendlink;
import com.mi.module.blog.entity.Tag;
import com.mi.module.blog.entity.Type;
import com.mi.module.blog.entity.UserInfo;
import com.mi.module.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.tags.form.InputTag;

import java.util.List;
import java.util.Map;

/**
 * 页面路由控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/7/9.
 */
@Controller
public class PageRouteController {

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private IFriendlinkService iFriendlinkService;

    @Autowired
    private IArticleService iArticleService;

    @Autowired
    private ITagService iTagService;

    @Autowired
    private ITypeService iTypeService;

    /******************** 博客后台 ********************/



    /**跳转到友链展示页面
     * @return
     */
    @RequestMapping("/admin/flink/list")
    public String flinkPage(Model model){
        UserInfo userInfo =  iUserInfoService.selectByUserId("1");
        model.addAttribute("userInfo",userInfo);
        return "admin/flink/flinkList";
    }

    /**
     * 跳转到分类列表页面
     * @param model
     * @return
     */
    @RequestMapping("/admin/type/list")
    public String typePage(Model model){
        UserInfo userInfo =  iUserInfoService.selectByUserId("1");
        model.addAttribute("userInfo",userInfo);
        return "admin/type/typeList";
    }

    /**
     * 跳转标签展示页面
     * @param model
     * @return
     */
    @RequestMapping("/admin/tag/list")
    public String tagPage(Model model) {
        UserInfo userInfo =  iUserInfoService.selectByUserId("1");
        model.addAttribute("userInfo",userInfo);
        return "admin/tag/tagList";
    }

    /** 文章首页 **/
    @RequestMapping("/admin/article/list")
    public String articlePage(Model model){
        EntityWrapper<Tag> eTag = new  EntityWrapper();
        EntityWrapper<Type> eType = new  EntityWrapper();

        List<Tag> tagList = iTagService.selectList(eTag);
        List<Type> typeList = iTypeService.selectList(eType);
        UserInfo userInfo =  iUserInfoService.selectByUserId("1");

        model.addAttribute("userInfo",userInfo);
        model.addAttribute("tagList",tagList);
        model.addAttribute("typeList",typeList);
        return "admin/article/articleList";
    }
      /** 后台首页（文章） **/
    @RequestMapping("/admin/home")
    public String homePage(){
        return "redirect:/admin/index";
    }
    /** 后台首页内容 **/
    @RequestMapping("/admin/index")
    public String mainPage(Model model){
        UserInfo userInfo =  iUserInfoService.selectByUserId("1");
        model.addAttribute("userInfo",userInfo);
        return "admin/index";
    }


    /******************** 博客主页 ********************/



    /** 初始化主页分页信息 **/
    @RequestMapping("/home/articles/load")
    @ResponseBody
    public Pager loadArticlePager(Pager pager) {
        iArticleService.initPage(pager);
        return pager;
    }

    /** 首页**/
    @RequestMapping("/")
    public String home(Model model){
        //后期参数定义 做成多博客系统
        UserInfo uInfo = iUserInfoService.selectByUserId("1");
        model.addAttribute("userInfo",uInfo);
        //友情链接
        List<Friendlink> fLinkList = iFriendlinkService.selectAllList();
        model.addAttribute("fLinkList",fLinkList);
        //类别
        List<TypeVo> typeList = iTypeService.initTypeList();
        model.addAttribute("typeList",typeList);
//        model.addAttribute("typeCount",typeList.size());




        //获取归档列表
        List<Map> archiveList = iArticleService.selectArticleArchiveList();
        model.addAttribute("archiveList",archiveList);


        model.addAttribute("articleCount",1);
        model.addAttribute("tagCount",1);



        return "blog/index";
    }
    /** 登录页面 **/
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
    /** thymeleaf 使用介绍 **/
    @RequestMapping("/thymeleaf")
    public String thymeleafPage(){
        return "blog/thymeleaf";
    }

}
