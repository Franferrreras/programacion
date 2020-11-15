package com.company;

import java.util.Scanner;

public class For_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ejercicio propuesto 6.3.6: Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla
        //un rectángulo formado por asteriscos, que tendrá como alto el primer número y como ancho el segundo número.


        byte altura,base;

        System.out.println("Introduzca la altura del rectángulo");
        altura = sc.nextByte();

        System.out.println("Introduzca la base del rectángulo");
        base = sc.nextByte();

        for (int h=1 ; h<=altura ; h++ ){
            for (int b=1 ; b<=base ; b++){
                System.out.print(" *");
            } System.out.println("");
        }
    }
}
