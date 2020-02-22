package food.impl;

import food.EatFood;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cookie implements EatFood {
    @Override
    public void eat() {
        System.out.println("eating cookie....");
    }
}
