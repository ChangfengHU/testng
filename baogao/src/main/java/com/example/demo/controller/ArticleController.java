package com.example.demo.controller;

import com.example.demo.mapper.MaterialMapper;
import com.example.demo.pojo.Material;
import com.example.demo.query.ArticleQuery;
import com.example.demo.result.ArticleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 25131 on 2019/8/31.
 */
@RestController
@RequestMapping("material")
public class ArticleController {

    @Autowired
    private MaterialMapper materialMapper;
    @RequestMapping(value = "/searchAaterial" , method = { RequestMethod.POST, RequestMethod.GET })
    public Material searchArticle(ArticleQuery articleQuery ) {
        Material material = materialMapper.selectByPrimaryKey(articleQuery.getId());
        return material ;
    }
}
