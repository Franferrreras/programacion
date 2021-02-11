package com.company;

import java.util.Arrays;

public class Judo extends Deporte{

    private int numTatamis;

    public Judo(String nombreDeporte, String pabellon, Participantes[] participantes,int numTatamis) {
        super(nombreDeporte, pabellon, participantes);
        this.numTatamis = numTatamis;
    }

    public Judo(String nombreDeporte, String pabellon) {
        super(nombreDeporte, pabellon);
        this.numTatamis = 5;
    }

    public int getNumTatamis() {
        return numTatamis;
    }

    public void setNumTatamis(int numTatamis) {
        this.numTatamis = numTatamis;
    }

    @Override
    public String toString() {
        return "Judo{" +
                "numTatamis=" + numTatamis +
                ", nombreDeporte='" + nombreDeporte + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
