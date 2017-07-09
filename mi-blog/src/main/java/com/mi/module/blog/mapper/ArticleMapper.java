package com.mi.module.blog.mapper;

import com.mi.module.blog.entity.Article;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 *
 * 文章; InnoDB free: 11264 kB Mapper 接口
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
public interface ArticleMapper extends BaseMapper<Article> {

    List<Map> selectArticleArchiveList();

    List<Article> selectArticleListByKeywords(Map map);
}