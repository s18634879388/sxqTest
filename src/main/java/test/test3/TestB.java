package test.test3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/11/7.
 */
@Configuration
public class TestB {
    private String bname;
    private int bage;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getBage() {
        return bage;
    }

    public void setBage(int bage) {
        this.bage = bage;
    }
    @Bean(name = "testb")
    public TestB getTb(){
        return  new TestB();
    }
}
