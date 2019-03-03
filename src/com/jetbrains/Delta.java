package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delta {

    public static void main(String[] args) throws IOException {
        int a,b,c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Program algorytmu obliczania Miejsc zerowych:");
        System.out.println("Wpisz liczbę a:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Wpisz liczbe b:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Wpisz liczbe b:");
        c = Integer.parseInt(br.readLine());

        int delta =0;
        delta= Delta(a,b,c);
        String wynik = Sprawdz(delta);
        System.out.println(wynik);

    }

    public static int Delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static String Sprawdz(int delta) {
        String result = "";
        if (delta == 0)
            result = "jedno miejsce";

        if (delta > 0)
            result = "dwa miejsca";

        if (delta < 0)
            result = "brak miejsc zerowych";

        return result;
    }
 // skrot listowania ctrl+alt+l

}
/*
alternatywa metody Algorytmu Sprawdz:
if(delta,0)
result = "brak miejsc zerowych";
else if(delta>0)
result = "dwa miejsca";
else
result = "jedno miejscce";

 */
