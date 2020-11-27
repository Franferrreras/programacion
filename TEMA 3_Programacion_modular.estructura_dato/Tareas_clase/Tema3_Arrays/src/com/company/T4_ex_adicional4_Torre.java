package com.company;

import java.util.Arrays;

public class T4_ex_adicional4_Torre {

    public static void main(String[] args) {

        int[] filas = {7,6,5,4,3,2,1,0};
        String[] columnas = {"a","b","c","d","e","f","g","h"};
        String[][] tablero = new String[8][8];

        //POSICION D5
        int filaInicial = 3;
        int columnaInicial = 4;

        for (int f = 0; f < tablero.length ; f++) {
            //System.out.println(Arrays.deepToString(tablero));

            for (int c = 0; c < tablero[f].length ; c++) {

                if ( f == filaInicial || c == columnaInicial ) {
                    tablero[f][c] ="x";
                }else {
                    tablero[f][c] ="-";
                }
            }
        }

        System.out.println();
        tablero[filaInicial][columnaInicial]="♜";

        //negras

        tablero[7][1]="♞";
        tablero[7][2]="♝";
        tablero[7][3]="♛";
        tablero[7][4]="♚";
        tablero[7][5]="♝";
        tablero[7][6]="♞";
        tablero[7][7]="♜";

        tablero[6][0]="♟";
        tablero[6][1]="♟";
        tablero[6][2]="♟";
        tablero[6][3]="♟";
        tablero[6][4]="♟";
        tablero[6][5]="♟";
        tablero[6][6]="♟";
        tablero[6][7]="♟";



        //blancas
        tablero[0][0]="♖";
        tablero[0][1]="♘";
        tablero[0][2]="♗";
        tablero[0][3]="♕";
        tablero[0][4]="♔";
        tablero[0][5]="♗";
        tablero[0][6]="♘";
        tablero[0][7]="♖";

        tablero[1][0]="♙";
        tablero[1][1]="♙";
        tablero[1][2]="♙";
        tablero[1][3]="♙";
        tablero[1][4]="♙";
        tablero[1][5]="♙";
        tablero[1][6]="♙";
        tablero[1][7]="♙";

        for (int i = 0; i < tablero.length ; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

    }
}
