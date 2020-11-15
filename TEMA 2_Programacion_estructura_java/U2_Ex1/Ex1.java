package com.company;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Ejercicio 1:

        Escribir un programa que solicite al usuario un número de tarjeta de crédito del BANCO - ERESUNPRIMO y que valide lo siguiente:

        El formato del número que debe ser (incluyendo los guiones) así: 2222-3333-44-0123456789

        En este formato los 4 primeros dígitos (2222) corresponde a la entidad, el BANCO - ERESUNPRIMO.

                Los 4 siguientes corresponden a la sucursal (3333).

                Los 2 siguiente al número de control  (44)

        Los 10 últimos corresponden el número de cuenta.

        Esos 10 últimos números en todas las cuentas del BANCO - ERESUNPRIMO deben ser un número primo.

                Ejemplo:

        Introduce el número de cuenta:

        1233342341234124123

        No es un de cuenta válido

        Introduce un número de cuenta.

        2222-3333-44-0000000007

        Es un número de cuenta válido.*/

        String usuario;

        /*entidad = "2222-3";
        sucursal = "3333-";
        control = "44-";
        num_cuenta = "0123456789";*/

        //2222-3333-44-0000000007

        System.out.println("Introduzca su número de cuenta");
        usuario = sc.nextLine();

        if (usuario.substring(4,5).contains("-") && usuario.substring(9,10).contains("-") && usuario.substring(12,13).contains("-") && usuario.length()==23) {
            System.out.println("El número de cuenta es válido");
        }else {
            System.out.println("No es un número de cuenta válido");
        }


    }
}
