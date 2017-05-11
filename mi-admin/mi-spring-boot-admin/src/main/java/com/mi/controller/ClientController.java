package com.mi.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/5/2.
 */
@RestController
public class ClientController {

    private final Logger log = Logger.getLogger(ClientController.class);


    @RequestMapping("/hii")
    public String hello1(@RequestParam String name){
        System.err.println("-----------------------------");
        return "Hello !!   "+name + " ,I here in port  ";
    }
}
