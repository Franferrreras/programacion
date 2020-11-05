package com.company;

import java.util.Scanner;

public class cadena9_4_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.

        String p1;

        System.out.println("introduzca una frase");
        p1 = sc.nextLine();

        if (p1.charAt((int)Math.floor(p1.length()/2))==' ') {
            System.out.println("El caracter centra es un espacio");
        }else {
            System.out.println("El caracter central no es une espacio");
        }
    }
}
