package com.mi.module.blog.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.mi.data.vo.ArticleCustom;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.mi.module.blog.entity.ArticleTag;
import com.mi.module.blog.entity.ArticleType;
import com.mi.module.blog.mapper.ArticleMapper;
import com.mi.module.blog.mapper.ArticleTagMapper;
import com.mi.module.blog.mapper.ArticleTypeMapper;
import com.mi.module.blog.service.IArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * 文章; InnoDB free: 11264 kB 服务实现类
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Slf4j
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleTagMapper articleTagMapper;
    @Resource
    private ArticleTypeMapper articleTypeMapper;


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

    @Override
    public List<ArticleCustom> selectArticleList(Pager<Article> pager) {
        return articleMapper.selectArticleList(pager);
    }

    @Override
    public List<Article> loadArticle(Map<String, Object> param) {
        return articleMapper.loadArticle(param);
    }

    @Override
    @Transactional
    public Integer insertArticle(Article article, String[] tags, String typeId) {

        String id = getRandomId();

        article.setArticleId(id);
        articleMapper.insert(article);


        throw new IllegalArgumentException("sang 已存在，数据将回滚");


//        ArticleType articleType = new ArticleType();
//        articleType.setArticleId(id);
//        articleType.setTypeId(typeId);
//        articleTypeMapper.insert(articleType);

//        for (int j = 0; j < tags.length; j++) {
//            ArticleTag articleTag = new ArticleTag();
//            articleTag.setArticleId(id);
//            articleTag.setTagId(tags[j]);
//            articleTagMapper.insert(articleTag);
//        }



    }



    private String getRandomId(){
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        String temp = sf.format(new Date());
        StringBuilder append = new StringBuilder().append(UUID.randomUUID()).append(temp);
        return append.toString();
    }
}
