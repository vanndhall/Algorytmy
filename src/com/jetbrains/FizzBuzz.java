package com.jetbrains;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FizzBuzz {
    public static void main(String[] args)throws IOException{
        int liczba;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program FizzBuzz:");
        System.out.println("Wpisz liczbę:  ");
        liczba = Integer.parseInt(br.readLine());
        Oblicz(liczba);

    }

    public static void Oblicz(int n){
        for(int i = 0;i<=n;i++){
            if(i%3==0)
                System.out.println("Liczba n=" + i + " _________Fizz");
            if(i%5==0)
                System.out.println("Liczba n="+i+"_________Buzz");
            if(i%15==0)
                System.out.println("Liczba n="+i+"_________FizzBuzz");
        }


    }
}
