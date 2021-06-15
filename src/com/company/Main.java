package com.company;

public class Main {


    public static void main(String[] args) {
        int[] list = {10, 5, 6, 4, 5};
        int i = 4;
        StringWindowImp A = new StrategyA();
        A.display(10, 5, "foo");


        StringWindowImp B = new StrategyB();
        B.display(25, 66, "cracker");

        Sort up = new Sorted(list, i);
        Sort down = new Sorted(list, i);

        up.sort(list, i);
        down.sort(list, i);

    }
}
