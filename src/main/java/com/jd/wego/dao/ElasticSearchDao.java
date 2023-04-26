package com.jd.wego.dao;

import com.jd.wego.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ElasticSearchDao extends ElasticsearchRepository<Article, Integer> {
}
