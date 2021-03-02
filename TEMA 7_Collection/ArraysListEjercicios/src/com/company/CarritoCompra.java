package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

    private List listaProductos;

    public CarritoCompra() {
        this.listaProductos = new ArrayList<Elemento>();
    }

    public List getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "CarritoCompra{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
