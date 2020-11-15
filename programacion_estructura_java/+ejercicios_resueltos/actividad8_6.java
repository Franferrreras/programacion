package com.company;

import java.util.Scanner;

public class actividad8_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Escribir todos los múltiplos de 7 menores que 100.


        for (int i=1 ; i <= 100 ; i++) {
            if(i%7==0) {
                System.out.println(i);
            }
        }




    }
}
