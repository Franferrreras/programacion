package com.company;

import java.util.Scanner;

public class Ex1_funciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Actividad 1: Diseñar una función eco() a la que se le pasa como parámetro
        //un número n, y muestra por pantalla n veces el mensaje "Eco..."

        eco(6);


    }

    public static void eco(int n) {

        for (int i = 1; i <=n ; i++) {
            System.out.println("eco");
        }

    }
}
