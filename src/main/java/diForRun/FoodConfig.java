package diForRun;

import diForRun.impl.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/apple.properties")
public class FoodConfig {
    @Autowired
    Environment environment;

    @Bean
    public Food apple() {
        return new Apple(environment.getProperty("apple.foodName"));
    }
}
