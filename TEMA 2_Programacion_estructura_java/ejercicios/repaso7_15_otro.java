package com.company;

import java.util.Scanner;

public class repaso7_15_otro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        boolean esPrimo=true;
        do {
            System.out.println("intrduzca número");
            num = sc.nextInt();

            esPrimo=true;
            for (int i=2 ; i<num; i++) {
                if(num%i==0) {
                    esPrimo=false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("es primo");
            }else {
                System.out.println("no primo");
            }

        }while (num>0);
    }
}
