package com.company;

import java.util.Arrays;

public class Ej1 {

    public static void main(String[] args) {

        /*Ejercicio 1

        Define la función mezcla con la siguiente cabecera:

        public static int[] mezcla(int[] a, int[] b)

        Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc. Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que quedan del otro.

                Ejemplos:

        Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }

        Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}

        Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}

        Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}*/
        int[] a = {8,9,7};
        int[] b = {1,2,3};

        System.out.println(Arrays.toString(mezcla(a,b)));

    }

    public static int[] mezcla(int[] a, int[] b) {

        int[] resultado = new int[a.length+b.length];

        int count=0;
        int countb=0;
        for (int i = 0; i < resultado.length; i++) {

            if (i%2==0 ) {
                count++;
                resultado[i] = a[count-1];

            }else {
                countb++;
                resultado[i] = b[count-1];
            }
        }
        return resultado;
    }
}
