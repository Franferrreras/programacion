package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListaOrdenada extends LinkedList {

    //private ArrayList list = new ArrayList();

    public <E> void isnertarOrdenado(E elemento) {
        this.add(elemento);
        Collections.sort(this);
        System.out.println(this);
    }
}
