package com.company;

import java.util.Scanner;

public class actividad8_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
        int num;
        System.out.println("Introduzca un número");
        num = sc.nextInt();

        for (int i=1 ; i<=num ; i++) {
            System.out.println(i);
        }
    }
}
