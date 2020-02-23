package aop;

import aop.impl.PerformanceImpl;
import aop.impl.ThankImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class PerformanceConfig {
//    @Bean
//    public Audience audience() {
//        return new Audience();
//    }

//    @Bean
//    public Audience2 audience2() {
//        return new Audience2();
//    }

    @Bean
    public Audience3 audience3() {
        return new Audience3();
    }

    @Bean
    public Performance performance() {
        return new PerformanceImpl();
    }
}
