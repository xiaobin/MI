package com.mi.controller;

import org.apache.http.HttpResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

/**
 * 服务提供控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/5/2.
 */
@Controller
public class ClientController {

    private final Logger log = Logger.getLogger(ClientController.class);

    @RequestMapping(value = "/login")
    public String loginSpringBootAdmin(@RequestParam String name){
        System.err.println("-----------------------------");
        return "Hello !!   "+name + " ,I here in port  ";
    }

    @RequestMapping("/hii")
    public String hello1(@RequestParam String name){
        System.err.println("-----------------------------");
        return "Hello !!   "+name + " ,I here in port  ";
    }
}
