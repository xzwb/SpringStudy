package aop;

import aop.impl.ThankImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience3 {
    @DeclareParents(value = "aop.Performance+",
                    defaultImpl = ThankImpl.class)
    public static Thank thank;

    @Pointcut("execution(* aop.Performance.perform(int))" + "&& args(number)")
    public void performance(int number) {}

    @Before("performance(number)")
    public void count(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }
}
