package condition.impl;

import condition.Food;

public class Apple implements Food {
    @Override
    public void eat() {
        System.out.println("eating good apples......");
    }
}
