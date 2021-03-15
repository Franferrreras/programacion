package com.company;

import java.sql.Array;
import java.util.*;

public class Ex4_Collection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;
        ArrayList<String> words = new ArrayList<>();
        //ArrayList<String> repetidas = new ArrayList<>();
        Set<String> repetidas = new LinkedHashSet<>();
        ArrayList<String> norept = new ArrayList<>();


        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        String[] palabras = frase.split(" ");


        System.out.println(Arrays.toString(palabras));

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

        /*String[] result = (String[]) words.toArray();*/
        System.out.println(words+"Todas las palabras");
        System.out.println(repetidas+"Palabras repetidas");
        System.out.println(norept+"Palabras no repetidas");
    }
}
