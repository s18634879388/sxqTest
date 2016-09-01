package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.entity.DemoInfo;
import test.mapper.UserMapper;
import test.service.DemoInfoService;

import java.sql.Driver;

/**
 * Created by Administrator on 2016/8/4...........
 */
@Controller
public class DemoInfoController {
    @Autowired
    DemoInfoService demoInfoService;
    @Autowired
    UserMapper userMapper;

    @Value("${spring.datasource.url}")
    private String url;
    @RequestMapping("/test")
    public @ResponseBody String test(){
        DemoInfo loaded = demoInfoService.findById(1);
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById(1);
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById(2);
        loaded = demoInfoService.findById(2);

        System.out.println("loaded2="+loaded);
        return"ok";
    }
    @RequestMapping("/delete")
    public @ResponseBody String delete(long id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }
    @RequestMapping("/test1")
    public @ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }
    @RequestMapping("/mytest")
    public @ResponseBody String mytest(){
        demoInfoService.mytest();
        return "ok";
    }
    @RequestMapping("/hehehe")
    public @ResponseBody String hehehe(){
        DemoInfo demoInfo = userMapper.getUser(1);
        System.out.println(demoInfo.getId()+"-------"+demoInfo.getName()+"----------"+demoInfo.getPwd());
        System.out.println("--------------------------------------------"+url);
        return "heihei";
    }

}
