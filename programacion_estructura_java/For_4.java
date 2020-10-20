package com.company;

public class For_4 {

    public static void main(String[] args) {
//Ejercicio propuesto 6.3.4: Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos de 6 (el resto al dividir por 6 sea 0).

        int i;

        for (i=1 ; i<=100 ; i++) {
            if (i%6 == 0) {
                System.out.println(i);
            }
        }

    }
}
