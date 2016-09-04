package test.elasticsearchtest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by sxq111 on 2016/9/4.
 */

public class TestClass {
    @Autowired
    PostService postService;
    @Test
    public void testFindByTagsName() throws Exception {
        Tag tag = new Tag();
        tag.setId("1");
        tag.setName("tech");
        Tag tag2 = new Tag();
        tag2.setId("2");
        tag2.setName("elasticsearch");
        Post post = new Post();
        post.setId("1");
        post.setTitle("Bigining with spring boot application and elasticsearch");
        post.setTags(Arrays.asList(tag, tag2));
        postService.save(post);
        Post post2 = new Post();
        post2.setId("1");
        post2.setTitle("Bigining with spring boot application");
        post2.setTags(Arrays.asList(tag));
        postService.save(post);
        Page<Post> posts  = postService.findByTagsName("tech", new PageRequest(0,10));Page<Post> posts2  = postService.findByTagsName("tech", new PageRequest(0,10));Page<Post> posts3  = postService.findByTagsName("maz", new PageRequest(0,10));
        posts.getTotalElements();
        assertThat(posts.getTotalElements(), is(1L));
        assertThat(posts2.getTotalElements(), is(1L));
        assertThat(posts3.getTotalElements(), is(0L));

    }
}
