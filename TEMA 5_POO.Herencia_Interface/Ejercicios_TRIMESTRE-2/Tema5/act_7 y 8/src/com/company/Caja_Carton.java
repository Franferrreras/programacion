package com.company;

public class Caja_Carton extends Caja {

    Etiquetaid etiquetaid;

    public Caja_Carton(double ancho, double alto, double fondo, Etiquetaid etiqueta) {
        super(ancho, alto, fondo);
        etiqueta = etiqueta;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen();
    }
}
