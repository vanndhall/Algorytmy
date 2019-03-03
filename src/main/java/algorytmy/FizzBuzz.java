package algorytmy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        int liczba;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program FizzBuzz:");
        System.out.println("Wpisz liczbę:  ");
        System.out.println("Prostota: \n");
        liczba = Integer.parseInt(br.readLine());
        Oblicz(liczba);
        System.out.println("\nZaawansowane: \n");
        FizBuzz(liczba);
    }

    //Prostota
    public static void Oblicz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0)
                System.out.println("Liczba n=" + i + " _________Fizz");
            if (i % 5 == 0)
                System.out.println("Liczba n=" + i + "_________Buzz");
            if (i % 15 == 0)
                System.out.println("Liczba n=" + i + "_________FizzBuzz");
        }
    }
    // Zaawansowane
    public static void FizBuzz ( int x){
        for (int i = 1; i <= x; i++) {
            String value = "";
            if (i % 3 == 0) value += "Fizz";
            if (i % 5 == 0) value += "Buzz";
            System.out.println(i + " : " + value);
        }
    }
}
