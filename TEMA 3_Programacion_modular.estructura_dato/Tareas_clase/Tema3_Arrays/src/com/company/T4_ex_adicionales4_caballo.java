package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class T4_ex_adicionales4_caballo {

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
        int columnaInicial = 3;

        int cabf = 3 ;
        int cabc = 6;

        for (int f = 0; f < tablero.length ; f++) {
            //System.out.println(Arrays.deepToString(tablero));

            for (int c = 0; c < tablero[f].length ; c++) {

                if ( (f == cabf-1 && c == cabc-2 || c == cabc-1  && f == cabf-2 || c == cabc+1 && f == cabf-2 || c == cabc+2 && f == cabf-1 || c == cabc-2 && f == cabf+1 || c == cabc-1 && f == cabf+2 || c == cabc+1 && f == cabf+2 || c == cabc+2 && f == cabf+1) && c<=7 && f<=7 ) {

                    tablero[f][c] ="✠";//✠
                }else {
                    if ( (f+c)%2==1) {
                        tablero[f][c] ="❑ ";
                    }else  {
                        tablero[f][c] ="▦";
                    }
                }
            }
        }

        System.out.println();
        tablero[cabf][cabc]="♞";

        //negras
        tablero[7][0]="♜";
        tablero[7][1]="♞";
        tablero[7][2]=" ♝";
        tablero[7][3]="♛";
        tablero[7][4]="♚";
        tablero[7][5]="♝";
        tablero[7][7]="♜";

        tablero[6][0]="♟";
        tablero[6][1]="♟";
        tablero[6][2]="♟";
        tablero[6][3]=" ♟";
        tablero[6][4]="♟";
        tablero[6][5]=" ♟";
        tablero[6][6]="♟";
        tablero[6][7]="♟";



        //blancas
        tablero[0][0]="♖";
        tablero[0][1]="♘";
        tablero[0][2]=" ♗";
        tablero[0][3]="♕";
        tablero[0][4]="♔";
        tablero[0][5]=" ♗";
        tablero[0][6]="♘";
        tablero[0][7]="♖";

        tablero[1][0]="♙";
        tablero[1][1]="♙";
        tablero[1][2]="♙";
        tablero[1][3]=" ♙";
        tablero[1][4]="♙";
        tablero[1][5]=" ♙";
        tablero[1][6]="♙";
        tablero[1][7]="♙";

        for (int i = 0; i < tablero.length ; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }
}
