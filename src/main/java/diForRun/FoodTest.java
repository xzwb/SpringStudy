package diForRun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FoodConfig.class)
public class FoodTest {
    @Autowired
    Food food;

    @Test
    public void eat() {
        food.eat();
    }
}
