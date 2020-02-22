package food.impl;

import food.Cold;
import food.EatFood;
import food.Sweet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")
@Cold
@Sweet
public class IceCream implements EatFood {
    @Override
    public void eat() {
        System.out.println("eating iceCream....");
    }
}
