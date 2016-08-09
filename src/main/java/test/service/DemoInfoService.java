package test.service;

import test.entity.DemoInfo;

/**
 * Created by Administrator on 2016/8/4.
 */
public interface DemoInfoService {
    public DemoInfo findById(long id);
    public void deleteFromCache(long id);
    void test();
}
