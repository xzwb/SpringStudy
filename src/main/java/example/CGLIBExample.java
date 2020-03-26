package example;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBExample implements MethodInterceptor {

    /**
     * 生成代理对象
     * @param c
     * @return
     */
    public Object getProxy(Class c) {
        // CGLIB enhancer增强类对象
        Enhancer enhancer = new Enhancer();
        // 设置增强类型
        enhancer.setSuperclass(c);
        // 定义代理逻辑对象为当前对象 要求事项MethodInterceptor接口
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param o 代理对象
     * @param method 方法
     * @param objects 参数
     * @param methodProxy 方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("调用后");
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        CGLIBExample example = new CGLIBExample();
        HelloImpl hello = (HelloImpl) example.getProxy(HelloImpl.class);
        hello.say("yyf");
    }
}