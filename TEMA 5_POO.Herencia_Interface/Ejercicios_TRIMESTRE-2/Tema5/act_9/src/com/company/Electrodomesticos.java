package com.company;

public class Electrodomesticos {

    protected double precioBase;
    protected Color color;
    protected Consumo consumoEnergetico;
    protected double peso;


    public Electrodomesticos(double precioBase, Color color, Consumo consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomesticos() {
        this(100,Color.Blanco,Consumo.F,5);
    }

    public Electrodomesticos(double precioBase, double peso) {
        this(precioBase,Color.Blanco,Consumo.F,peso);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Consumo consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioFinal() {
        return precioBase+precioConsumo()+precioPeso();
    }

    public double precioConsumo() {
        switch (this.consumoEnergetico) {
            case A:
                return 100;
            case B:
                return 80;
            case C:
                return 60;
            case D:
                return 50;
            case E:
                return 30;
            default:
                return 10;
        }
    }

    public double precioPeso() {
        if (peso >0 && peso<30) {
            return 10;
        }else if (peso>=30 && peso <50) {
            return 60;
        }else if (peso>50 && peso <80) {
            return 80;
        }else {
            return 100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "precioBase: " + precioBase +
                ", color:" + color +
                ", consumoEnergetico: " + consumoEnergetico +
                ", peso: " + peso +
                ", precioFinal: "+ getPrecioFinal()+
                '}';
    }
}
