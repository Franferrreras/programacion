package com.company;

import java.util.Scanner;

public class tablas_3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Escribir una aplicación que solicite al usuario cuántos números desea introducir.
        //A continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso al introducido.

        int cantidad;
        int [] num;

        System.out.println("Cúantos números quiere introducir");
        cantidad = sc.nextInt();

         num = new int[cantidad];

        for (int i = 0; i < num.length ; i++) {
            System.out.println("Introduzca numeros enteros");
            num [i] = sc.nextInt();
        }

        for (int i = num.length-1; i >=0 ; i--) {

            System.out.println("Los números introducidos en el orden inverson son "+num[i]);

        }

    }
}
