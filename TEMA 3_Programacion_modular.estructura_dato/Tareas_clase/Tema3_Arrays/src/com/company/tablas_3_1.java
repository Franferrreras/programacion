package com.company;

import java.util.Scanner;

public class tablas_3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar los números en el mismo orden en que se han introducido.

        float [] dec = new float[5];


        for (int i = 0; i < dec.length ; i++) {

            System.out.println("Introduzca números decimales");
            dec [i] = sc.nextFloat();
        }

       for (int i = 0; i < dec.length ; i++) {

           System.out.println("El número de posicion "+i+" es el "+dec[i]);
        }
    }
}
