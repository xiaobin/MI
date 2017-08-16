package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.IFriendlinkService;
import com.mi.module.blog.entity.Friendlink;



/**
 *
 * 友情链接; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/friendlink")
public class FriendlinkController {

    @Autowired
    IFriendlinkService iFriendlinkService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public Friendlink selectById(@RequestParam String id){
        Friendlink entity = iFriendlinkService.selectById(id);
        return entity;
    }



}
