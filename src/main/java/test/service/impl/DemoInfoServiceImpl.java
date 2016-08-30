package test.service.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import test.entity.DemoInfo;
import test.repository.DemoInfoRepository;
import test.service.DemoInfoService;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/8/4.
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
    @Resource
    private DemoInfoRepository demoInfoRepository;
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Cacheable(value = "demoInfo")
    @Override
    public DemoInfo findById(long id) {
        System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id=" + id);
        return demoInfoRepository.findOne(id);
    }

    @CacheEvict(value = "demoInfo")
    @Override
    public void deleteFromCache(long id) {

    }

    @CacheEvict(value = "demoInfo")
    @Override
    public void test() {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("mykey4", "random1=" + Math.random());
        System.out.println(valueOperations.get("mykey4"));

    }

//    //String
//    @Override
//    public void mytest() {
//        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
//        valueOperations.set("1994","---");
//        System.out.println(valueOperations.get("1994"));
//    }


//    //List
//    @Override
//    public void mytest(){
//        ListOperations<String, String> valueOperations = redisTemplate.opsForList();
//        valueOperations.leftPush("1994","111");
//        valueOperations.leftPush("1994","222---");
//        List<String> list = valueOperations.range("1994",0,-1);
//        for (String str:list
//             ) {
//            System.out.println(str+">>>>----------");
//        }
//    }


//    //Zset
//    @Override
//    public void mytest() {
//        ZSetOperations<String, String> valueOperations = redisTemplate.opsForZSet();
//        valueOperations.add("1994","123",1);
//        valueOperations.add("1994","456",5);
//        valueOperations.add("1994","457",6);
//        valueOperations.add("1994","458",7);
//        Set<String> set = valueOperations.rangeByScore("1994",0,10);
//        for (String str:set
//             ) {
//            System.out.println(str+"--------------");
//        }
//    }

/*    //Hash
    @Override
    public void mytest(){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("1994","11","22--");
        hashOperations.put("1994","22","33--");
        Set<String> set = hashOperations.keys("1994");
        for (String str:set
             ) {
            System.out.println(hashOperations.get("1994",str));
        }

    }*/

    @Override
    public void mytest(){
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
//        ZSetOperations zSetOperations1 = redisTemplate.opsForZSet();
//        SetOperations setOperations = redisTemplate.opsForSet();
//
//        if (zSetOperations.rank("1994","sxq111")!=null) {
//            if (zSetOperations1.rank("rank","sxq111")!=null){
//                zSetOperations1.add("rank","sxq111",zSetOperations1.score("1994","sxq111")+1);
//
//            }else {
//                zSetOperations1.add("rank","sxq111",1);
//            }
//
//        }else {
//            setOperations.add("cut",zSetOperations1.score("1994","sxq111"));
//            zSetOperations1.remove("rank","sxq111");
//
//        }
        zSetOperations.add("1994","sxq111",5);
        zSetOperations.add("1994","sxq111",10);
        zSetOperations.add("1994","sxq222",6);
        zSetOperations.add("1994","sxq222",11);


    }
}
