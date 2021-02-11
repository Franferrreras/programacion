package com.company;

public abstract class Vehiculo {

    protected double vehiculoCreado;
    protected double kilometrosTotales;
    protected double kilometrosRecorridos;

    public Vehiculo(double vehiculoCreado, double kilometrosTotales, double kilometrosRecorridos) {
        this.vehiculoCreado = vehiculoCreado;
        this.kilometrosTotales = kilometrosTotales;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Vehiculo(double vehiculoCreado) {
        this(vehiculoCreado,0,0);
    }


}
