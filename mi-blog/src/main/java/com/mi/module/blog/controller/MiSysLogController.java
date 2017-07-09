package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.IMiSysLogService;
import com.mi.module.blog.entity.MiSysLog;



/**
 *
 * 操作日志; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/miSysLog")
public class MiSysLogController {

    @Autowired
    IMiSysLogService iMiSysLogService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public MiSysLog selectById(@RequestParam String id){
        MiSysLog entity = iMiSysLogService.selectById(id);
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
