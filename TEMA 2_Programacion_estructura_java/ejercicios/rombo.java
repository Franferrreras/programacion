package com.company;

import java.util.Scanner;

public class rombo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.println("Introduzca altura del rombo");
        tam = sc.nextInt();

        //rombo normal
        for (int f=1 ; f<=tam ; f++) {
            for (int c=1 ; c<=tam ; c++) {
                if (f+c >=((tam+1)/2)+1 && c-f <= tam/2 && f-c<=tam/2 && ((f+c)-tam <= (tam/2)+1)) {
                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }

        //Rombo hueco
        /*for (int f=1 ; f<=tam ; f++) {
            for (int c=1 ; c<=tam ; c++) {
                if (f+c ==((tam+1)/2)+1 || c-f == tam/2 || f-c==tam/2 || ((f+c)-tam == (tam/2)+1)) {
                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }*/

    }
}
