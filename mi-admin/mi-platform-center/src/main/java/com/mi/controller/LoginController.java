package com.mi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/14.
 */
@RestController
@RequestMapping(value = "/mi")
public class LoginController {

    @RequestMapping(value = "/login")
    public void Login(){

        System.err.println("111");
    }

}
