package com.company;

import java.util.Scanner;

public class actividad8_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
        //A continuación, solicitará por teclado un valor que debe estar dentro del rango.
        // Si no es asi, volverá a solicitar un número, y así repetidas veces hasta
        // que el valor esté dentro del rango.
        int n1,n2,rango;

        System.out.println("Introduzca un mínimo");
        n1 = sc.nextInt();
        System.out.println("Introduzca un máximo");
        n2 = sc.nextInt();


        do {
            System.out.println("Introduzca un numero entre el máximo y el mínimo");
            rango = sc.nextInt();
        }while (n1>=rango || rango>=n2);

    }
}
