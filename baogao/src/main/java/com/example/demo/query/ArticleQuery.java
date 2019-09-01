package com.example.demo.query;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by 25131 on 2019/8/21.
 */
@Data
@ToString
public class ArticleQuery extends PageRequest {
    private Integer id;

    private Date creatTime;

    private String gmtName;

    private Date gmtTime;

    private String creatName;

    private String title;

    private String author;

    private String avatar;

    private Date pubTime;

    private String originUrl;

    private String articleId;

    private String content;
}
