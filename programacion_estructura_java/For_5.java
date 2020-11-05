package com.company;

import java.util.Scanner;

public class For_5 {

    public static void main(String[] args) {

        //Ejercicio propuesto 6.3.5: Crea un programa que muestre los números enteros entre 0 y el que introduzca
        //el usuario que sean múltiplos de 3 (el resto al dividir por 3 es 0) y a la vez múltiplos de 7 (ídem).
        Scanner sc = new Scanner(System.in);
        int num,i;

        System.out.println("Por favor introduzca un número");
        num = sc.nextInt();

        for (i=0 ; i<=num ; i++ ) {
            if (i%3==0 && i%7==0){
                System.out.println(i);

            }
        }
    }
}
