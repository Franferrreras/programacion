package com.company;

import java.util.Scanner;

public class actividad8_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no
        //lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
        int nota,contador;
        boolean suspenso;
        contador=0;

        do {
            System.out.println("introduce 5 clasificaciones");
            nota = sc.nextInt();
            contador = contador+1;
            if (nota <5) {
                suspenso = true;
            }
        }while (contador <5);

        if (suspenso = true) {
            System.out.println("Hay algun suspenso");
        }

    }
}
