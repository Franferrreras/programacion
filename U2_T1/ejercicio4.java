package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando cada vez la hora nueva.
                Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de segundos que se quiere aumentar la hora.

                Supondremos que el usuario siempre introduce valores correctos.
                Ejemplo 1:

        Introducza horas: 13
        Introduzca minutos: 59
        Introduzca segundos: 51
        Introduzca segundos a incrementar: 10

        Aumentando la hora...
        13:59:52
        13:59:53
        13:59:54
        13:59:55
        13:59:56
        13:59:57
        13.59:58
        13:59:59
        14:00:00*/
        String hora,min,seg;

        String tiempo="000000";
        int incremento;


        System.out.println("Introduzca horas");
        hora = sc.nextLine();
        System.out.println("Introduzca minutos");
        min = sc.nextLine();
        System.out.println("Introduzca segundos");
        seg = sc.nextLine();

        String c= hora+min+seg;

        System.out.println(hora+":"+min+":"+seg);

        System.out.println("Aumentando la hora...");

        incremento = sc.nextInt();

        for (int i=1 ; i<=incremento ; i++) {
            System.out.println(Integer.parseInt(c)+i);

    //comentario,
        }
    }
}
