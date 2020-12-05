package com.company;

import java.util.Arrays;

public class Ej4 {

    public static void main(String[] args) {

        /*Ejercicio 4

        Realiza un programa que rellene un array de 5 filas por 9 columnas con
        números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
        continuación, el programa deberá dar la posición tanto del máximo como del
        mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.*/


        int[][] array = new int[5][9];
        int max,min;
        max = 0;
        min = 0;

        for (int f = 0; f < array.length ; f++) {
            for (int c = 0; c < array[f].length ; c++) {

                array[f][c] = (int)(Math.random()*900+100);

                if (f==0 && c==0) {
                    max = array[f][c];
                    min = array[f][c];
                }else {
                    if (array[f][c] > max) {
                        max = array[f][c];
                    }

                    if (array[f][c] < min) {
                        min = array[f][c];
                    }
                }

            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }

        System.out.println("");

        for (int f = 0; f < array.length ; f++) {
            for (int c = 0; c < array[f].length ; c++) {

                if (array[f][c] == max) {
                    System.out.println("El número máximo es "+array[f][c]+" y su posicion es la fila "+(f+1)+" y la columna "+(c+1));
                } else if (array[f][c] == min) {
                    System.out.println("El número mínimo es "+array[f][c]+" y su posición es la fila "+(f+1)+" y la columna "+(c+1));
                }else {

                }
            }
        }

    }
}
