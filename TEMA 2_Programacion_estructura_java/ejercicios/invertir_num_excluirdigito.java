package com.company;

import java.util.Scanner;

public class invertir_num_excluirdigito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_invertido,num,resto_div;
        int num_orden;

        System.out.println("introduzca numero");
        num = sc.nextInt();

        num_invertido=0;
        num_orden=0;
        while (num!=0) {

            resto_div= num%10;
            if (resto_div!=0 && resto_div!=8) {

                num_invertido = num_invertido*10 + resto_div;
            }
            num=num/10;

        }

        while (num_invertido!=0) {
            resto_div= num_invertido%10;
            num_orden = num_orden*10 + resto_div;
            num_invertido= num_invertido / 10;
        }

        System.out.println("el numero es "+num_orden);

        //otra forma de
        /*
        añadir un String en este caso String otra_forma;
        otra_forma="";
        while (num!=0) {

            resto_div= num%10;
            if (resto_div!=0 && resto_div!=8) {

                otra_forma = otra_forma + resto_div ;  *el orden de coloar otra_forma y rest_div es importante
            }
            num=num/10;

        }*/

    }
}
