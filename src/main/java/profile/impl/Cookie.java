package profile.impl;

import profile.Food;

public class Cookie implements Food {
    @Override
    public void eat() {
        System.out.println("eating cookie....");
    }
}
