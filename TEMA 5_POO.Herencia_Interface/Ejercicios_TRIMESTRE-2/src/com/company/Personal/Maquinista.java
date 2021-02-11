package com.company.Personal;

public class Maquinista {

    private String nombreCompleto;
    private String DNI;
    private double sueldo;
    private String rango;

    public Maquinista(String nombreCompleto, String DNI, double sueldo, String rango) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombre_completo) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
