package javaee.test;

import javaee.JuiceMaker;
import javaee.annotation.Role;
import javaee.annotation.RoleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springJuice.xml");
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());
        ctx.close();
    }

    @org.junit.Test
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RoleConfig.class);
        Role role = ctx.getBean(Role.class);
        System.out.println(role.getName());
    }
}
