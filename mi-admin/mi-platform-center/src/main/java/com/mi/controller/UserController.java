package com.mi.controller;

import com.mi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/16.
 */
@RestController
@RequestMapping(value = "/mi/user")
public class UserController {

    @Autowired
    private UserService userServices;

    @RequestMapping(value = "/getUser")
    public String getUser(){

        List<Map> map = userServices.getSysUser();
        System.err.println(map);
         return "1";
    }

}
