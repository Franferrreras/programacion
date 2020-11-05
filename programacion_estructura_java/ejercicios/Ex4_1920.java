package com.company;

import java.util.Scanner;

public class Ex4_1920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*EJERCICIO 4 (Ej4.java)

                Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura, que debe ser
                un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 5 espacios.
                 Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.

                Ejemplo 1:

        Introduce la altura de la flecha: 7



        Ejemplo 2:

        Introduce la altura de la flecha: 3*/

        int altura;

        System.out.println("introduzca la altura de la flecha");
        altura = sc.nextInt();

        for (int f=1 ; f<=altura ; f++) {
            for (int c=1 ; c<=(altura+1)/2 ; c++) {
                if (f+c == ((altura+1)/2)+1 || f-c == altura/2) {
                    System.out.print("*-----*");
                }else {
                    System.out.print("-");
                }
            }System.out.println("");
        }
    }
}
