//package test.elasticsearchtest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//
///**
// * Created by sxq111 on 2016/9/4.
// */
//@Service
//public class PostServiceImpl implements PostService {
//    @Autowired
//    private PostRepository postRepository;
//
//    @Override
//    public Post save(Post post) {
//        postRepository.save(post);
//        return post;
//    }
//
//    @Override
//    public Post findOne(String id) {
//        return postRepository.findOne(id);
//    }
//
//    @Override
//    public Iterable<Post> findAll() {
//        return postRepository.findAll();
//    }
//
//    @Override
//    public Page<Post> findByTagsName(String tagName, PageRequest pageRequest) {
//        return postRepository.findByTagsName(tagName,pageRequest);
//    }
//}
