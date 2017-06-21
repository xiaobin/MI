package com.mi.controller;

import com.mi.model.SysLog;
import com.mi.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统操作日志控制器
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/21.
 */
@RestController
@RequestMapping(value = "mi/syslog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping(value = "/login")
    public String selectList(){

       SysLog sysLog =  sysLogService.selectById("1");
       return  null;

    }

    @RequestMapping(value = "/insert")
    public void insert(){
        SysLog sysLog = new SysLog();
        sysLog.setDescription("MIyaow");
        sysLogService.insert(sysLog);

    }

    @RequestMapping(value = "/selectById")
    public SysLog selectById(){
        SysLog sysLog = new SysLog();
        sysLog = sysLogService.selectById("e7849065235f42e08fd2f9a200c18be6");
        return sysLog;

    }


}
