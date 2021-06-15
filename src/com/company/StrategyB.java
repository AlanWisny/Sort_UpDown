package com.company;

public class StrategyB extends StringWindowImp {

    @Override
    public void drawBorder(int x, int y) {
        System.out.println("Strategy B drawBorder called.");

    }

    @Override
    public void drawString(String S) {
        System.out.println("Strategy B drawString called.");
    }
}
