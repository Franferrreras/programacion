package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Suite {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,Empleado> empleados = new LinkedHashMap<>();
        String opcion;


        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.bin"));
            while (true) {
                Empleado e = (Empleado) ois.readObject();
                empleados.put(e.getDni(),e);
            }

        } catch (Exception e) {
            System.out.println("Fichero cargado");
        }
        imprimirMenu();

        while (!(opcion = sc.nextLine()).equals("6")) {
            switch (opcion) {
                case "1":
                    if (empleados.size()==0) {
                        System.out.println("Ningun empleado cargado");
                    }else {
                        System.out.println(empleados);
                    }
                    break;
                case "2":
                    String clave;
                    System.out.println("introduzca el deni del empleado a eliminar");
                    clave = sc.nextLine();

                    if (empleados.containsKey(clave)) {
                        empleados.remove(clave);
                    }else {
                        System.out.println("El empleado no existe");
                    }
                    break;
                case "3":
                    String dni;
                    System.out.println("Introduce el nombre del empleado a mostrar");
                    dni = sc.nextLine();

                    if (empleados.containsKey(dni)) {
                        Empleado e = empleados.get(dni);
                        System.out.println(e);
                    }else {
                        System.out.println("El empleado no existe");
                    }
                    break;
                case "4":
                    String dn;
                    String nombre;
                    int edad;
                    double estatura;
                    double sueldo;
                    System.out.println("Introduce el dni");
                    dn = sc.nextLine();

                    if (empleados.containsKey(dn)){
                        System.out.println("Introduce el nombre");
                        nombre = sc.nextLine();
                        System.out.println("Introduce la edad");
                        edad = sc.nextInt();
                        System.out.println("Introduce la estatura");
                        estatura = sc.nextDouble();
                        System.out.println("Introduce Sueldo");
                        sueldo = sc.nextDouble();

                        Empleado e = empleados.get(dn);

                        e.setNombre(nombre);
                        e.setSueldo(sueldo);
                        e.setEdad(edad);
                        e.setEstatura(estatura);
                    }
            }
        }
    }


    public static void imprimirMenu() {
        System.out.println("1.VISUALIXAR LISATDO");
        System.out.println("2.BORRAR EMPLEADOS");
        System.out.println("3.VISUALIZAR EMPLEADO");
        System.out.println("4.MODIFICAR EMPLEADO");
        System.out.println("5.INSERTAR EMPLEADOS");
        System.out.println("6.SALIR");
    }
}
