package com.company;

import java.util.Scanner;

public class For_7 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //Ejercicio propuesto 6.3.7: Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado hueco
        //de ese ancho, que tendrá un borde formado por asteriscos y su interior serán espacios en blanco. Por ejemplo, para un tamaño de 4 sería:

        byte f,c,tam;

        System.out.println("Introduzca el tamaño del marco");
        tam = sc.nextByte();

        for (f=1 ; f<=tam ; f++) {
            for (c=1 ; c<=tam ; c++) {
                if (f==1 || f==tam || c==1 || c==tam) {
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }System.out.println("");
        }
    }
}
