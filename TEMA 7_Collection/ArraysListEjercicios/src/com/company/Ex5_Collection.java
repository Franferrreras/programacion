package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex5_Collection {

    public static void main(String[] args) {

        Set<Integer> num = new LinkedHashSet<>();
        ArrayList<Integer> numor = new ArrayList<>();
        for (int i = 0; i <= 20 ; i++) {
            num.add((int)(Math.random()*100));

            numor = new ArrayList<>(num);
            numor.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            System.out.println(numor);
        }
    }
}
