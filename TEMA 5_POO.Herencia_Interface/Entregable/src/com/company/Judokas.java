package com.company;

public class Judokas extends Participantes implements Luchar {

    private int pesoCategoria;

    public Judokas(String nombreAtleta, int edadAtleta,int pesoCategoria) {
        super(nombreAtleta, edadAtleta);
        this.pesoCategoria = pesoCategoria;
    }

    public Judokas(String nombreAtleta, int edadAtleta) {
        super(nombreAtleta, edadAtleta);
        this.pesoCategoria = 60;
    }

    public int getPesoCategoria() {
        return pesoCategoria;
    }

    public void setPesoCategoria(int pesoCategoria) {
        this.pesoCategoria = pesoCategoria;
    }

    @Override
    void hacerJuramento() {
        System.out.println("Yo "+nombreAtleta+" como judoka, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Judokas{" +
                "pesoCategoria=" + pesoCategoria +
                ", nombreAtleta='" + nombreAtleta + '\'' +
                ", edadAtleta=" + edadAtleta +
                '}';
    }
}
