package com.company;

public abstract class Participantes {

    protected String nombreAtleta;
    protected int edadAtleta;


    public Participantes(String nombreAtleta, int edadAtleta) {
        this.nombreAtleta = nombreAtleta;
        this.edadAtleta = edadAtleta;
    }

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public int getEdadAtleta() {
        return edadAtleta;
    }

    public void setEdadAtleta(int edadAtleta) {
        this.edadAtleta = edadAtleta;
    }


    abstract void hacerJuramento();

}
