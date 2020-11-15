package com.company;

import java.util.Scanner;

public class reloj_digital {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int hora, min, seg,mas,t;

        t=0;

        System.out.println("Introduzca horas, minutos y segundos en ese orden");
        hora = sc.nextInt();
        min = sc.nextInt();
        seg = sc.nextInt();


        System.out.println("Introduzca la cantidad de segundos que quiere adelantar");
        mas = sc.nextInt();



        while (t <= mas) {
            t++;

            if (hora < 10) {
                System.out.print("0");
            }
            System.out.print(hora+":");

            if (min < 10) {
                System.out.print("0");
            }
            System.out.print(min+":");

            if (seg < 10) {
                System.out.print("0");
            }

            System.out.println(seg);
            //aumento tiempo
            seg ++;

            if(seg==60){
                seg=0;
                min++;

                if(min==60) {
                    min=0;
                    hora++;

                    if(hora==24){
                        hora=0;
                    }
                }
            }


            Thread.sleep(1000);
        }

    }
}
