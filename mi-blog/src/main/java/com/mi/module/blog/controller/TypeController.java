package com.mi.module.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mi.module.blog.service.ITypeService;
import com.mi.module.blog.entity.Type;



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

    /** selectById **/
    @RequestMapping(value = "selectById")
    public Type selectById(@RequestParam String id){
        Type entity = iTypeService.selectById(id);
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
