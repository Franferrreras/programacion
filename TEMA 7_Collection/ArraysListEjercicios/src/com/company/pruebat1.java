package com.company;

import java.util.*;

public class pruebat1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Double> lista_precio = new HashMap<>();
        List productos = new ArrayList<LineaPedido_MapIV_Ex1>();
        String nombre_producto;
        Integer cantidad;
        double total=0;


        lista_precio.put("tomate",1.59);
        lista_precio.put("quinoa",4.50);
        lista_precio.put("avena",2.21);


        do {

            System.out.println("Introduzca el producto");
            nombre_producto = sc.nextLine();

            if (!nombre_producto.equals("fin")) {
                System.out.println("Que cantidad quiere");
                cantidad = sc.nextInt();

                LineaPedido_MapIV_Ex1 lp = new LineaPedido_MapIV_Ex1(nombre_producto,cantidad);

                if(!productos.equals(lp)) {
                    productos.add(lp);
                }else if (productos.equals(lp)){
                    Integer posicion = productos.indexOf(lp);
                    LineaPedido_MapIV_Ex1 old = (LineaPedido_MapIV_Ex1) productos.get(posicion);
                    ((LineaPedido_MapIV_Ex1) productos.get(posicion)).setCantidad(10);
                }
                sc.nextLine();
            }

            System.out.println(productos);

        }while(!nombre_producto.equals("fin"));

        System.out.println(productos);
        System.out.println("-------------------------");


       /*
        LineaPedido_MapIV_Ex1 otra = new LineaPedido_MapIV_Ex1("naranja",2);
        productos.add(otra);
        System.out.println(productos);

        Integer pos = productos.indexOf(otra);
        ((LineaPedido_MapIV_Ex1) productos.get(pos)).setCantidad(4);
        System.out.println(productos);
        */

        Iterator it = productos.iterator();
        while (it.hasNext()) {
            LineaPedido_MapIV_Ex1 p = (LineaPedido_MapIV_Ex1) it.next();
            Double precio_unitario = lista_precio.get(p.getProducto());
            System.out.println("         ");
            System.out.println(p.getProducto()+"   "+precio_unitario+"   "+p.getCantidad()+"   "+p.getCantidad()*precio_unitario);

            total += p.getCantidad()*precio_unitario;
        }
        System.out.println("--------------------");
        System.out.println("TOTAL: "+total);
    }
}
