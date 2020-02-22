package food;

import food.impl.Cookie;
import food.impl.IceCream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EatFoodConfig.class)
public class EatFoodTest {
    @Autowired
    //@Qualifier("cold")
    @Cold
    @Sweet
    EatFood eatFood;

    @Autowired
    @Cold
    @Sweet
    EatFood eatFood2;

    @Test
    public void eat() {
        eatFood.eat();
        System.out.println(eatFood == eatFood2);
    }
}
