package com.company;

public abstract class Aerio extends Vehiculo {

    protected double altitud;
    protected String oaci;


    public Aerio(String nombre, int plazas, double altitud, String oaci) {
        super(nombre, plazas);
        this.altitud = altitud;
        this.oaci = oaci;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public String getOaci() {
        return oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }


}
