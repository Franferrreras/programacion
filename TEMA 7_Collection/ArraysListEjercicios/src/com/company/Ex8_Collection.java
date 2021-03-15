package com.company;

import java.util.*;

public class Ex8_Collection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> norept = new LinkedHashSet<>();

        String nombre;
        String[] palabras = {"hola","mundo","como","estais","todos","mundo","hola","putos","putos"};

        System.out.println(Arrays.toString(palabras));

        eliminarRep(palabras);

    }

    public static void eliminarRep(String[] lista){
        Set<String> norep = new LinkedHashSet<>();

        norep = new LinkedHashSet<String>(Arrays.asList(lista));

        System.out.println(norep);
    }
}
