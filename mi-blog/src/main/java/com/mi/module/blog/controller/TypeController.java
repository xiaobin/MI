package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.ITypeService;
import com.mi.module.blog.entity.Type;

import java.util.List;


/**
 *
 * 文章类型; InnoDB free: 11264 kB 控制器
 *
 * @author yesh
 *         (M.M)!
 *         Created by 2017-07-09.
 */
@RestController
@RequestMapping("/blog/type")
public class TypeController {

    @Autowired
    ITypeService iTypeService;

//
//    /**
//     * 获取某个标签的分页文章
//     * @param model
//     * @param pager
//     * @param categoryId
//     * @return
//     */
//    @RequestMapping("/load/{categoryId}")
//    public String loadArticleByCategory(Model model, Pager pager, @PathVariable Integer categoryId){
//        List<ArticleCustom> articleList = categoryService.loadArticleByCategory(pager,categoryId);
//        if (!articleList.isEmpty()){
//            model.addAttribute("articleList",articleList);
//            model.addAttribute("pager",pager);
//            model.addAttribute("categoryName",articleList.get(0).getCategoryName());
//        }
//        return "blog/part/categorySummary";
//    }

}
