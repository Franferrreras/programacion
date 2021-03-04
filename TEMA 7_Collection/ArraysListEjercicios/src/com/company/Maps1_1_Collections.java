package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps1_1_Collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni;
        String nombre;
        Map<Integer,String> persona = new HashMap<>();

        do {
            System.out.println("Introduzca el dni");
            dni = sc.nextLine();
        }while (dni.length()>9 );

        System.out.println("Introduzca el nombre");
        nombre = sc.nextLine();

        persona.put(calcularDNi(dni),nombre);

        System.out.println(persona);


    }


    public static int calcularDNi(String dni) {
        int resultado = 0;
        for (int i = 0; i < dni.length()-1 ; i++) {
            resultado+= Integer.parseInt(String.valueOf(dni.charAt(i)));
        }
        return resultado;
    }



}
