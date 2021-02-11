package com.company;

public class Pais implements Comparable<Pais>{

    private String nombre;
    private int numParticipantes;

    public Pais(String nombre, int numParticipantes) {
        this.nombre = nombre;
        this.numParticipantes = numParticipantes;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.numParticipantes = 10;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", numParticipantes=" + numParticipantes +
                '}';
    }

    @Override
    public int compareTo(Pais o) {
        return o.numParticipantes - getNumParticipantes();
    }
}
