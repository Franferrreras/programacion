package com.company;

import java.util.Scanner;

public class actividad8_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
        // Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las edades,
        // la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
        int num,suma,num_alumno,num_adultos;

        suma=0;
        num_alumno=0;
        num_adultos=0;


                System.out.println("Introduzca edades");
                num = sc.nextInt();

                while (num>0) {
                    num_alumno++;
                    suma += num;
                    if (num>18) {
                        num_adultos++;
                    }

                    System.out.println("Introduzca edades");
                    num = sc.nextInt();
                }

                System.out.println("La suma es "+suma);
                System.out.println("La media es "+suma/num_alumno);
                System.out.println("el numero de adultos es "+num_adultos);
    }
}
