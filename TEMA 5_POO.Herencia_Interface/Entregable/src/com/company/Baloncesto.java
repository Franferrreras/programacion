package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Baloncesto extends Deporte implements Encestar {

    private int numEquipos;

    public Baloncesto(String nombreDeporte, String pabellon, Participantes[] participantes,int numEquipos) {
        super(nombreDeporte, pabellon, participantes);
        this.numEquipos = numEquipos;
    }

    public Baloncesto(String nombreDeporte, String pabellon) {
        super(nombreDeporte, pabellon);
        this.numEquipos = 10;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }



    @Override
    public String toString() {
        return "Baloncesto{" +
                "numEquipos=" + numEquipos +
                ", nombreDeporte='" + nombreDeporte + '\'' +
                ", Pabellon='" + Pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
