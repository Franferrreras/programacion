package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4_Collection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        System.out.println(Arrays.toString(palabras));

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> repetidas = new ArrayList<>();
        ArrayList<String> norept = new ArrayList<>();

        for (int i = 0; i < palabras.length ; i++) {
            words.add(palabras[i]);
        }

        //System.out.println(words);


        for ( String palabra : words ) {
            if (words.indexOf(palabra) != words.lastIndexOf(palabra)) {
                repetidas.add(palabra);
            }else {
                norept.add(palabra);
            }
        }

        String[] result = (String[]) words.toArray();
        System.out.println(words);
        System.out.println(repetidas);
        System.out.println(norept);
    }
}
