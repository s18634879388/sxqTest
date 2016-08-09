package test.service.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import test.entity.DemoInfo;
import test.repository.DemoInfoRepository;
import test.service.DemoInfoService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/8/4.
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
    @Resource
    private DemoInfoRepository demoInfoRepository;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Cacheable(value="demoInfo")
    @Override
    public DemoInfo findById(long id) {
        System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
        return demoInfoRepository.findOne(id);
    }
    @CacheEvict(value = "demoInfo")
    @Override
    public void deleteFromCache(long id) {

    }
    @CacheEvict(value="demoInfo")
    @Override
    public void test() {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("mykey4","random1="+Math.random());
        System.out.println(valueOperations.get("mykey4"));

    }
}
