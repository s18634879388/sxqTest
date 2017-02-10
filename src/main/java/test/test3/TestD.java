package test.test3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/7.
 */
public class TestD {
    private TestA testA;
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
    public void printy(){
        System.out.println("==============");
    }
}
