package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class T4_ex_adicionales1_max_min {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[100];


        int maximo, minimo,opcion;

        maximo = numeros[0];
        minimo = numeros[0];


        for (int i = 0; i < numeros.length ; i++) {

            numeros[i] = (int) (Math.random()*500);

            if (i==0) {
                maximo = numeros[i];
                minimo = numeros[i];
            } else {

                if (numeros[i] > maximo) {
                    maximo = numeros [i];

                }

                if (numeros[i] < minimo) {
                    minimo = numeros [i];

                }
            }

        }
        System.out.println(maximo);
        System.out.println(minimo);

        System.out.print(Arrays.toString(numeros));

        System.out.println("");

        System.out.println("Quiere destacar el máximo o el mínimo (1-minimo, 2-máximo?");
        opcion = sc.nextInt();

        for (int i = 0; i < numeros.length ; i++) {

            if  (opcion == 1 && numeros[i] == minimo ) {
                System.out.print("**"+numeros[i]+"** ");

            } else if (opcion == 2 && numeros[i] == maximo ) {
                System.out.print("**"+numeros[i]+"** ");
            } else {
                System.out.print(numeros[i]+", ");
            }

        }


        //Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos
        // entre 0 y 500 (ambos incluidos). A continuaciónel programa mostrará el array y preguntará si el usuario
        // quiere destacar elmáximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendoel número
        // destacado entre dobles asteriscos.
    }

   /*public static int [] rellenar(int[] v, String max, String min, String rp) {

        max = "maximo";
        min = "minimo";
        for (int i = 0; i < v.length ; i++) {

            v[i] = (int) Math.random()*501;

        }

        System.out.println("Quiere destacar el máximo o el mínimo");

    }*/
}
