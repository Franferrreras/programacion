package com.company;

import java.io.*;
import java.util.Scanner;

public class ex_binario1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.println("Introduzca un número decimal");
        num = sc.nextDouble();



        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("tarea2.txt"));
            flujoSalida.writeDouble(num);
            flujoSalida.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("tarea2.txt"));
            Object o1 = flujoEntrada.readDouble();

            System.out.println(o1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
