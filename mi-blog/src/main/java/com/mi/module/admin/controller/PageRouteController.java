package com.mi.module.admin.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.mi.module.blog.entity.User;
import com.mi.module.blog.entity.UserInfo;
import com.mi.module.blog.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    /** 首页**/
    @RequestMapping("/")
    public String home(Model model){
        //后期参数定义 做成多博客系统
        UserInfo uInfo = iUserInfoService.selectByUserId("1");
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
