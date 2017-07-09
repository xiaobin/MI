package com.mi.module.base.controller;

import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Friendlink;
import com.mi.module.blog.entity.UserInfo;
import com.mi.module.blog.service.IArticleService;
import com.mi.module.blog.service.IFriendlinkService;
import com.mi.module.blog.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /******************** 博客后台 ********************/

    /** 文章首页 **/
    @RequestMapping("/admin/article/list")
    public String labelPage(Model model){


        model.addAttribute("userInfo",null);
        model.addAttribute("tagList",null);
        model.addAttribute("categoryList",null);
        return "admin/article/articleList";
    }
    /** 后台首页 **/
    @RequestMapping("/admin/home")
    public String homePage(){
        return "redirect:/admin/article/list";
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
        //友情链接
        List<Friendlink> fLinkList = iFriendlinkService.selectAllList();
        //获取归档列表
        List<Map> archiveList = iArticleService.selectArticleArchiveList();

        model.addAttribute("fLinkList",fLinkList);
        model.addAttribute("archiveList",archiveList);

        model.addAttribute("typeCount",0);
        model.addAttribute("articleCount",1);
        model.addAttribute("tagCount",1);

        model.addAttribute("userInfo",uInfo);

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
