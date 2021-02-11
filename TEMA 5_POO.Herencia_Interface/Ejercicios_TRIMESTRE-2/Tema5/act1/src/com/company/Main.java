package com.company;

public class Main {

    public static void main(String[] args) {

        Hora h = new Hora();

        Hora h1 = new Hora(23,59);


        h1.inc();
        h1.inc();

        System.out.println(h1);
    }
}
