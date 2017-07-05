package com.mi.module.base.controller;

import com.mi.common.model.BaseResult;
import com.mi.common.model.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.base.service.IUserService;
import com.mi.module.base.entity.User;



/**
 *
 * 博客用户; InnoDB free: 3072 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@RestController
@RequestMapping("/base/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping(value = "test")
    public BaseResult test(){
        BaseResult br;
        br = new BaseResult("数据", ReturnCode.SUCCESS);
        return br;
    }


    /** selectById **/
    @RequestMapping(value = "selectById")
    public User selectById(@RequestParam String id){
        User entity = iUserService.selectById(id);
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
