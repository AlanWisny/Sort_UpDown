package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted extends Sort {
    private int[] list;
    private int n;

    public Sorted(int v[], int n) {
        this.list = v;
        this.n = n;
    }

    @Override
    public void sortD ( int v[], int n ) {
        for (int g = n/2; g>0; g/=2) {
            for (int i = g; i<n; i++) {
                for (int j =i-g; j>=0; j-=g) {
                    if (v[j] < v[j+g]) {
                        int temp = v[g];
                        v[j] = v[j+g];
                        v[j+g] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }

    @Override
    public void sortU( int v[], int n ) {
        for (int g = n/2; g>0; g/=2) {
            for (int i = g; i<n; i++) {
                for (int j =i-g; j>=0; j-=g) {
                    if (v[j] > v[j+g]) {
                        int temp = v[g];
                        v[j] = v[j+g];
                        v[j+g] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
