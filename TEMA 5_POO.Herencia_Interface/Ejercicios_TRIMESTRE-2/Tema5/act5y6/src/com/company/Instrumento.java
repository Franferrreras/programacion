package com.company;

import java.util.Arrays;

public abstract class Instrumento {

    //Actividad 5: Crear la clase Instrumento, que es una clase abstracta que almacena
    // un máximo de 100 notas musicales. Mientras haya sitio es posible añadir nuevas notas musicales,
    // al final, con el método add(). La clase también dispone del método
    // abstracto interpretar() que en cada subclase que herede de Instrumento,
    // mostrará por consola las notas musicales según las interprete.
    // Utilizar enumerados para definir las notas musicales.

    private Notas[] notas;
    final int cap_max=100;

    public Instrumento() {
        this.notas = new Notas[0];
    }

    public Notas[] getNotas() {
        return notas;
    }

    public void setNotas(Notas[] notas) {
        this.notas = notas;
    }

    public int getCap_max() {
        return cap_max;
    }


    public boolean addNota(Notas n) {
        if (this.notas.length==cap_max) {
            return false;
        }else {
            this.notas = Arrays.copyOf(notas,notas.length+1);
            this.notas[notas.length-1] = n;
            return true;
        }
    }


}
