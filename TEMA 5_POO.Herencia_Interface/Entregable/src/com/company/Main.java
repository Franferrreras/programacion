package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Pais p1 = new Pais("España",10);
        Pais p2 = new Pais("Alemania",7);
        Pais p3 = new Pais("Inglaterra",5);

        JugadorBaloncesto jb = new JugadorBaloncesto("Curry",24,1.93);
        JugadorBaloncesto jb2 = new JugadorBaloncesto("Lebron",28,2.03);
        JugadorBaloncesto jb3 = new JugadorBaloncesto("Duran",30,1.98);
        JugadorBaloncesto jb4 = new JugadorBaloncesto("Onil",45,2.10);
        JugadorBaloncesto jb5 = new JugadorBaloncesto("Cove",40,1.94);

        JugadorBaloncesto jb6 = new JugadorBaloncesto("Jordan",30,1.97);
        JugadorBaloncesto jb7 = new JugadorBaloncesto("Alexis",22,2.05);
        JugadorBaloncesto jb8 = new JugadorBaloncesto("Abraan",18,1.93);
        JugadorBaloncesto jb9 = new JugadorBaloncesto("Lester",26,2.12);
        JugadorBaloncesto jb10 = new JugadorBaloncesto("Richar",42,1.96);

        JugadorBaloncesto[] paritcipantesBaloncesto = new JugadorBaloncesto[10];
        paritcipantesBaloncesto[0] = jb;
        paritcipantesBaloncesto[1] = jb2;
        paritcipantesBaloncesto[2] = jb3;
        paritcipantesBaloncesto[3] = jb4;
        paritcipantesBaloncesto[4] = jb5;
        paritcipantesBaloncesto[5] = jb6;
        paritcipantesBaloncesto[6] = jb7;
        paritcipantesBaloncesto[7] = jb8;
        paritcipantesBaloncesto[8] = jb9;
        paritcipantesBaloncesto[9] = jb10;




        Arrays.sort(paritcipantesBaloncesto, new Comparator<JugadorBaloncesto>() {
            @Override
            public int compare(JugadorBaloncesto o1, JugadorBaloncesto o2) {
                JugadorBaloncesto j1 = (JugadorBaloncesto)o1;
                JugadorBaloncesto j2 = (JugadorBaloncesto)o2;
                return (int)(j1.getAltura()-j2.getAltura());
            }
        });

        for (int i = 0; i < paritcipantesBaloncesto.length; i++) {
            System.out.println(paritcipantesBaloncesto[i]);
        }




        Baloncesto baloncesto = new Baloncesto("Baloncesto","quinto",paritcipantesBaloncesto,2);


        Pais[] paises = new Pais[3];
        paises[0] = p1;
        paises[1] = p2;
        paises[2] = p3;



        Edicion ed = new Edicion(2019,"Barcenola",paises,  )


    }
}
