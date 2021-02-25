package com.company;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Ex6_Collection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        LinkedHashSet<String> palabras = new LinkedHashSet<>();

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
