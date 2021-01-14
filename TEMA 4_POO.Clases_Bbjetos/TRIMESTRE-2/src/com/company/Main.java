package com.company;

import com.company.Personal.Maquinista;
import com.company.Personal.Mecanico;
import com.company.Pileta.Pila;
import com.company.maquinaria.Locomotora;
import com.company.maquinaria.Tren;
import com.company.maquinaria.Vagon;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*Mecanico pepe = new Mecanico("Pepe Perez","666777888");
        Locomotora loc = new Locomotora("2222XXX777",5000,2000,pepe);
        Maquinista maquinista = new Maquinista("Julián Rodríguez","6666555X",1500,"Oficial");
        Vagon[] vagones = {new Vagon(10000,1500,"MERCANCIA"),
                new Vagon(11000,1500,"PASAJEROS"),
                new Vagon(12000,1500,"PASAJEROS"),
                new Vagon(13000,1500,"PASAJEROS")};



        Tren tren1 = new Tren(maquinista, loc);

        Tren tren2 = new Tren(maquinista,loc,vagones);

        System.out.println(tren1);
        System.out.println(tren2);

        System.out.println(tren1.addVagon(new Vagon(15000,1500,"PASAJEROS")));

        System.out.println(tren1);

        if (tren2.addVagon(new Vagon(15000,1500,"PASAJEROS"))) {
            System.out.println("AÑADIDO");
        }

        System.out.println(tren2);*/

        Pila pil4 = new Pila();

        pil4.addPila(2);

        pil4.addPila(7);
        pil4.addPila(3);

        System.out.println(pil4);

        pil4.removerPila();

        System.out.println(pil4);

    }
}
