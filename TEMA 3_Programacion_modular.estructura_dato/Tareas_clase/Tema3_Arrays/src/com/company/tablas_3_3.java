package com.company;

import java.util.Scanner;

public class tablas_3_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
        // Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.

        int n,sump,sumn,contp,contn,contz;
        int [] num;

        contp = 0;
        contn = 0;
        contz = 0;
        sump = 0;
        sumn = 0;

        System.out.println("Introduzca tamaño del vector");
        n = sc.nextInt();

        num = new int[n];

        for (int i = 0; i < num.length ; i++) {

            System.out.println("Introduzca números");
            num [i] = sc.nextInt();

            if (num [i] > 0) {

                contp++;
                sump+=num[i];

            }else if (num [i] < 0) {

                contn++;
                sumn+=num[i];
            }else {
                contz++;
            }
        }

        System.out.println("La media de los números positivos es de "+sump/contp);
        System.out.println("La media de los números negativos es de "+sumn/contn);
        System.out.println("El número de ceros introducidos es de "+contz);




    }
}
