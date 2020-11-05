package com.company;

import java.util.Scanner;

public class binario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num,resto;
        String num_bi;
        resto=0;
        num_bi="";


        System.out.println("Introduce numero");
        num = sc.nextInt();

        while (num>0){

            resto = num%2;
            num_bi =   resto + num_bi;
            num=num/2;
        }

       /* while (num_inv_bi!=0){

            resto = num_inv_bi % 10;
            num_bi = num_bi*10 + resto;
            num_inv_bi = num_inv_bi / 10;

        }*/
        System.out.println(num_bi);

    }
}
