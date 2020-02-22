package profile.impl;

import profile.Food;

public class Banana implements Food {
    @Override
    public void eat() {
        System.out.println("eating banana.....");
    }
}
