package test.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import test.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/1.
 */
@Configuration
public class MyBatisConfiguration {
    @Autowired
    CustomDataSourceProperties properties;

    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    @Bean
    public UserMapper mysqlTestTaskMapper() {
        return sqlSessionTemplate.getMapper(UserMapper.class);
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws JSONException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.properties.getClassLoader())
                .driverClassName(this.properties.getDriverClassName())
                .url(this.properties.getUrl())
                .username(this.properties.getUsername())
                .password(this.properties.getPassword());

        bean.setDataSource(factory.build());

        String mapperJsonText = this.properties.getMappers();
        JSONArray list = new JSONArray(mapperJsonText);
        List<Resource> resourceList = new ArrayList();
        ClassPathResource classPathResource;
        for (int i = 0; i < list.length(); i++) {
            classPathResource = new ClassPathResource(this.properties.getPath() + list.getString(i));
            resourceList.add(classPathResource);
        }

        Resource[] resources = resourceList.toArray(new Resource[]{});
        bean.setMapperLocations(resources);
        try {
            sqlSessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return sqlSessionFactory;
    }
}
