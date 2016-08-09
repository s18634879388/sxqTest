package test.repository;

import org.springframework.data.repository.CrudRepository;
import test.entity.DemoInfo;

/**
 * Created by Administrator on 2016/8/4.
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {

}
