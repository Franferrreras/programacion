package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner sc = new Scanner(System.in);

        String a;

        System.out.println("Introduzca nombre del fichero");
        a = sc.nextLine();*/


        /*try{
            FileWriter out  = new FileWriter("nuevoejemplo.txt");
            BufferedWriter bw = new BufferedWriter(out);

            bw.write(97);
            bw.newLine();
            bw.write("DIOS");

        }catch (IOException e) {
            e.printStackTrace();
        }*/


       /* try{
            FileWriter out  = new FileWriter(a = (a.equals(""))? "prueba.txt": a);
            BufferedWriter bw = new BufferedWriter(out);

            bw.write(97);
            bw.newLine();
            bw.write("DIOS");

        }catch (IOException e) {
            e.printStackTrace();
        }*/

        Persona persona = new Persona("Gilgamesh","Ramsez");
        Persona paux = new Persona("Marina","Vargas");
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("ejemplo.txt"));
            flujoSalida.writeInt(50);
            flujoSalida.writeObject(persona);
            flujoSalida.writeObject(paux);
            flujoSalida.writeObject(numeros);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("ejemplo.txt"));

            Object o1 = flujoEntrada.readInt();
            Object o2 = flujoEntrada.readObject();
            Object o3 = flujoEntrada.readObject();
            Object o4 = flujoEntrada.readObject();

            System.out.println("CLASE:" + o2.getClass()+"TOSTRING"+o2.toString());


            if (o2 instanceof Persona) {
                System.out.println("PERSONA");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("FINDE FICHERO");
        }catch (FileNotFoundException e) {
            System.out.println("Fichero no existe");
        } catch (IOException e) {
            System.out.println("ERROR DE ENTRADA/SALIDA");
        }
    }
}
