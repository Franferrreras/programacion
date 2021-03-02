package com.company;

import java.util.Scanner;

public class EjCarrito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;
        CarritoCompra c = new CarritoCompra();

        do {
            mostrarMenu();
            opcion = sc.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Introduce el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("Introduce el precio del producto");
                Double precio = sc.nextDouble();
                System.out.println("Introduce l cantidad del producto");
                Integer cantidad = sc.nextInt();
            }

        }while (!opcion.equals("3"));
    }

    public static void mostrarMenu() {
        System.out.println("1.- Añadir carrito");
    }
}
