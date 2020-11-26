package com.company;

import java.util.Arrays;

public class pag_153_5_2 {

    public static void main(String[] args) {


        int [] o = {3,5,1,4};

        System.out.println(Arrays.toString(orden(o)));

    }

    public static int [] orden(int [] v) {

        int contador,min;
        contador = 0;
        min = v[0];

        int [] ind = new int[v.length];

        for (int j = 0; j < v.length ; j++) {

                if (v[j] < min) {
                    min = v[j];
                    System.out.println(v[j]);
                    continue;
                }

            }

        return v;
        }

    }

