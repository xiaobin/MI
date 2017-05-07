package com.mi.controller;

import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Swagger 控制器案例模版
 * @author yesh
 *         (M.M)!
 *         Created by 2017/5/7.
 */
@RestController
public class SwaggerController {

    private static final Logger log = Logger.getLogger(SwaggerController.class);

    @RequestMapping(value = "hello" ,method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name",required = false) String name){
        return "Hello Swagger : my name is "+ name;
    }

}
