package com.company;

import java.util.Scanner;

public class cadenas9_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra
        //intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
        //El programa debe escribir "Acertaste" o "Fallaste".

        String contraseña, usuario;

        System.out.println("introduzca contraseña");
        contraseña = sc.nextLine();

        usuario="";

        while (!contraseña.equals(usuario)) {

            System.out.println("Adivina la contraseña");
            usuario = sc.nextLine();

            if (contraseña.compareTo(usuario)<0) {
                System.out.println("palabra es menor");
            }else if (contraseña.compareTo(usuario)==0){
                System.out.println("Has acertado");
            }else {
                System.out.println("la palabra es mayor");
            }

            /*if (!contraseña.equals(usuario)) {
                System.out.println("Fallaste");
                System.out.println("la contraseña tiene "+contraseña.length()+" caracter");
                System.out.println("la primera letra es "+contraseña.charAt(0));
                System.out.println("la ultima letra es "+contraseña.charAt(contraseña.length()-1));
            }else {
                System.out.println("Acertaste");
            }*/


        }
    }
}
