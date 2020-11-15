package com.company;

import java.util.Scanner;

public class practicandocadena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Actividad 9-2: Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra
        //intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".
        String password,n;

        System.out.println("Introduzca la contraseña a acertar");
        password = sc .nextLine();

        System.out.println("intenta acertar la contraseña");
        n = sc.nextLine();

        while (!password.equals(n)) {

            if(!password.equals(n)) {

                System.out.println("Fallaste la contraseña, acontinuación se te daran pistas que te ayudarán");
                System.out.println("La contraseña tiene "+password.length()+" números de caracter");
                System.out.println("La contraseña empieza por la letra "+password.charAt(0)+" y termina por la letra "+password.charAt(password.length()-1));
            }

            System.out.println("");
            System.out.println("Acierta la contraseña");
            n = sc.nextLine();

        }

        System.out.println("Acertaste la contraseña");

    }
}
