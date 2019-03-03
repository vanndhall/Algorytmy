package algorytmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class AlgorytmPalindron {
    public static void main(String[] args) throws IOException {
        String slowo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program algorytmu Polidron:");
        System.out.println("Wpisz słowo: ");
        slowo =br.readLine();
        System.out.println("Odwrocenie ze Stosem: "+OdwrocenieZeStosem(slowo));
        System.out.println("WydajniejszeOdwrocenie: "+WydajniejszeOdwrocenie(slowo) );

        if (AlgorytmPalindron(slowo)) {
            System.out.println("Słowo jest palindromem!");
        } else {
            System.out.println("Słowo nie jest palindromem!");
        }
    }
    public static boolean AlgorytmPalindron(String word) {
        /*int i;
        StringBuilder dest = new StringBuilder(word.length());
        for (i = (word.length() - 1); i >= 0; i--){
            dest.append(word.charAt(i));
        }
        String palindrm = dest.toString();*/

        String palindrom =word;
        System.out.println (palindrom);
        System.out.println(OdwrocenieZeStosem(word));
        System.out.println(word);
        System.out.println(palindrom==OdwrocenieZeStosem(word));
        if ( palindrom == OdwrocenieZeStosem(word)) {
            return true;
        }
        else return false;
    }

    public static String OdwrocenieZeStosem(String word){

        Stack<Character> wordStack = new Stack<>();
        String finalWord = "";

        for(Character item : word .toCharArray()){
            wordStack.push(item);
        }

        for(int i = 0; i < word.length(); i++){
            finalWord += wordStack.pop();
        }

       return finalWord;
    }

    public static String WydajniejszeOdwrocenie(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
