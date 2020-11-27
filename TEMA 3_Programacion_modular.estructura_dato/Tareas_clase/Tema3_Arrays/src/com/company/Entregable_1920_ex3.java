package com.company;

import java.util.Arrays;

public class Entregable_1920_ex3 {

    public static void main(String[] args) {


        /*Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
        lo que se especifica en los comentarios:

        public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
        // que contienen el 7 (por ej. 7, 27, 782)
        // que se encuentren en otro array que se
        // pasa como parámetro. El tamaño del array
        // que se devuelve será menor o igual al
        // que se pasa como parámetro.

        Utiliza esta función en un programa para comprobar que funcionan bien. Para
        que el ejercicio resulte más fácil, las repeticiones de números que contienen
        7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
        el array devuelto también estará repetido 3 veces. Si no existe ningún número
        que contiene 7 en el array x, se devuelve un array con el número -1 como único
        elemento.*/

        int[] x = new int[(int)(Math.random()*1000+1)] ;
        String [] v = new String[x.length];

        for (int i = 0; i < x.length ; i++) {
            x[i] = (int)(Math.random()*1000);

            if (v[i].contains("7")) {
                System.out.println(Arrays.deepToString(v));
            }
        }

    }

    public static int[] filtraCon7(int[] x) {

        String [] v = new String[x.length];

        for (int i = 0; i < x.length ; i++) {
            x[i] = (int)(Math.random()*1000);

            if (v[i].contains("7")) {
                System.out.println(Arrays.deepToString(v));
            }
        }
        return x;
    }
}
