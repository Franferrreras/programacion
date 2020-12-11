package com.company;

public class Ex1 {

    public static void main(String[] args) {

        /*Ejercicio 1

        Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:

        public static int aleatorioDeArray(int[] a)
        Esta función debe devolver un número del array escogido al azar entre todos los disponibles.

                Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37.

        Utiliza la función en un programa deprueba.*/

        int[] Arrays = {105,23,340,5,8,9};

        System.out.println(aleatorioDearray(Arrays));

    }
    public static int aleatorioDearray(int[] a) {

        int num = 0;
        for (int f = 0; f < a.length ; f++) {
            num = a[(int)(Math.random()*a.length)];
        }
        return num;
    }
}

