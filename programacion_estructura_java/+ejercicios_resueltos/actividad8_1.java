package com.company;

import java.util.Scanner;

public class actividad8_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diseñar un programa que muestre, para cada número introducido por teclado,
        // si es par, si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.
        int num;


        do {
            System.out.println("introduzca número");
            num = sc.nextInt();

            if (num >0 && num%2==0) {
                System.out.println("el número es positivo y par");
            }else {
                System.out.println("el número es negativo");
            }
            if (num==num) {
                System.out.println("el cuadrado del número es "+num*num);
            }

        } while (num !=0);

    }
}
