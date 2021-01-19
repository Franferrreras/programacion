package com.company;

public class Alumnos extends Persona {

    private String nombre;
    private Integer edad;

    public Alumnos(String nombre, String dni, String telf, String email, String dirección, String nombre1, Integer edad) {
        super(nombre, dni, telf, email, dirección);
        this.nombre = nombre1;
        this.edad = edad;
    }

    public Alumnos(String nombre, String dni, String telf, String dirección, String nombre1, Integer edad) {
        super(nombre, dni, telf, dirección);
        this.nombre = nombre1;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
