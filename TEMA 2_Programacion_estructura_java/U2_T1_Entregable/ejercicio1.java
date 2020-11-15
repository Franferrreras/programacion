package com.company;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ejercicio 1:

        Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol de Navidad para que Papá Noel
        deje sus regalos.
        El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
        Observa que la talla de los calcetines y la distancia que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

        Ejemplo 1:
        Introduzca la altura de los calcetines: 6

                ***      ***
                ***      ***
                ***      ***
                ***      ***
                ******   ******
                ******   ****** */
        int h;

        System.out.println("Introduzca la altura de los calcetines");
        h = sc.nextInt();

        for (int f=1 ; f<=h ; f++) {
            if (f<=h-2) {
                System.out.print("***    ***");
            }else {
                System.out.print("****** ******");
            }System.out.println("");
        }
    }
}

