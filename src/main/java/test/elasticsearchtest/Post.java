package test.elasticsearchtest;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by sxq111 on 2016/9/4.
 */
@Document(indexName = "post", type = "post", shards = 1, replicas = 0)
public class Post {
    @Id
    private String id;
    private String title;
    @Field(type= FieldType.Nested)
    private List<Tag> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}