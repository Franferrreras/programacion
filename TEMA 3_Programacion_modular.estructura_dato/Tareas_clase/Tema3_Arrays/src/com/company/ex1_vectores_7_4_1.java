package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex1_vectores_7_4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] num = new double[5];
        int sum;
        sum=0;


        for (int i = 0; i < num.length ; i++) {
            System.out.println("Introduzca número");
            num[i] = sc.nextDouble();
            sum += num[i];
        }
        //System.out.println(Arrays.toString(num));
        System.out.println("La media es "+sum/ num.length);
    }
}
