package com.company;

import java.util.Arrays;

public class Empresa {

    private String nombreEmpresa;
    private static Departamento[] listDepartamento;


    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listDepartamento = new Departamento[0];
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Departamento[] getListDepartamento() {
        return listDepartamento;
    }

    public void setListDepartamento(Departamento[] listDepartamento) {
        this.listDepartamento = listDepartamento;
    }

    public void anadirDepartamento(Departamento depart) {
        listDepartamento = Arrays.copyOf(listDepartamento,listDepartamento.length+1);
        listDepartamento[listDepartamento.length-1] = depart;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", listDepartamento=" + Arrays.toString(listDepartamento) +
                '}';
    }
}
