package com.mi.module.blog.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.mi.module.blog.mapper.ArticleMapper;
import com.mi.module.blog.service.IArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 
 * 文章; InnoDB free: 11264 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Map> selectArticleArchiveList() {
        return articleMapper.selectArticleArchiveList();
    }

    @Override
    public void initPage(Pager pager) {
        EntityWrapper<Article> ew = new EntityWrapper<Article>();
        int count = articleMapper.selectCount(ew);
        pager.setTotalCount(count);
    }

    @Override
    public List<Article> selectArticleListByKeywords(Map map) {
        return articleMapper.selectArticleListByKeywords(map);
    }
}
