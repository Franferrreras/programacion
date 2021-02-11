package com.company;

public class Persona {

    String nombre;
    String dni;
    String telf;
    String email;
    String dirección;

    public Persona(String nombre, String dni, String telf, String email, String dirección) {
        this.nombre = nombre;
        this.dni = dni;
        this.telf = telf;
        this.email = email;
        this.dirección = dirección;
    }

    public Persona(String nombre, String dni, String telf, String dirección) {
        this(nombre,dni,telf,dirección,"");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}
