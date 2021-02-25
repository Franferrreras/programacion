package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ex3_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();


        for (int i = 0; i <= 20 ; i++) {
            num.add((int)(Math.random()*10));
        }
        System.out.println(num);


        Collections.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(num);
    }

}
