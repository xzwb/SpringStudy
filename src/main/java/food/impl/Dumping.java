package food.impl;

import food.Cold;
import food.EatFood;
import food.Good;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("cold")
@Cold
@Good
public class Dumping implements EatFood {
    @Override
    public void eat() {
        System.out.println("eating dumping....");
    }
}
