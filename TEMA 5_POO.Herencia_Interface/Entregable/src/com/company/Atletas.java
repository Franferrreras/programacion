package com.company;

public class Atletas extends Participantes implements Correr {

    private String nombrePrueba;

    public Atletas(String nombreAtleta, int edadAtleta,String nombrePrueba) {
        super(nombreAtleta, edadAtleta);
        this.nombrePrueba = nombrePrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    @Override
    void hacerJuramento() {
        System.out.println("Yo "+nombreAtleta+" como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "nombrePrueba='" + nombrePrueba + '\'' +
                ", nombreAtleta='" + nombreAtleta + '\'' +
                ", edadAtleta=" + edadAtleta +
                '}';
    }
}
