package com.company;

import java.io.*;
import java.util.Scanner;

public class ex_binario3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        /*do {
            System.out.println("Introduzca números");
            num = sc.nextInt();

            try {
                ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("tarea3_binario.txt",true));
                flujoSalida.writeInt(num);
                flujoSalida.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                if (flujoSalida)
            }
        }while (num>0);*/


        ObjectOutputStream flujoSalida = null;
        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("Tarea3.dat",true));
            do {
                System.out.println("Introduzca el número");
                num = sc.nextInt();
                
                if (num >=0) {
                    flujoSalida.writeInt(num);
                }
            }while (num >=0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (flujoSalida!=null) {
                try {
                    flujoSalida.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        /*try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("Tarea3.dat"));
            while (true){
                System.out.println(flujoEntrada.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
