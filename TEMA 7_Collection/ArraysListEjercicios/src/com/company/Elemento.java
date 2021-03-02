package com.company;

import java.util.Objects;

public class Elemento {

    private String nombre;
    private double Precio;
    private int cantidad;

    public Elemento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        Precio = precio;
        this.cantidad = cantidad;
    }

    public Elemento(String nombre) {
        this(nombre,10,1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o;
        return Double.compare(elemento.Precio, Precio) == 0 && Objects.equals(nombre, elemento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Precio);
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "nombre='" + nombre + '\'' +
                ", Precio=" + Precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
