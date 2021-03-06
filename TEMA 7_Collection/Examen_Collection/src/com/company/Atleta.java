package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Atleta implements Serializable {

    private String nombre;
    private String pais;
    private String marca;
    private Categoria categoria;
    private boolean finisher;

    public Atleta(String nombre, String pais, Categoria categoria, boolean finisher) {
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.finisher = finisher;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pis) {
        this.pais = pis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return nombre.equals(atleta.nombre) && pais.equals(atleta.pais) && categoria == atleta.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais, categoria);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", pis='" + pais + '\'' +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }
}
