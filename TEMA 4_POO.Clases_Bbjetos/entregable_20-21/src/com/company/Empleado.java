package com.company;

import java.util.Calendar;

public class Empleado {
    private String nombreCompleto;
    private String numSeguridadSocial;
    private String telefono;
    private Calendar fechaAlta;
    private Puesto puesto;

    public Empleado(String nombreCompleto, String numSeguridadSocial, String telefono, Puesto puesto) {
        this.nombreCompleto = nombreCompleto;
        this.numSeguridadSocial = numSeguridadSocial;
        this.telefono = telefono;
        Calendar.getInstance();
        this.puesto = puesto;
    }

    public Empleado(String nombreCompleto, String numSeguridadSocial, String telefono) {
        this(nombreCompleto,numSeguridadSocial,telefono,Puesto.tecnico);
        Calendar.getInstance();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numSeguridadSocial='" + numSeguridadSocial + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", puesto=" + puesto +
                '}';
    }
}
