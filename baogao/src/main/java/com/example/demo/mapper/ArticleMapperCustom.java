package com.example.demo.mapper;


import com.example.demo.pojo.Article;
import com.example.demo.query.ArticleQuery;
import com.example.demo.result.ArticleDTO;
import com.example.demo.utils.MyMapper;

public interface ArticleMapperCustom extends MyMapper<Article> {


    /**
     * 根据id
     * @param articleQuery
     * @return
     */
    public ArticleDTO queryArticleById(ArticleQuery articleQuery);


}