package aopUseXml;

import aopUseXml.impl.PerformanceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class PerformanceConfig {
    @Bean
    public Performance performance() {
        return new PerformanceImpl();
    }

//    @Bean
//    public Audience audience() {
//        return new Audience();
//    }
}
