package com.company;

public abstract class Vehiculo {

    protected String nombre;
    protected int plazas;

    public Vehiculo(String nombre, int plazas) {
        this.nombre = nombre;
        this.plazas = plazas;
    }

    public Vehiculo(String nombre) {
        this(nombre,5);
    }
}
