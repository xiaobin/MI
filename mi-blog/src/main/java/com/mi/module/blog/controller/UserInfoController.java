package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.IUserInfoService;
import com.mi.module.blog.entity.UserInfo;



/**
 *
 * 用户详细; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/userInfo")
public class UserInfoController {

    @Autowired
    IUserInfoService iUserInfoService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public UserInfo selectById(@RequestParam String id){
        UserInfo entity = iUserInfoService.selectById(id);
        return entity;
    }

    /** insert **/
    @RequestMapping(value = "insert")
    public void insert(){

    }

    /** delete **/
    @RequestMapping(value = "delete")
    public void delete(){

    }

    /** update **/
    @RequestMapping(value = "update")
    public void update(){

    }

}
