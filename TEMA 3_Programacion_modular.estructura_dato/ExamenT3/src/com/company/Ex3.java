package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* Ejercicio 3

        Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de ajedrez:

        public static boolean jaque(String posRey,String posReina)

        Y nos devuelva si reina está en posición de jaque al rey.

        La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8

        Para recordar una imagen de un tablero con las posiciones:*/

        String[][] tablero = new String[8][8];
        String[] pos = {"a","b","c","e","f","g","h","i"};

        int reinaf,reinac;
        int reyf,reyc;


        reinaf=3;
        reinac=3;
        reyf = 0;
        reyc = 3;

        for (int f = 0; f < tablero.length ; f++) {
            for (int c = 0; c < tablero[f].length ; c++) {

                if (f+c==reinaf+reinac || f-c == reinaf-reinac || c==reinac || f==reinaf) {
                    tablero[f][c] = "x ";
                }else {
                    tablero[f][c] = "- ";
                }

            }
        }

        tablero[reinaf][reinac] = "O ";
        tablero[0][3] = "X ";//es el rey

        for (int f = 0; f < tablero.length ; f++) {
            System.out.println(Arrays.toString(tablero[f]));
        }

        System.out.println("introduzca la posicion de la reina");
        reinaf = sc.nextInt();
        reinac = sc.nextInt();

        System.out.println("Introduzca la posicion del rey");
        reyf = sc.nextInt();
        reyc = sc.nextInt();

        if (esJaque(tablero,reyf,reyc,reinaf,reinac)) {
            System.out.println("La reina está en posición de jaque al rey");
        }else if (!esJaque(tablero,reyf,reyc,reinaf,reinac)) {
            System.out.println("No es jaque");
        }

    }

    public static boolean esJaque(String[][]tablero, int rey1,int rey2,int reinaf,int reinac){



        for (int f = 0; f < tablero.length ; f++) {
            for (int c = 0; c < tablero[f].length ; c++) {

                if (f+c==reinaf+reinac || f-c == reinaf-reinac || c==reinac || f==reinaf) {
                    tablero[f][c] = "x ";
                }else {
                    tablero[f][c] = "- ";
                }

            }
        }

        tablero[reinaf][reinac] = "O ";

        for (int i = 0; i < tablero.length ; i++) {
            for (int c = 0; c < tablero[i].length ; c++) {

                //Esta parte la he corregido despues del examen
                /* Esta es la parte original --> if (tablero[reinaf][rey2].equals("x ")) {
                        return true;
                    }*/
                    if (tablero[rey1][rey2].equals("x ")) {
                        return true;
                    }

            }
        }
        return false;
    }
}
