package com.company;

import java.util.*;

public class Ex1_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i <=20 ; i++) {
            num.add((int)(Math.random()*100));
        }

        System.out.println(num);

        Collections.sort(num);

        System.out.println(num);

        //Ejercicio 2

        num.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        /*
        Collections.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        System.out.println(num);


    }

}
