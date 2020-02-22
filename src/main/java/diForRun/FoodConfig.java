package diForRun;

import diForRun.impl.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {
    @Bean
    public Food apple() {
        return new Apple("apple");
    }
}
