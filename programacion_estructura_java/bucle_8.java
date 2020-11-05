package com.company;

import java.util.Scanner;

public class bucle_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // Actividad1-8: Pedir un número y calcular su factorial.

               // Ejemplo: Factorial de 5:

       // 5! = 5x4x3x2x1 = 120
        int num, result;
        result = 1;


        System.out.println("Introduxca un número");
        num = sc.nextInt();

        for (int i = num ; i>=1 ; i--);{

        }
        System.out.println("El factrial es "+num+""+result);
    }
}
