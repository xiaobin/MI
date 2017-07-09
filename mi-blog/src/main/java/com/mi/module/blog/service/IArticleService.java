package com.mi.module.blog.service;

import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 *
 * 文章; InnoDB free: 11264 kB 服务接口
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
public interface IArticleService extends IService<Article> {

    /** 获取归档列表 **/
    List<Map> selectArticleArchiveList();

    /**
     * 初始化分页信息
     * @return
     * @param pager
     */
    void initPage(Pager pager);

    /**
     * 关键字查询文章
     * @param keyword 关键字
     * @return
     */
    List<Article> selectArticleListByKeywords(Map map);
}
