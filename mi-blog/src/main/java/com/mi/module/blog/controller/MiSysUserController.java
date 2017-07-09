package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.IMiSysUserService;
import com.mi.module.blog.entity.MiSysUser;



/**
 *
 * ϵͳ 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/miSysUser")
public class MiSysUserController {

    @Autowired
    IMiSysUserService iMiSysUserService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public MiSysUser selectById(@RequestParam String id){
        MiSysUser entity = iMiSysUserService.selectById(id);
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
