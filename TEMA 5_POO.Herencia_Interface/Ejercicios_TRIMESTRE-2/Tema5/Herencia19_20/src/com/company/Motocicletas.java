package com.company;

public class Motocicletas extends Terrestre {


    public Motocicletas(String nombre, int plazas, String matricula, int anioFabricacion, Color color) {
        super(nombre, plazas, matricula, anioFabricacion, color);
    }

    public Motocicletas(String nombre, String matricula, int anioFabricacion) {
        super(nombre, matricula, anioFabricacion);
    }

    @Override
    public int compareTo(Terrestre o) {
        return 0;
    }
}
