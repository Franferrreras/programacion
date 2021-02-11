package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Edicion {

    private int añoCelebracion;
    private String cede;
    private  Pais[] pais;
    private Deporte[] deportes;

    public Edicion(int añoCelebracion, String cede, Pais[] pais, Deporte[] deportes) {
        this.añoCelebracion = añoCelebracion;
        this.cede = cede;
        this.pais = pais;
        this.deportes = deportes;
    }

    public int getAñoCelebracion() {
        return añoCelebracion;
    }

    public void setAñoCelebracion(int añoCelebracion) {
        this.añoCelebracion = añoCelebracion;
    }

    public String getCede() {
        return cede;
    }

    public void setCede(String cede) {
        this.cede = cede;
    }

    public Pais[] getPais() {
        return pais;
    }

    public void setPais(Pais[] pais) {
        this.pais = pais;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public Edicion(int añoCelebracion, String cede) {
      this(añoCelebracion,cede,new Pais[0],new Deporte[0]);
    }


    public void quitarPais(Pais pais1) {

        Pais[] resultado = new Pais[pais.length-1];
        int contador = 0;
        for (int i = 0; i < pais.length ; i++) {
            if (!pais.equals(pais1.getNombre())) {
                resultado[contador] = pais[i];
                contador++;
            }
        }

        pais = resultado;
    }

    public void añadirPais(Pais p) {
        pais = Arrays.copyOf(pais,pais.length+1);
        pais[pais.length-1] = p;
    }


    public void añadirDeporte(Deporte deport) {
        deportes = Arrays.copyOf(deportes,deportes.length+1);
        deportes[deportes.length-1] = deport;
    }

    public void quitarDeporte(Deporte deport) {

        Deporte[] resultado = new Deporte[deportes.length-1];

        int contador = 0;
        for (int i = 0; i < deportes.length ; i++) {
            if (!deportes.equals(deport.getNombreDeporte())) {
                resultado[contador] = deportes[i];
                contador++;
            }
        }
        deportes = resultado;
    }

    public void mostrarPaises() {
        System.out.println(Arrays.deepToString(pais));
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(pais, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
    }



}
