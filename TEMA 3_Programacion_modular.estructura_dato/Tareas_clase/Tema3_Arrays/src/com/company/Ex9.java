package com.company;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores
        //primos del número que se le pasa como parámetro

        int n1;
        boolean esprimo=true;


        System.out.println("Introduzca dos números");
        n1 = sc.nextInt();


        for (int i = 1; i < n1; i++) {

            if (n1 % i == 0) {
                System.out.println(i);

                }
            }


        }
    }