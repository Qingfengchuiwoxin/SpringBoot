package com.qfcwx.springbootelasticsearch.controller;

import com.qfcwx.springbootelasticsearch.pojo.Article;
import com.qfcwx.springbootelasticsearch.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ArticleController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 15:54
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api")
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @GetMapping("/article")
    public String save() {
        Article article = new Article();
        article.setId(3L);
        article.setPv(88);
        article.setContent("关于elastic的讲解");
        article.setTitle("初始elasticsearch");
        article.setSummary("搜索");
        repository.save(article);
        return "添加成功";
    }

    @GetMapping("/search")
    public Object search(String title) {
        QueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);

        Iterable<Article> list = repository.search(queryBuilder);
        return list;
    }
}
