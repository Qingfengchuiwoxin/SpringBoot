package com.qfcwx.springbootelasticsearch.repository;

import com.qfcwx.springbootelasticsearch.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ArticleRepository
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/17 15:46
 * @Version 1.0
 **/
@Component
public interface ArticleRepository extends ElasticsearchRepository<Article,Long> {


}
