package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex7_Collection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        TreeSet<String> palabras = new TreeSet<>();

        do {
            System.out.println("Introduzca palabra");
            palabra = sc.nextLine();

            if (!palabra.equals("fin")) {
                palabras.add(palabra);
            }
        }while (!palabra.equals("fin"));


        System.out.println(palabras.toString());
    }
}
