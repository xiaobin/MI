package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.ITagService;
import com.mi.module.blog.entity.Tag;

import java.util.List;


/**
 *
 * 文章标签; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/tag")
public class TagController {

    @Autowired
    ITagService iTagService;

    /**
     * 通过tag获取文章列表
     * @param pager 分页信息
     * @param tagId 标签id
     * @param model 数据视图
     * @return
     */

//    @RequestMapping("/load/{tagId}")
//    public String loadArticleByTag(Pager pager, @PathVariable Integer tagId, Model model){
//        List<ArticleCustom> articleList = tagService.loadArticleByTag(pager,tagId);
//        if (!articleList.isEmpty()){
//            model.addAttribute("articleList",articleList);
//            model.addAttribute("pager",pager);
//            //2017-05-07修复获取tag名称错误的问题,不应该从articlelist中取,因为每篇文章可能有多个tag
//            model.addAttribute("tagName",tagService.getTagById(tagId).getTagName());
//        }
//
//        return "blog/part/tagSummary";
//    }


}
