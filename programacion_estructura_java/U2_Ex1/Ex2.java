package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras ese número no sea positivo.

                Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y mostrará el número habiéndole quitado todos los dígitos entre
                esas dos posiciones. (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es la posición 0.

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


         ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ESTE EJERCICIO LO HE SUBIDO AL REPOSITORIO DESPUÉS DEL EXAMEN, EN EL EXAMEN NO LO LLEGUE A TERMINAR.//
       ////////////////////////////////////////////////////////////////////////////////////////////////////////

        int num,resto,num_invertido,reset,p1,p2,posicion;

        num_invertido = 0;
        posicion = -1;
        reset = 0;


        do {
            System.out.println("Introduzca número entero positivo");
            num = sc.nextInt();
        }while (num<=0);


        System.out.println("introduzca posicion inicial y final");
        p1 = sc.nextInt();
        p2 = sc.nextInt();

        while (num > 0) {

            resto = num%10;
            num_invertido = num_invertido*10 + resto;
            num = num/10;
        }

        while (num_invertido > 0) {
            //12345678
            //01234567
            resto = num_invertido%10;
            posicion++;

            if (posicion >= p1 && posicion <= p2) {
                num_invertido = num_invertido/10;
            }

            if (posicion >= p1 && posicion <= p2){
                continue;
            }

            reset = reset*10 + resto;

            num_invertido = num_invertido/10;

        }
        System.out.println(reset);


    }
}
