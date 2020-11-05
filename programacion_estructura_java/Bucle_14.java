package com.company;

import java.util.Scanner;

public class Bucle_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Actividad1-14: Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para
        // ello asteriscos (*). Por ejemplo, para n=4:

        //* * * *

        //* * *

        //* *

        //*
        int num;
        System.out.println("Introduzca tamaño del triangulo");
        num = sc.nextInt();


        for (int f = num ; f >=1 ; f--){
            for (int c = num ; c <=f ; c--) {
                System.out.print("*");
            }System.out.println("");
        }

    }
}
