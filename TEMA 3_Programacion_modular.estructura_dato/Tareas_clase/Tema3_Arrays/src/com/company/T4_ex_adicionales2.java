package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class T4_ex_adicionales2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];


        for (int i = 0; i < palabras.length ; i++) {
            System.out.println("introduce la palabra en la posicion "+i);
            palabras[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(palabras));
    }

    /*public static boolean escolor(String palabra) {

    }*/
}
