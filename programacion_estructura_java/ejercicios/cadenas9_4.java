package com.company;

import java.util.Scanner;

public class cadenas9_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diseñar un programa que pida una frase al usuario, e indique si el carácter
        //de la posición central es o no un espacio.

        String frase,espacio;
        espacio="";

        System.out.println("introduzca una frase");
        frase = sc.nextLine();


        if (frase.charAt((int)frase.length()/2)==' ') {
            System.out.println("El caracter central es un espacio");
        }else {
            System.out.println("EL caracter centra es "+frase.charAt(frase.length()/2));
        }


    }
}
