package com.company;

public class Elfos extends Personajes{

    private TipoElfo tipo;


    public Elfos(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado,TipoElfo tipo) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tipo = tipo;
    }

    public Elfos(String nombre, int energia, int capAtaque, int capacidadDefensa, boolean encantado) {
        super(nombre, energia, capAtaque, capacidadDefensa, encantado);
        this.tipo = TipoElfo.BOSQUE;
    }

    public Elfos(String nombre) {
        super(nombre);
        this.tipo = TipoElfo.BOSQUE;
    }



}
