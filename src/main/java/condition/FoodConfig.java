package condition;

import condition.impl.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {
    @Bean
    @Conditional(AppleCondition.class)
    public Food apple() {
        return new Apple();
    }
}
