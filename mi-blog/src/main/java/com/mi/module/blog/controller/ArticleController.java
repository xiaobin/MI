package com.mi.module.blog.controller;

import com.mi.data.vo.Pager;
import com.mi.module.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.entity.Article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * 文章; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    IArticleService iArticleService;
    @Autowired
    IFriendlinkService iFriendlinkService;
    @Autowired
    ITypeService iTypeService;
    @Autowired
    ITagService iTagService;
    @Autowired
    IUserInfoService iUserInfoService;

    /**
     * 加载分页列表数据
     * @param model
     * @return
     */
    @RequestMapping("/load")
    public String loadArticle(Pager<Article> pager, Model model){

        return "blog/part/articleSummary";
    }

    /**
     * 全局搜索
     * @param keyword 关键字
     * @param model
     * @return
     */
    @RequestMapping("/content/search")
    public String search(@RequestParam(value = "keyword",required = false) String keyword,Model model) {
        System.err.println(""+keyword);
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("keyword",keyword);
        List<Article> articleList = iArticleService.selectArticleListByKeywords(paramMap);
        model.addAttribute("articleList",articleList);
        return "blog/part/search-info";
    }


}
