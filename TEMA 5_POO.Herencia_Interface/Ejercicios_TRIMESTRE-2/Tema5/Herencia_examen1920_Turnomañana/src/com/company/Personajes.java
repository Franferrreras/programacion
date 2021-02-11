package com.company;

public abstract class Personajes implements Comparable<Personajes> {

    private String nombre;
    private int energia;
    private int capAtaque;
    private int capacidadDefensa;
    private boolean encantado;

    public Personajes(String nombre, int energia,int capAtaque, int capacidadDefensa, boolean encantado) {
        this.nombre = nombre;
        this.energia = energia = (energia>100 || energia <0)?100:energia;
        this.capAtaque = capAtaque = (capAtaque>100 || capAtaque <0)?100:capAtaque;
        this.capacidadDefensa = capacidadDefensa;
        this.encantado = encantado;
    }

    public Personajes(String nombre) {
        this(nombre,100,50,30,false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    public int getCapAtaque() {
        return capAtaque;
    }

    public void setCapAtaque(int capAtaque) {
        this.capAtaque = capAtaque;
    }

    @Override
    public int compareTo(Personajes o) {
        return getEnergia() - o.getEnergia();
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capAtaque=" + capAtaque +
                ", capacidadDefensa=" + capacidadDefensa +
                ", encantado=" + encantado +
                '}';
    }
}
