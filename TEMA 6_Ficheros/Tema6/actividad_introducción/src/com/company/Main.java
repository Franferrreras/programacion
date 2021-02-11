package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        String a;

        System.out.println("Introduzca nombre del fichero");
        a = sc.nextLine();


        /*try{
            FileWriter out  = new FileWriter("nuevoejemplo.txt");
            BufferedWriter bw = new BufferedWriter(out);

            bw.write(97);
            bw.newLine();
            bw.write("DIOS");

        }catch (IOException e) {
            e.printStackTrace();
        }*/


        try{
            FileWriter out  = new FileWriter(a = (a.equals(""))? "prueba.txt": a);
            BufferedWriter bw = new BufferedWriter(out);

            bw.write(97);
            bw.newLine();
            bw.write("DIOS");

        }catch (IOException e) {
            e.printStackTrace();
        }







    }
}
