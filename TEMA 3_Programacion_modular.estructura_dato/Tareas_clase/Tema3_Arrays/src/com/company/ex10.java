package com.company.modular;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        //Escribir una función que decida si dos números enteros positivos son amigos. Dos números son amigos si la
        //suma de los divisores propios (distinto de él mismo) del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

        Scanner sc = new Scanner(System.in);

        int n1,n2,sumn1,sumn2;

        sumn1 = 0;
        sumn2=0;

        System.out.println("Introduzca dos números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (int i=1 ; i < n1 ; i++) {

            if(n1%i==0) {
                System.out.println(i);
                sumn1+=i;
            }
        }
        System.out.println(sumn1);

        for (int j=1 ; j < n2 ; j++) {

            if(n2%j==0) {
                System.out.println(j);
                sumn2+=j;
            }
        }
        System.out.println(sumn2);

        if (n1 == sumn2 && n2 == sumn1) {
            System.out.println("Los números "+n1+" y "+n2+" son números amigos");
        }else {
            System.out.println("Los números no son amigos");
        }

    }

}
