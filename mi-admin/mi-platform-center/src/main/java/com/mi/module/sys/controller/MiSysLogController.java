package com.mi.module.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.sys.service.IMiSysLogService;
import com.mi.module.sys.entity.MiSysLog;



/**
 *
 * 操作日志; InnoDB free: 4096 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-06-28.
 */
@RestController
@RequestMapping("/sys/miSysLog")
public class MiSysLogController {

    @Autowired
    IMiSysLogService iMiSysLogService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public MiSysLog getByid(@RequestParam String id){
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
