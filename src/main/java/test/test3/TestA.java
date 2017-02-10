package test.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/11/7.
 */
@Configuration
public class TestA {
    private String aname;
    private int aage;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAage() {
        return aage;
    }

    public void setAage(int aage) {
        this.aage = aage;
    }
    @Bean(name = "testa")
    public TestA getTa(){
        return new TestA();
    }
}

//branch1

//master

//branch1   

//不pull进行提交

//  branch1111

//sssssss

