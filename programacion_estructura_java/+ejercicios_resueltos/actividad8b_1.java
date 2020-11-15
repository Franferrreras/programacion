package com.company;

import java.util.Scanner;

public class actividad8b_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
        // El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

        int altura;
        System.out.println("Introduzca altura de la L");
        altura = sc.nextInt();

        for (int f=1 ; f <=altura ; f++) {
            for ( int c=1 ; c<=altura ; c++) {
                if (f==altura || c==(altura)) {
                    System.out.print(" *");
                }else {
                    System.out.print("");
                }
            }System.out.println("");
        }
    }
}
