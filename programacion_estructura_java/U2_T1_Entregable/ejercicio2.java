package com.company;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número de ese número
        todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el número mientras que
        el número introducido no sea positivo.

        Ejemplo 1:
        Introduzca un número entero positivo: 34084091
        Número resultado: 34491
        Dígitos eliminados: 3

        Ejemplo 2:

        Introduzca un número entero positivo: 84123
        Número resultado: 4123
        Dígitos eliminados: 1*/

        int num;
        do {
            System.out.println("introduzca un número entero positivo");
            num = sc.nextInt();
        }while (num<=0);

    }
}
