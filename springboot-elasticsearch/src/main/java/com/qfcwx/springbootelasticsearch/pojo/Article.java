package com.qfcwx.springbootelasticsearch.pojo;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @ClassName: Article
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 15:39
 * @Version 1.0
 **/
@Document(indexName = "blog",type = "article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String title;

    private String summary;

    private String content;

    private Integer pv;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

}
