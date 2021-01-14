package com.company.maquinaria;

import com.company.Personal.Mecanico;

public class Locomotora {

    private String Matricula;
    private double Potencia;
    private int Año_Fabricacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, double potencia, int año_Fabricacion, Mecanico mecanico) {
        Matricula = matricula;
        Potencia = potencia;
        Año_Fabricacion = año_Fabricacion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    public int getAño_Fabricacion() {
        return Año_Fabricacion;
    }

    public void setAño_Fabricacion(int año_Fabricacion) {
        Año_Fabricacion = año_Fabricacion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "Matricula='" + Matricula + '\'' +
                ", Potencia=" + Potencia +
                ", Año_Fabricacion=" + Año_Fabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
