package algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorytmEuklidesa {

    public static void main(String[] args) throws IOException {
        int a,b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program algorytmu Euklidesa:");
        System.out.println("Wpisz liczbę a:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Wpisz liczbe b:");
        b = Integer.parseInt(br.readLine());

        while( a !=b){
            if(a> b){
                a=a-b;
                System.out.println("a = " +a);
            }
            else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }

        System.out.println(" a = "+ a + (" b = ")+ b);



    }
}
