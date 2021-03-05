package com.company;

import java.util.Scanner;

public class Tarea4_MapII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = "";
        String dni = "";
        String opcion = "";
        int edad = 0;
        double estatura = 0;

        do {
            cargarDatos();
            opcion = sc.nextLine();
            if (opcion.equals("1")) {

            }else if (opcion.equals("2")) {
                System.out.println("Introduzca el nombre");
                nombre = sc.nextLine();

                System.out.println("Introduzca su dni");
                dni = sc.nextLine();

                System.out.println("Introduzca su edad");
                edad = sc.nextInt();

                System.out.println("Introduzca su estatura");
                estatura = sc.nextDouble();
            }
        }while (!opcion.equals("1") || !opcion.equals("2"));

        Persona pr = new Persona(nombre,dni,edad,estatura);

        System.out.println(pr);


    }



    public static void cargarDatos() {
        System.out.println("Que quiere hacer?");
        System.out.println("1_ Cargar datos de empleados de un fichero binario");
        System.out.println("2- Escribir los datos por consola");
    }
}
