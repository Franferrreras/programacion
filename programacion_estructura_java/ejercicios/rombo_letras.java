package com.company;

import java.util.Scanner;

public class rombo_letras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;



        System.out.println("Introduzca altura del rombo");
        word = sc.nextLine();

        word = word.toUpperCase();


        for (int f=1 ; f<=word.length() ; f++) {
            for (int c=1 ; c<=word.length() ; c++) {
                if (f+c >=((word.length()+1)/2)+1 && c-f <= word.length()/2 && f-c<=word.length()/2 && ((f+c)-word.length() <= (word.length()/2)+1)) {
                    System.out.print(word.charAt(c));
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }
    }
}
