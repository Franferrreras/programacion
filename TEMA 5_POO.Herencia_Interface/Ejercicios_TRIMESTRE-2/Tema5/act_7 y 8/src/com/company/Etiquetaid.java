package com.company;

public class Etiquetaid extends Etiqueta {

    private Integer id;


    public Etiquetaid(String nombre, String apellidos, String direccion,Integer id) {
        super(nombre, apellidos, direccion);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
