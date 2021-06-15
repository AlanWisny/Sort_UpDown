package com.company;

public class StrategyA extends StringWindowImp {


    @Override
    public void drawBorder(int x, int y) {
        System.out.println("Strategy A drawBorder called.");
    }

    @Override
    public void drawString(String S) {
        System.out.println("Strategy A drawString called.");
    }
}
