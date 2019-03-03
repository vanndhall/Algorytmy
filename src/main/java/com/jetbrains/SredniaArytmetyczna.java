package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SredniaArytmetyczna {
    public static void main(String[] args)throws IOException {
        int tab[] ={1,2,3,4,5,6,7,8,9,10};
        sredniaArytmetyczna(tab);

    }

    static void sredniaArytmetyczna(int[] zbior) {
        float result = 0;
        for (int x : zbior) {
            result += x;
        }
        System.out.println("srednia to:" + result / zbior.length);
    }
}
