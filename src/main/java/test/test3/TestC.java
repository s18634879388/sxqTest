package test.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/11/7.
 */
@Configuration
public class TestC {
    @Autowired
    @Qualifier(value = "testa")
    private TestA testA;
    @Autowired
    @Qualifier(value = "testb")
    private TestB testB;

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }

    @Bean
    public TestD getTest(){
        TestD testD = new TestD();
        testD.setTestA(testA.getTa());
        testD.setTestB(testB.getTb());
        return testD;
    }
    public void printy(){
        System.out.println("==============");
    }
}
