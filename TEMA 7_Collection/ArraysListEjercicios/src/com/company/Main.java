package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("pepe","Fernandez","Aquí","2225434X");
        Cliente c2 = new Cliente("Jaime","Gutierrez","Allá","5346347334V");
        Cliente c3 = new Cliente("Juan","Marquez","Center","43636346J");

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c1);



        Iterator it = clientes.iterator();
        while(it.hasNext()) {
            Cliente c = (Cliente) it.next();
            System.out.println(c);
        }

        System.out.println("");

        for (Cliente c : clientes) {
            System.out.println(c);
        }

        ListaOrdenada l = new ListaOrdenada();

        l.isnertarOrdenado(1);
        l.isnertarOrdenado(4);
        l.isnertarOrdenado(8);
        l.isnertarOrdenado(2);
        l.isnertarOrdenado(6);
        l.isnertarOrdenado(3);


    }
}
