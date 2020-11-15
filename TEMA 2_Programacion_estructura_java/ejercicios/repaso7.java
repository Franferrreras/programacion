package com.company;

import java.util.Scanner;

public class repaso7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

        int n1,n2,aux;

        System.out.println("Introduzca valores de a");
        n1 = sc.nextInt();

        System.out.println("Introduzca valor de b");
        n2 = sc.nextInt();

        aux=n1;
        n1=n2;
        n2=aux;

        System.out.println("El nuevo valor de a es "+n1+" y de b es "+n2);
        System.out.println(5/2);
    }
}
