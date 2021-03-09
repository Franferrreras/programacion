package com.company;

public class LineaPedido2_MapIV_Ex2 {

    private String producto;
    private int cantidad;

    public LineaPedido2_MapIV_Ex2(String producto, int cantidad) {
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
        return "LineaPedido2_MapIV_Ex2{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
