package com.company;

import java.util.*;

public class MainMapIVEx2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Double> lista_precio = new HashMap<>();
        List productos = new ArrayList<LineaPedido2_MapIV_Ex2>();

        String nameproducto;
        int cantidad;
        double total = 0.0;
        String codDescuento;
        double descuento = 0.0;

        lista_precio.put("tomate",1.59);
        lista_precio.put("quinoa",4.50);
        lista_precio.put("avena",2.21);

        do {
            System.out.println("Introduzca el producto");
            nameproducto = sc.nextLine();

            if (!nameproducto.equals("fin")) {
                System.out.println("Introduzca la cantidad");
                cantidad = sc.nextInt();

                LineaPedido2_MapIV_Ex2 lp = new LineaPedido2_MapIV_Ex2(nameproducto,cantidad);

                if (!productos.contains(lp.getProducto())) {
                    productos.add(lp);
                }else {
                    Integer posicion = productos.indexOf(lp);
                    LineaPedido2_MapIV_Ex2 old = (LineaPedido2_MapIV_Ex2) productos.get(posicion);
                    old.setCantidad(old.getCantidad()+cantidad);
                    ((LineaPedido2_MapIV_Ex2) productos.get(posicion)).setCantidad(old.getCantidad());
                }
            }
            sc.nextLine();
        }while(!nameproducto.equals("fin"));

        System.out.println(productos);
        
        System.out.println("Introduzca código descuento");
        codDescuento = sc.nextLine();
        
        if (codDescuento.equals("descuento")){
            System.out.println("Tiene descuento");
        }else {
            System.out.println("No tiene descuento");
        }
        
        
        Iterator it = productos.iterator();
        System.out.println("-------------------");
        while (it.hasNext()) {
            LineaPedido2_MapIV_Ex2 p = (LineaPedido2_MapIV_Ex2) it.next();
            Double precio_unitario = lista_precio.get(p.getProducto());
            System.out.println("     ");
            System.out.println(p.getProducto()+"     "+precio_unitario+"      "+p.getCantidad());

            total+= p.getCantidad()*precio_unitario;
        }

        if (codDescuento.equals("descuento")){
            descuento = total*0.10;
            total-=descuento;
        }
        System.out.println("---------------------------------");
        System.out.println("Descuento = "+descuento);
        
        System.out.println("TOTAL: "+total);
        System.out.println(productos);
    }
}
