package com.company;

public class LineaPedido_MapIV_Ex1 {

    private String producto;
    private int cantidad;

    public LineaPedido_MapIV_Ex1(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "producto='" + producto  + ", cantidad=" + cantidad;
    }
}
