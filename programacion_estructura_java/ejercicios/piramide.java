package com.company;

import java.util.Scanner;

public class piramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.println("Introduzca tamaño de piramide");
        tam = sc.nextInt();

        /*for (int f=1 ; f<=(tam+1)/2 ; f++) {
            for (int c=1 ; c<=tam ; c++) {
             if( f+c >= ((tam+1)/2)+1 && c-f <= tam/2 ) {
                 System.out.print(" *");
             }else {
                 System.out.print("  ");
             }
            }System.out.println("");
        }*/

        for (int f=1 ; f<=tam ; f++) {
            for (int c=1 ; c <= (tam*2)-1 ; c++) {
                if( f+c >= tam+1 && c-f <= tam-1 ) {
                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }

    }
}
