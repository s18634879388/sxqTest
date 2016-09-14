package test.estest2;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by Administrator on 2016/9/14.
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article,Long> {

}
