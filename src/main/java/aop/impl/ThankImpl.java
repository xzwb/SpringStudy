package aop.impl;

import aop.Thank;

public class ThankImpl implements Thank {
    @Override
    public void thanks() {
        System.out.println("say thank...!!!");
    }
}
