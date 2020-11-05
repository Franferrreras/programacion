package com.company;

import java.util.Scanner;

public class letras_figura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n1,reverse;
        reverse = "";

        System.out.println("Introduzca tamaño");
        n1 = sc.nextLine();

        int tam;
        tam=7;

        for (int f=1 ; f<=tam ; f++) {
            for (int c=1 ; c<=tam ; c++) {
                if (f+c >=((tam+1)/2)+1 && c-f <= tam/2 && f-c<=tam/2 && ((f+c)-tam <= (tam/2)+1)) {

                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }




    }
}
