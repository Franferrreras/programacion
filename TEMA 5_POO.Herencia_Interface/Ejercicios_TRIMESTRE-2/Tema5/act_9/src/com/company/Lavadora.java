package com.company;

import java.util.Objects;

public class Lavadora extends Electrodomesticos {

    private double carga;

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, Color color, Consumo consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        if (carga > 30) {
            return super.getPrecioFinal() + 50;
        }else {
            return super.getPrecioFinal();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavadora lavadora = (Lavadora) o;
        return Double.compare(lavadora.getPrecioFinal(), getPrecioFinal()) == 0;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", carga=" + carga +
                ",precioFinal: "+ getPrecioFinal()+
                '}';
    }
}
