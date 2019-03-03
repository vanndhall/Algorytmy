package algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorytmFibonacciego {
    public static void main(String[] args) throws IOException {

        int n=0, wynik=0, liczba, ciag, wynik1=wynik-1,wynik2=wynik1-1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytmu Fibonacciego:");
        System.out.println("Wpisz liczbę ciągu Fibonaciego: ");
        liczba = Integer.parseInt(br.readLine());


        for(int i=0;i<2;i++){
            wynik = 1;
            n++;
            System.out.println("N= "+n);
            System.out.println("Wynik= "+wynik);

        }
        while(wynik<=2) {
            wynik = wynik + 1;
            System.out.println("Numer = " + wynik);
        }
        for(int i = liczba;wynik<=liczba;wynik=(wynik1)+(wynik2))
            System.out.println("Numer2 =" + wynik);
        }

    }
