package com.company;

public class Mage extends Hombres {

    private double tamBarba;

    public Mage(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado,double tamBarba) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tamBarba = tamBarba;
    }

    public Mage(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tamBarba = 10;
    }

    public Mage(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+"Barba"+tamBarba;
    }
}
