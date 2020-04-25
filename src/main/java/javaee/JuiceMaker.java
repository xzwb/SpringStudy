package javaee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMaker implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    private String beverageShop = null;
    private Source source = null;

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "这是一杯由" + beverageShop + "饮品店提供的" + source.getSize() + source.getSugar() + source.getFruit();
        return juice;
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + "自定义执行方法");
    }

    public void myDestroy() {
        System.out.println(this.getClass().getSimpleName() + "自定义销毁方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(this.getClass().getSimpleName() + "调用beanNameAware的setName方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "调用setBeanFactory方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "调用setApplicationContext方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "调用afterPropertiesSet方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "调用接口的destroy方法");
    }
}
