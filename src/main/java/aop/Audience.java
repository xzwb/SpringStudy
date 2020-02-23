package aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* aop.Performance.perform(..))")
    public void performance() {}

    //    @Before("execution(* aop.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phone");
    }

//    @Before("execution(* aop.Performance.perform(..))")
    @Before("performance()")
    public void takeSeats() {
        System.out.println("thanks seats");
    }

//    @AfterReturning("execution(* aop.Performance.perform(..))")
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("OK!! OK!! OK!!");
    }

//    @AfterThrowing("execution(* aop.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void sorry() {
        System.out.println("say sorry...");
    }
}
