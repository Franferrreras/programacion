package com.company;

import java.util.Arrays;

public class Entregable_1920_ex4 {

    public static void main(String[] args) {


        /*Ejercicio 4

        Define la función convierteArrayEnString con la siguiente cabecera:
        public static String convierteArrayEnString(int[] a)
        Esta función toma como parámetro un array que contiene números y devuelve
        una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
        vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
        devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
        “62501”.*/

       int[] a = {6,7,8,9,10};


    }

    public static String covierteArrayEnString(int[] a) {

        String resultado = "";

        for (int i = 0; i < a.length ; i++) {

            resultado[i] = Integer.toString(a);
        }
    }
}
