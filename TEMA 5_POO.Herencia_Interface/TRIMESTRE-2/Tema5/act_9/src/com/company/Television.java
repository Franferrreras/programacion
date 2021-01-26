package com.company;

public class Television extends Electrodomesticos {

    private double resolucion;
    private boolean sintonizadorTDT;


    public Television() {
        super();
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(double precioBase, Color color, Consumo consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double getPrecioFinal() {
        return super.getPrecioFinal()+(resolucion>40 ? super.getPrecioFinal()*0.3 : 0)
                +(sintonizadorTDT?50 : 0);
    }

}
