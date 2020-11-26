package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class T4_ex_adicionales4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil
        //que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal.
        //El tablero cuenta con64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

        int[] filas = {7,6,5,4,3,2,1,0};
        String[] columnas = {"a","b","c","d","e","f","g","h"};
        String[][] tablero = new String[8][8];

        //POSICION D5
        int filaInicial = 4;
        int columnaInicial = 2;

        for (int f = 0; f < tablero.length ; f++) {
            //System.out.println(Arrays.deepToString(tablero));

            for (int c = 0; c < tablero[f].length ; c++) {

                if ( f + c == filaInicial+columnaInicial || f - c == filaInicial-columnaInicial ) {
                    tablero[f][c] ="x";
                }else {
                    tablero[f][c] ="-";
                }
            }
        }

        System.out.println();
        tablero[filaInicial][columnaInicial]="♝";

        for (int i = 0; i < tablero.length ; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

    }
}
