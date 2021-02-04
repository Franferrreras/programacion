package com.company;

import javax.swing.*;
import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable<Terrestre> {

    protected String matricula;
    protected int anioFabricacion;
    protected Color color;
    final String tipo = "Terrestre";

    public Terrestre(String nombre, int plazas, String matricula, int anioFabricacion, Color color) {
        super(nombre, plazas);
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
    }

    public Terrestre(String nombre, String matricula, int anioFabricacion) {
        super(nombre);
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.color = Color.AZUL;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Terrestre)) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "matricula='" + matricula + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}
