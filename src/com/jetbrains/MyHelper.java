package com.jetbrains;

import java.util.Scanner;

public class MyHelper {

    public static int pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int pobierzLiczbe(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void wyswietl(String message) {
        System.out.println(message);
    }

}
