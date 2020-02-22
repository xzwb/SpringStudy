package diForRun.impl;

import diForRun.Food;

public class Apple implements Food {
    String foodName;

    public Apple(String foodName) {
        this.foodName = foodName;
    }

    

    @Override
    public void eat() {
        System.out.println("we eat " + foodName);
    }
}
