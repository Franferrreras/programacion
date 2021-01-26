package com.company;

public class Caja {

    final double ancho;
    final double alto;
    final double fondo;
    Etiqueta etiqueta;
    Unidades unidad;


    public Caja(double ancho, double alto, double fondo, Unidades unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        Etiqueta etiqueta;
    }

    public Caja(double ancho, double alto, double fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        Etiqueta etiqueta;
        unidad = Unidades.cm;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }


    public double getVolumen() {
        return (this.unidad == Unidades.m ? ancho*alto*fondo : ancho*alto*fondo/1000000);
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta=" + etiqueta +
                ", unidad=" + unidad +
                '}';
    }
}
