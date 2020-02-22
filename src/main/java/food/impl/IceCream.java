package food.impl;

import food.Cold;
import food.EatFood;
import food.Sweet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component
//@Qualifier("cold")
@Cold
@Sweet
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class IceCream implements EatFood {
    @Override
    public void eat() {
        System.out.println("eating iceCream....");
    }
}
