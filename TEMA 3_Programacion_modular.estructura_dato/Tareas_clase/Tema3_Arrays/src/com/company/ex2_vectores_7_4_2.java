package com.company;

import java.util.Scanner;

public class ex2_vectores_7_4_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[8];

        for (int i = 0; i < num.length ; i++) {
            System.out.println("Introduzca número");
            num[i] = sc.nextInt();
        }
    }
}
