package javaee.aop;

public interface Interceptor {
    void before(Object o);
    void after(Object o);
    void afterReturning(Object o);
    void afterThrowing(Object o);
}
