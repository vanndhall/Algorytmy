package algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorytmLiczbDoskonalych {
    private static int[] liczby;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytmu Liczby Doskonałej:");
        System.out.println("Wpisz liczbę X: ");


//Zainicjuj zmienne

            int znalezione = 0;
            int x = Integer.parseInt(br.readLine());
            int suma_dzielnikow = 0;
            liczby = new int[3];

//Dopóki nie znaleziono 3 liczb doskonałych
            while (znalezione < 3) {
//Sprawdź czy x jest liczbą doskonałą
                for (int i = 1; i <= (x / 2); i++) {
                    if ((x % i) == 0)
                        suma_dzielnikow += i;
                    System.out.println("Liczba X: "+x);
                }
//Jeżeli x jest liczbą doskonałą to dodaj ją do tablicy
                if (suma_dzielnikow == x) {
                    liczby[znalezione] = x;
                    ++znalezione;
                    System.out.println("Znalezione: "+znalezione);
                }
//Zwiększ x o jeden
                ++x;
                suma_dzielnikow = 0;
            }

//Wypisz znalezione liczby doskonałe
            System.out.println("Trzy pierwsze liczby doskonale:");
            for (int e : liczby) {
                System.out.print(e + ", ");
            }
        }
    }

