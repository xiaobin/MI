package com.mi.module.base.service.impl;

import com.mi.module.base.entity.User;
import com.mi.module.base.mapper.UserMapper;
import com.mi.module.base.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 博客用户; InnoDB free: 3072 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
