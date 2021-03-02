package com.company;

import java.util.Objects;

public class Carta {


    private String numero;
    private String palo;

    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero.equals(carta.numero) && palo.equals(carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

    @Override
    public String toString() {
        return "carta='" + numero + '\'' +
                ", palo='" + palo + '\'' +
                '}';
    }
}
