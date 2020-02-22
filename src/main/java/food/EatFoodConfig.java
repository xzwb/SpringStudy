package food;

import food.impl.Cookie;
import food.impl.Dumping;
import food.impl.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan
public class EatFoodConfig {
    @Bean
    public EatFood iceCream() {
        return new IceCream();
    }

    @Bean
    public EatFood cookie() {
        return new Cookie();
    }

    @Bean
    public EatFood dumping() {
        return new Dumping();
    }
}
