package com.company;

import java.sql.Array;
import java.util.Arrays;

public class T4_ex_adicionales6 {

    public static void main(String[] args) {

        int[][] v = new int[6][8];

        /*Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.

                NOTA IMPORTANTE: Los números no pueden repetirse.*/
        int maximo,minimo;
        maximo = v[0][0];
        minimo = v[0][0];

        for (int i = 0; i < v.length ; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = (int)(Math.random()*1001);

                if (i==0 && j==0) {
                    maximo = v[i][j];
                    minimo = v[i][j];
                }else {

                }
            }
        }

        for (int i = 0; i < v.length ; i++) {
            System.out.println(Arrays.toString(v[i]));
        }
    }
}
