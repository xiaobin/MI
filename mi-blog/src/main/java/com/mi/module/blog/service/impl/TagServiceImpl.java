package com.mi.module.blog.service.impl;

import com.mi.module.blog.entity.Tag;
import com.mi.module.blog.mapper.TagMapper;
import com.mi.module.blog.service.ITagService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 文章标签; InnoDB free: 11264 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {
	
}
