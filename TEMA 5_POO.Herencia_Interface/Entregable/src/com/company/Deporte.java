package com.company;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Deporte {

    protected String nombreDeporte;
    protected String Pabellon;
    protected Participantes[] participantes;

    public Deporte(String nombreDeporte, String pabellon, Participantes[] participantes) {
        this.nombreDeporte = nombreDeporte;
        Pabellon = pabellon;
        this.participantes = participantes;
    }

    public Deporte(String nombreDeporte, String pabellon) {
        this(nombreDeporte,pabellon, new Participantes[0]);
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getPabellon() {
        return Pabellon;
    }

    public void setPabellon(String pabellon) {
        Pabellon = pabellon;
    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes[] participantes) {
        this.participantes = participantes;
    }

    public void añadirParticipante(Participantes part){
        participantes = Arrays.copyOf(participantes,participantes.length+1);

        participantes[participantes.length-1] = part;
    }

    public void quitarParticipantes(Participantes part) {
        Participantes[] resultado = new Participantes[participantes.length-1];
        int contador = 0;
        for (int i = 0; i <participantes.length ; i++) {
            if (!participantes.equals(part.getNombreAtleta())){
                resultado[contador] = participantes[i];
                contador++;
            }
        }

        participantes = resultado;
    }

    public void mostrarParticipantes(){
        Arrays.sort(participantes, new Comparator<Participantes>() {
            @Override
            public int compare(Participantes o1, Participantes o2) {
                return o1.getEdadAtleta()-o2.getEdadAtleta();
            }
        });
    }




}
