package com.company;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Realizar un programa que dibuja flechas señalando hacia la izquierda. Se solicitará al usuario la altura de la flecha que deberá ser impar y mayor o igual que tres. En caso de no ser así se seguirá solicitando la altura:

        El "palito" de la flecha será siempre de 5 caracteres "*"*/

        int altura;

        System.out.println("Introduzca altura");
        altura = sc.nextInt();

        for (int f=1 ; f<=altura ; f++) {
            for ( int c=1 ; c<= ((altura+1)/2)+5 ; c++) {
                if ( f+c >= ((altura+1)/2)+1 && f-c <= altura/2 && c<= (altura+1)/2 ) {
                    System.out.print(" *");
                }else if (f == (altura+1)/2 ) {
                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }
            }System.out.println("");
        }
    }
}
