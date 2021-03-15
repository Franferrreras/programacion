package com.company;

import java.util.*;

public class MainMapIVEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Double> lista_precios = new HashMap<String, Double>();
        List productos = new ArrayList<LineaPedido_MapIV_Ex1>();
        String producto;
        int cantidad;
        double total = 0.0;

        lista_precios.put("tomate",1.59);
        lista_precios.put("quinoa",4.50);
        lista_precios.put("avena",2.21);


        do {
            System.out.println("Que producto quiere comprar");
            producto = sc.nextLine();
            if (!producto.equals("fin")) {
                System.out.println("Cuantos botes de "+producto+" quiere");
                cantidad = sc.nextInt();

                LineaPedido_MapIV_Ex1 lp = new LineaPedido_MapIV_Ex1(producto,cantidad);
                productos.add(lp);
            }
            sc.nextLine();
        }while (!producto.equals("fin"));

        Iterator it = productos.iterator();
        System.out.println("-----------------------------");
        while (it.hasNext()) {
            LineaPedido_MapIV_Ex1 p = (LineaPedido_MapIV_Ex1) it.next();
            Double precio_unitario = lista_precios.get(p.getProducto());
            System.out.println("     ");
            System.out.println(p.getProducto()+"     "+precio_unitario+"      "+p.getCantidad());

            total+= p.getCantidad()*precio_unitario;
        }

        System.out.println("---------------------------------");
        System.out.println("TOTAL: "+total);
    }


}
