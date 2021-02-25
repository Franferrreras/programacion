package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex5_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= 20 ; i++) {
            if (num.indexOf(i) == num.lastIndexOf(i)) {
                num.add((int)(Math.random()*100));
            }
            num.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            System.out.println(num);
        }
    }
}
