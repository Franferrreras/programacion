package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ex_binario5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("Tarea5.dat"));
            do {
                System.out.println("Introduzca números");
                num = sc.nextDouble();
            }while (num >=0);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
