package test.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2016/11/7.
 */
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TestA.class,TestB.class,TestC.class);
//        ctx.regester(TestA.class);
        TestD testD = ctx.getBean(TestD.class);
        testD.printy();
    }
}
