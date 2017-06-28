package com.mi.module.common.controller;

import com.mi.config.redis.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Redis 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-06-28.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {


    @RequestMapping(value = "/test")
    public String test() {
        RedisUtil.set("name:", "MIYAOW");
        return RedisUtil.get("name").toString();
    }


}
