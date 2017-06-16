package com.mi.service.Impl;

import com.mi.mapper.SysUserMapper;
import com.mi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<Map> getSysUser() {
        return sysUserMapper.getSysUser();
    }
}
