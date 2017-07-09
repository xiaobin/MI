package com.mi.module.blog.service.impl;

import com.mi.module.blog.entity.Type;
import com.mi.module.blog.mapper.TypeMapper;
import com.mi.module.blog.service.ITypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 文章类型; InnoDB free: 11264 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {
	
}
