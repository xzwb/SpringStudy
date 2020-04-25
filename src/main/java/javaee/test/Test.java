package javaee.test;

import javaee.JuiceMaker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springJuice.xml");
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());
    }
}
