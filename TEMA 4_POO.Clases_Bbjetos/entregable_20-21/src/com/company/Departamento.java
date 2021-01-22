package com.company;

import java.util.Arrays;

public class Departamento {

    private String nombreDepartamento;
    private String sede;
    private String telefono;
    private static Empleado[] empleado;

    public Departamento(String nombreDepartamento, String sede, String telefono) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = sede;
        this.telefono = telefono;
        this.empleado = new Empleado[0];
    }

    public Departamento(String nombreDepartamento, String telefono) {
        this(nombreDepartamento,"Castilleja",telefono);
        this.empleado = new Empleado[0];
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado[] empleado) {
        this.empleado = empleado;
    }

    //Metodos ________________________
    public void anadirEmpleado(Empleado emple) {
        empleado = Arrays.copyOf(empleado,empleado.length+1);
        empleado[empleado.length-1] = emple;
    }

    public void quitarEmpleado(Empleado emple){
        Empleado[] resultado = new Empleado[empleado.length-1];
        int cont = 0;
        for (int i = 0; i < empleado.length ; i++) {
            if (empleado[i].equals(emple)) {
                break;
            }else {
               cont++;
            }
        }
        for (int i = 0; i < empleado.length ; i++) {
            if (i < cont) {
                resultado[i] = empleado[i];
            }else if(i > cont) {
                resultado[i-1] = empleado[i];
            }
        }
        empleado = Arrays.copyOf(resultado,resultado.length);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDepartamento='" + nombreDepartamento + '\'' +
                ", sede='" + sede + '\'' +
                ", telefono='" + telefono + '\'' +
                ", empleado=" + Arrays.toString(empleado) +
                '}';
    }
}
