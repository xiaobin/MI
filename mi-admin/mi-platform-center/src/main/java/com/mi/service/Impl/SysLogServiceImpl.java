package com.mi.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mi.mapper.SysLogMapper;
import com.mi.model.SysLog;
import com.mi.service.SysLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/21.
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper,SysLog> implements SysLogService{

    @Resource
    private SysLogMapper sysLogMapper;

}
