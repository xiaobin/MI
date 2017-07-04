package com.mi.module.base.service.impl;

import com.mi.module.base.entity.Article;
import com.mi.module.base.mapper.ArticleMapper;
import com.mi.module.base.service.IArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 文章; InnoDB free: 3072 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {
	
}
