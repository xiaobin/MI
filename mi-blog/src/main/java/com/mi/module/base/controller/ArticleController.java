package com.mi.module.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.base.service.IArticleService;
import com.mi.module.base.entity.Article;



/**
 *
 * 文章; InnoDB free: 3072 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-04.
 */
@RestController
@RequestMapping("/base/article")
public class ArticleController {

    @Autowired
    IArticleService iArticleService;

    /** selectById **/
    @RequestMapping(value = "selectById")
    public Article selectById(@RequestParam String id){
        Article entity = iArticleService.selectById(id);
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
