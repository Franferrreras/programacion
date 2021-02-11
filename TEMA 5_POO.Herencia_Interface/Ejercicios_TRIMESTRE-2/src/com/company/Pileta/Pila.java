package com.company.Pileta;

import java.util.Arrays;

public class Pila {

    private int[] pila;

    public Pila() {
        this.pila = new int[0];
    }

    public Pila(int[] pila) {
        this.pila = pila;
    }

    public int[] getPila() {
        return pila;
    }

    public void setPila(int[] pila) {
        this.pila = pila;
    }

    public void addPila(int num){
            this.pila = Arrays.copyOf(pila,pila.length+1);
            this.pila[pila.length-1] = num;

    }

    public boolean removerPila() {
        if (this.pila.length == 0) {
            return false;
        }else {
            this.pila = Arrays.copyOf(pila,pila.length-1);
            return true;
        }
    }


    @Override
    public String toString() {
        String resultado="";

        for (int i = pila.length-1; i >=0 ; i--) {
            resultado+="| "+pila[i]+" |"+"\n";
            resultado+="_____\n";
        }
        return resultado;
    }
}
