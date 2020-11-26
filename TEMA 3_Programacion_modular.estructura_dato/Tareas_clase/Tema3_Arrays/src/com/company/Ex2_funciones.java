package com.company;

import java.util.Scanner;

public class Ex2_funciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Actividad 2: Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

        entrenumeros(10 , 30);


    }

    public static void entrenumeros(int n1, int n2) {


        for (int i = n1; i <n2 ; i++) {

            System.out.println(i);
        }
    }
}
