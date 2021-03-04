package com.company;

public class Ejtraductor {
    public static void main(String[] args) {

        Traductor tr = new Traductor("traductor.txt");

        System.out.println(tr.getDiccionario());

        System.out.println(tr.traducir("hola"));


    }
}
