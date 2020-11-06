package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras ese número no sea positivo.

                Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones. (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es la posición 0.

        Ejemplo 1:

        Introduce el número: 1234567

        Posición inicial: 2

        Posición final: 4

        El número resultante es: 1267

        Ejemplo 2:

        Introduce el número: 123456789

        Posición Inicial: 5

        Posición final: 7

        El número resultante es: 123459*/


        int num,resto,num_invertido,ex1,ex2;

        num_invertido=0;


        System.out.println("Introduzca un número");
        num = sc.nextInt();

        System.out.println("Introduzca dos números a excluir");
        ex1 = sc.nextInt();
        ex2 = sc.nextInt();

        resto = num&10;
        num_invertido = num_invertido*10 + resto;
        num=num/10;

//no se hacerlo
    }
}
