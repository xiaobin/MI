package com.mi.module.base.service.impl;

import com.mi.module.base.entity.Log;
import com.mi.module.base.mapper.LogMapper;
import com.mi.module.base.service.ILogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 操作日志; InnoDB free: 3072 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {
	
}
