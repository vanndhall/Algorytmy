package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BubbleSort {
    public static int liczba;
    public static int[] tab;
    public static void main(String[] args) throws IOException {

        System.out.println("Program algorytmu sortowania Bombelkowego z domyślną liczbą sorotowania :");
        int[] myList ={2,1,3,7,1,2};
        System.out.println(myList.length);
        int[] sorted = bubbleSort(myList);
        for(int x: sorted)
            System.out.println(""+x);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytmu sortowania Bąbelkowego z podaną wielkością tablicy do posortowania::");
        System.out.println("Wpisz wielkosc tablicy do posortowania: ");
        liczba=Integer.parseInt(br.readLine());
        tab = new int[liczba];
        System.out.println("Program algorytmu sortowania Bombelkowego vol.2: ");
        wypelnienie();
        int[] sorted2 = bubbleSort(tab);
        System.out.println("Po sortowaniu: ");
        for(int x: sorted2)
            System.out.println(""+ x);



    }
    public static void wypelnienie()
    {
        Random r = new Random();
        for(int i=0;i<liczba;i++)
        {
            tab[i]=r.nextInt();
            System.out.println(tab[i]);
        }
    }

    static int[] bubbleSort(int[] zbior) {
        int size = zbior.length;
        int bufor = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (zbior[j - 1] > zbior[j]) {
                    bufor = zbior[j - 1];
                    zbior[j - 1] = zbior[j];
                    zbior[j] = bufor;
                }
            }
        }
        return zbior;
    }
}
