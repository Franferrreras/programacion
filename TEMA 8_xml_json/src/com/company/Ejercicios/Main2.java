package com.company.Ejercicios;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProcesadorDomPersonas prcDom = new ProcesadorDomPersonas();

        System.out.println("Introduzca el nombre del archivo xml");
        String nom = sc.nextLine();


        prcDom.parse(nom);
    }
}
