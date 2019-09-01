package com.example.demo;

import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.ArticleMapperCustom;
import com.example.demo.mapper.MaterialMapper;
import com.example.demo.pojo.Article;
import com.example.demo.pojo.Material;
import com.example.demo.query.ArticleQuery;
import com.example.demo.result.ArticleDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 18:11
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    ArticleMapperCustom articleMapperCustom;

    @Autowired
    ArticleMapper       articleMapper;

    @Autowired
    MaterialMapper      materialMapper;
    //≤‚ ‘ ÷–¥sql,mapper
    @Test
    public void testCusMapper(){
        ArticleQuery article = new ArticleQuery();
        article.setId(334);
        ArticleDTO articleDTO = articleMapperCustom.queryArticleById(article);
        System.err.println(articleDTO.toString());
    }
    @Test
    public void testAutoMapper(){
        Article article = new Article();
        article.setId(6);
        Article article1 = articleMapper.selectOne(article);
        article1.setTitle("123213");
        articleMapper.updateByPrimaryKey(article1);
    }
    @Test
    public void testAutoMapper1(){
        Article article1 = new Article();
        article1.setId(5);
        article1.setTitle("12123");

    }
    @Test
    public void testAutoMapper2(){

        Article article2 = articleMapper.selectByPrimaryKey(334);
        System.out.println(article2);
    }
    @Test
    public void testAutoMapper3(){

        Material material = materialMapper.selectByPrimaryKey(1);
        System.out.println(material);
    }

}
