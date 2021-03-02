package com.company;

public class Cliente  {

    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) throws EdadErroneaException,MenorEdadException{
        this.nombre = nombre;
        this.edad = edad;
        if (this.edad < 0 || this.edad > 100) {
            throw new EdadErroneaException("La edad es erronea");
        }else if (this.edad > 0 && this.edad < 18) {
            throw new MenorEdadException("Es menor de edad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadErroneaException, MenorEdadException{
        this.edad=edad;
        if (this.edad < 0 || this.edad > 100) {
            new EdadErroneaException("La edad es erronea");
        }else if (edad < 18 && edad > 0) {
            new MenorEdadException("Es menor de edad");
        }
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
