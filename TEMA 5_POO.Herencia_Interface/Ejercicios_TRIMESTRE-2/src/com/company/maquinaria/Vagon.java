package com.company.maquinaria;

public class Vagon {

    private double capacidad;
    private double carga;
    private String tipoMercancia;

    public Vagon(double capacidad, double carga, String tipoMercancia) {
        this.capacidad = capacidad;
        this.carga = carga;
        this.tipoMercancia = tipoMercancia;
    }

    public Vagon(double capacidad, String tipoMercancia) {
        this(capacidad,0,tipoMercancia);
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
