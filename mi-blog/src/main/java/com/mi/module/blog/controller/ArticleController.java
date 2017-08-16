package com.mi.module.blog.controller;

import com.mi.data.vo.ArticleVo;
import com.mi.data.vo.Pager;
import com.mi.module.blog.entity.Article;
import com.mi.module.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
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
     *
     * @param model
     * @return
     */
    @RequestMapping("/load")
    public String loadArticle(Pager<Article> pager, Model model) {
        List<ArticleVo> articleList = iArticleService.selectArticleList(pager);
        model.addAttribute("articleList", articleList);
        return "blog/part/articleSummary";
    }

    /**
     * 全局搜索
     *
     * @param keyword 关键字
     * @param model
     * @return
     */
    @RequestMapping("/content/search")
    public String search(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        System.err.println("" + keyword);
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("keyword", keyword);
        List<Article> articleList = iArticleService.selectArticleListByKeywords(paramMap);
        model.addAttribute("articleList", articleList);
        return "blog/part/search-info";
    }

//    /**
//     * 加载文章
//     * 包括总标签数
//     * 总文章数量
//     * 分类及每个分类文章数量
//     * 友链集合
//     *
//     * @return
//     */
//    @RequestMapping("/details/{articleId}")
//    public String loadArticle(@PathVariable Integer articleId, Model model){
//        ArticleVo articleCustom = articleService.getArticleCustomById(articleId);
//        //新增判断，当文章不存在或文章不展示的情况下，会跳转到404页面
//        if (articleCustom == null){
//            return  "redirect:/404";
//        }
//
//        //当前文章的所有信息
//        List<Partner> partnerList = partnerService.findAll();
//        List<CategoryCustom> categoryList = categoryService.initCategoryList();
//        //上一篇
//        Article lastArticle = articleService.getLastArticle(articleId);
//        //下一篇
//        Article nextArticle = articleService.getNextArticle(articleId);
//        //增加浏览量
//        articleService.addArticleCount(articleId);
//        //获取文章总数量
//        int articleCount = articleService.getArticleCount();
//        //标签总数量
//        int tagCount = tagService.getTagCount();
//
//        UserInfo userInfo = userService.getUserInfo();
//        model.addAttribute("lastArticle",lastArticle);
//        model.addAttribute("nextArticle",nextArticle);
//        model.addAttribute("article",articleCustom);
//        model.addAttribute("categoryCount",categoryList.size());
//        model.addAttribute("articleCount",articleCount);
//        model.addAttribute("tagCount",tagCount);
//        model.addAttribute("categoryList",categoryList);
//        model.addAttribute("partnerList",partnerList);
//        model.addAttribute("userInfo",userInfo);
//        return "blog/article";
//    }


}
