package com.company;

import java.util.Scanner;

public class x {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h;

        System.out.println("introduzca altura del triangulo");
        h = sc.nextInt();

        for (int f=1 ; f<=h ; f++) {
            for (int c=1 ; c<=h ; c++) {
                if (f+c == f*2 || f+c==h+1) {
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }System.out.println("");
        }
    }
}
