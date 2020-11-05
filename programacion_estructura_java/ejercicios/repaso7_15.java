package com.company;

import java.util.Scanner;

public class repaso7_15 {

    public static void main(String[] args) {
        /*Actividad1-15: Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean
         primos. Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:

        1-> primo

        2->primo

        3->primo

        4->no primo

        5->primo

        6->no primo

        7->primo

        8->no primo*/
        int num;
        boolean esprimo=true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca número");
        num = sc.nextInt();

        for (int i=2 ; i<num ; i++) {
            esprimo=true;
            for(int j=2 ; j<i ; j++) {
                if (i%j==0) {
                    esprimo = false;
                    break;
                }
            }
            if (esprimo) {

                System.out.println(i+"Es primo");
            }else {
                System.out.println(i+" no es primo");
            }

        }

    }
}
