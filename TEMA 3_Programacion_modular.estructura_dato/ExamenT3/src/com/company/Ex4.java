package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ejercicio 4

        Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento es el 0.

        Si la posición donde se busca no existe en el array, la función debe devolver -1.

        Se debe entregar tanto el código de la función como el código de prueba que la usa.Rellenaremos los arrays de manera aleatorio con números entre 10 y 100 (ambos incluidos).

        La cabecera de la función es la siguiente: public static int nEsimo(int[][] n, int posicion)*/

        int[][] tabla = new int[4][6];
        int pos;

        for (int f = 0; f < tabla.length ; f++) {
            for (int c = 0; c < tabla[f].length ; c++) {
                tabla[f][c] = (int)(Math.random()*99+1);
            }
        }

        for (int i = 0; i < tabla.length ; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        System.out.println("Que posicion desea saber)");
        pos = sc.nextInt();

        System.out.println("El número en la posicion "+pos+" es "+nEsimo(tabla,pos));

    }
    public static int nEsimo(int[][] v,int pos) {

        int resultado =0;

        if (pos > 24 || pos < 0) {
            System.out.println("Ha habido un error devuelvo -1");
        }
        for (int f = 0; f < v.length ; f++) {


            for (int c = 0; c < v[f].length ; c++) {

                if (f==0 && pos <= v[f].length-1) {
                    resultado = v[f][pos];
                }
                if (f==1 && pos >v[f].length-1 && pos < v[f].length*2) {
                    resultado = v[f][pos-v[f].length];
                }
                if (f==2 && pos >= v[f].length*2 && pos < v[f].length*3) {
                    resultado = v[f][pos-v[f].length*2];
                }

                if (f==3 && pos>= v[f].length*3 && pos < v[f].length*4) {
                    resultado = v[f][pos- v[f].length*3];
                }
            }
        }

        return resultado;
    }
}
