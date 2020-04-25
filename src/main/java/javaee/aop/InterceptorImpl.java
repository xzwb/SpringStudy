package javaee.aop;

public class InterceptorImpl implements Interceptor {
    @Override
    public void before(Object o) {
        System.out.println("运行前before");
    }

    @Override
    public void after(Object o) {
        System.out.println("after");
    }

    @Override
    public void afterReturning(Object o) {
        System.out.println("afterReturning");
    }

    @Override
    public void afterThrowing(Object o) {
        System.out.println("afterThrowing");
    }
}
