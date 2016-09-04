package test.elasticsearchtest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by sxq111 on 2016/9/4.
 */
public interface PostRepository extends ElasticsearchRepository<Post, String>{
    Page<Post> findByTagsName(String name, Pageable pageable);
}
