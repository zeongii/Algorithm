package com.example.algorithm.algorithm01;

public class practice0331 {

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;

    }

    static int min3(int a, int b, int c) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;


        return min;
    }


    static int min4 (int a, int b, int c, int d) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }




}
