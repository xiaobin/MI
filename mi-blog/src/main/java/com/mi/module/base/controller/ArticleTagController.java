package com.mi.module.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.base.service.IArticleTagService;
import com.mi.module.base.entity.ArticleTag;



/**
 *
 * 文章标签关联; InnoDB free: 3072 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@RestController
@RequestMapping("/base/articleTag")
public class ArticleTagController {

    @Autowired
    IArticleTagService iArticleTagService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public ArticleTag selectById(@RequestParam String id){
        ArticleTag entity = iArticleTagService.selectById(id);
        return entity;
    }

    /** insert **/
    @RequestMapping(value = "insert")
    public void insert(){

    }

    /** delete **/
    @RequestMapping(value = "delete")
    public void delete(){

    }

    /** update **/
    @RequestMapping(value = "update")
    public void update(){

    }

}
