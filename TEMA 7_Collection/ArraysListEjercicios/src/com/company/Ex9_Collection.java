package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex9_Collection {

    public static void main(String[] args) {


        String[] v1 = {"Maria","Carlos","Elena","Marcos","Juan"};
        String[] v2 = {"Juan","Enrrique","Pablo","Varkat","Elizabeth"};

        String[] j1 = {"Ernesto","Carlos","Rufian","Marcos","Juan"};
        String[] j2 = {"Carlos","Rufian","Marcos","Juan","Ernesto"};

        Set<String> conjunto1 = new HashSet<>();
        Set<String> conjunto2 = new HashSet<>();
        Set<String> conjunto3 = new HashSet<>();
        Set<String> conjunto4 = new HashSet<>();

        conjunto1.addAll(Arrays.asList(v1));
        conjunto2.addAll(Arrays.asList(v2));

        conjunto3.addAll(Arrays.asList(j1));
        conjunto4.addAll(Arrays.asList(j2));



        System.out.println(conjunto1);
        System.out.println(conjunto2);

        System.out.println(conjuntoUnion(conjunto1,conjunto2));
        System.out.println(conjuntoInterseccion(conjunto1,conjunto2));
        System.out.println(diferencia(conjunto1,conjunto2));
        System.out.println(incluido(conjunto3,conjunto4));
        System.out.println(incluido(conjunto1,conjunto2));


    }

    public static Set conjuntoUnion(Set c1, Set c2) {

        Set<String> resultado = new HashSet<>();
        resultado.addAll(c1);
        resultado.addAll(c2);
        return  resultado;
    }
    //Actividad 10

    public static Set conjuntoInterseccion(Set c1, Set c2) {
        Set resultado = new HashSet(c1);

        resultado.retainAll(c2);
        return resultado;
    }

    //Actividad 11
    public static Set diferencia(Set<String> c1, Set<String> c2) {
        Set<String> resultado = new HashSet();

        for (String i : c1) {
            if (!c2.contains(i)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    //Actividad 12
    public static boolean incluido(Set c1, Set c2) {

        if (c2.containsAll(c1)) {
            return true;
        }else {
            return false;
        }
    }

    //Actividad 13
}
