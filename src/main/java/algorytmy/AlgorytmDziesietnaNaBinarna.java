package algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorytmDziesietnaNaBinarna {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytmu obliczający liczbę Dziesiętną na liczbę Binarną:");
        System.out.println("Wpisz liczbę dziesiętną n: ");
        n = Integer.parseInt(br.readLine());

         


    }

    static void convertToBinary(int liczba){
        int  container[] = new int[8];
        int i= 0;
        while(liczba >0){
            container[i] = liczba%2;
            i++;
            liczba = liczba/2;
        }
        for(int element: container){
            System.out.println(element);
        }
    }
}
