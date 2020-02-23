package aop;


import org.aspectj.ajdt.internal.compiler.ast.Proceed;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 创建环绕通知方法
 */
@Aspect
public class Audience2 {
    @Pointcut("execution(* aop.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("关手机");
            System.out.println("感谢");
            proceedingJoinPoint.proceed();
            System.out.println("OK!! OK!! OK!!");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
