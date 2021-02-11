package com.company;

public class Warrior extends Hombres {

    private String edad;


    public Warrior(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado,String edad) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.edad = edad;
    }

    public Warrior(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.edad = "24 años";
    }

    public Warrior(String nombre) {
        super(nombre);
        this.edad = "24 años";
    }

    @Override
    public String toString() {
        return super.toString()+"edad"+edad;
    }
}
