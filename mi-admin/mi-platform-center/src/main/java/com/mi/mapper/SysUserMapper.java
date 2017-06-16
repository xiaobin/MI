package com.mi.mapper;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yesh
 *         (M.M)!
 *         Created by 2017/6/16.
 */
@Repository("sysUserMapper")
public interface SysUserMapper {

    @Select("select * from sys_user s where 1=1")
    List<Map> getSysUser();
}
