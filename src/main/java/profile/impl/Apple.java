package profile.impl;

import profile.Food;

public class Apple implements Food {
    @Override
    public void eat() {
        System.out.println("eating apple...");
    }
}
