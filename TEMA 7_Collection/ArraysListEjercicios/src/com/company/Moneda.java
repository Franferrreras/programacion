package com.company;

public class Moneda {

    private String moneda;
    private String posicion;

    public Moneda(String moneda, String posicion) {
        this.moneda = moneda;
        this.posicion = posicion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "moneda='" + moneda + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
