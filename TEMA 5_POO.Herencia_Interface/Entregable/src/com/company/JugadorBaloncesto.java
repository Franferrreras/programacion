package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class JugadorBaloncesto extends Participantes implements Encestar {

    private double altura;

    public JugadorBaloncesto(String nombreAtleta, int edadAtleta,double altura) {
        super(nombreAtleta, edadAtleta);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    void hacerJuramento() {
        System.out.println("Yo "+nombreAtleta+" como jugador de baloncesto, juro los valores deportivos mundiales");
    }



    @Override
    public String toString() {
        return "JugadorBaloncesto{" +
                "altura=" + altura +
                ", nombreAtleta='" + nombreAtleta + '\'' +
                ", edadAtleta=" + edadAtleta +
                '}';
    }



}
