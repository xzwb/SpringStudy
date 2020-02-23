package aop.impl;

import aop.Performance;

public class PerformanceImpl implements Performance {
//    @Override
//    public void perform() {
//        System.out.println("start performance!");
//    }


    @Override
    public void perform(int number) {
        System.out.println("start ok!!!!");
    }
}
