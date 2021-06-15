package com.company;

import java.util.Scanner;

public abstract class Sort {
    public final void sort (int v[], int n) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose 1 for up, 2 for down.");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                sortU(v, n);
                break;
            case 2:
                sortD(v, n);
                break;
            default:
                break;
        }
    }

    public abstract void sortD ( int v[], int n );

    public abstract void sortU ( int v[], int n );
}
