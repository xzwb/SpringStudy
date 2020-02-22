package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import profile.impl.Apple;
import profile.impl.Banana;
import profile.impl.Cookie;

@Configuration
public class FoodConfig {
    @Bean
    @Profile("apple")
    public Food apple() {
        return new Apple();
    }

    @Bean
    @Profile("banana")
    public Food banana() {
        return new Banana();
    }

    @Bean
    @Profile("cookie")
    public Food cookie() {
        return new Cookie();
    }
}
