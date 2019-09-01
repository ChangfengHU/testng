package com.example.demo.result;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Description: ���������ͷ�����Ϣ1
 */
@Data
@ToString
public class ArticleDTO extends RequestData {
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