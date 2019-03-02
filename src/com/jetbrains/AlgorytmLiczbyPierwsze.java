package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorytmLiczbyPierwsze {
    public static void main(String[] args) throws IOException {
        int liczba;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytm Liczby Pierwszej");
        System.out.println("Wpisz liczbę: ");
        liczba = Integer.parseInt(br.readLine());
        boolean r = LiczbaPierwsza(liczba);
        while(LiczbaPierwsza(liczba)!=false) {
          liczba--;
            System.out.println("Liczba pierwsza:" + r);
        }
    }
    static boolean LiczbaPierwsza(int Num){

        if (Num < 2) return false;
        else if (Num < 4) return true;
        else if (Num % 2 == 0) return false;
        else if (Num % 3 == 0) return false;
        else for (int u = 3; u < Num / u; u += 2) // u+=2 daje liczbe pierwsza np 15. nie można by zrobić u*=2?
            {

                if (Num % u == 0) return false;

            }
        return true;
    }
}
