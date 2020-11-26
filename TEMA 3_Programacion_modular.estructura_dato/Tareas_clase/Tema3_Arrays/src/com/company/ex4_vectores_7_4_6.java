package com.company;

import java.util.Scanner;

public class ex4_vectores_7_4_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        long[] dias = new long[10];
        int mes;


        for (int i = 1; i < dias.length ; i++) {
            System.out.println("introduzca numero");
            dias[i] = sc.nextInt();
        }

        System.out.println("introduzca numero que quiere saber ");
        mes = sc.nextInt();

        boolean esta = false;

        for (int i = 0; i < dias.length ; i++) {
            if ( dias[i]== mes){
                esta=true;
                break;
            }
        }
        if (esta) {
            System.out.println("El numero está");
        }else {
            System.out.println("El número no está");
        }

    }
}
