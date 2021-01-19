package com.company;

public class Profesor extends Persona {

    private String nss;
    private String asignatura;

    public Profesor(String nombre, String dni, String telf, String email, String dirección, String nss, String asignatura) {
        super(nombre, dni, telf, email, dirección);
        this.nss = nss;
        this.asignatura = asignatura;
    }
}
