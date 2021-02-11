package com.company;

import java.util.Arrays;

public class Atletismo extends Deporte {

    private int numPruebas;

    public Atletismo(String nombreDeporte, String pabellon, Participantes[] participantes,int numPruebas) {
        super(nombreDeporte, pabellon, participantes);
        this.numPruebas = numPruebas;
    }

    public Atletismo(String nombreDeporte, String pabellon) {
        super(nombreDeporte, pabellon);
        this.numPruebas = 5;
    }

    public int getNumPruebas() {
        return numPruebas;
    }

    public void setNumPruebas(int numPruebas) {
        this.numPruebas = numPruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "numPruebas=" + numPruebas +
                ", nombreDeporte='" + nombreDeporte + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
