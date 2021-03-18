package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombre;
        String tiempo;
        int dorsal;
        String categoria;
        String pais;

        Maraton maraton = new Maraton();

        Atleta at1 = new Atleta("Sancho","Marrueco",Categoria.SENIOR,true);
        Atleta at2 = new Atleta("Carlos","Portugal",Categoria.SENIOR,true);
        Atleta at3 = new Atleta("Matias","España",Categoria.SENIOR,true);
        Atleta at4 = new Atleta("Cristina","España",Categoria.SENIOR,true);
        Atleta at5 = new Atleta("Leonora","Italia",Categoria.SENIOR,true);
        Atleta at6 = new Atleta("Elizabeth","UK",Categoria.JUNIOR,true);
        Atleta at7 = new Atleta("Maria","UK",Categoria.JUNIOR,true);
        Atleta at8 = new Atleta("Michael","UK",Categoria.JUNIOR,true);
        Atleta at9 = new Atleta("Ernesto","UK",Categoria.JUNIOR,false);
        Atleta at10 = new Atleta("Mario","UK",Categoria.JUNIOR,true);
        Atleta at11 = new Atleta("Levi","Roma",Categoria.VETERANO,true);
        Atleta at12 = new Atleta("Sofia","Francia",Categoria.VETERANO,true);
        Atleta at13 = new Atleta("Micael","Brasil",Categoria.VETERANO,false);
        Atleta at14 = new Atleta("Dimitri","Rusia",Categoria.VETERANO,true);
        Atleta at15 = new Atleta("Bran","Rusia",Categoria.VETERANO,false);



        maraton.inscribirAtleta(at1);
        maraton.inscribirAtleta(at2);
        maraton.inscribirAtleta(at3);
        maraton.inscribirAtleta(at4);
        maraton.inscribirAtleta(at5);
        maraton.inscribirAtleta(at6);
        maraton.inscribirAtleta(at7);
        maraton.inscribirAtleta(at9);
        maraton.inscribirAtleta(at10);
        maraton.inscribirAtleta(at11);
        maraton.inscribirAtleta(at12);
        maraton.inscribirAtleta(at13);
        maraton.inscribirAtleta(at14);
        maraton.inscribirAtleta(at15);
        maraton.inscribirAtleta(at8);



        do {
            menu();
            opcion = sc.nextInt();

            if (opcion==1) {
                maraton.cargarAtletas();
            }
            if (opcion==2){
                maraton.guardarAtletas();
            }
            if (opcion==3){
               System.out.println("introduzca nombre del atleta");
            }
            if (opcion==4){

                sc.nextLine();
                System.out.println("Indique el dorsal del atleta");
                dorsal = sc.nextInt();

                System.out.println("Qué tiempo desea registrar");
                tiempo = sc.nextLine();

               maraton.guardarTiempo(dorsal,tiempo);
                sc.nextLine();
            }
            if (opcion==5){
                sc.nextLine();
                System.out.println("Indique el dorsal del atleta a borrar");
                dorsal = sc.nextInt();

                maraton.borarAtleta(dorsal);
                sc.nextLine();
            }
            if (opcion==6){
                maraton.mostrarListaFinisher();
            }
            if (opcion==7){
                sc.nextLine();
                System.out.println("Indice la categoria en mayuscula");
                categoria = sc.nextLine();
                maraton.mostrarLIstaCategoria(Categoria.valueOf(categoria));
                sc.nextLine();
            }
            if (opcion==8){
                sc.nextLine();
                System.out.println("Indique el país de los participantes");
                pais = sc.nextLine();
                maraton.participantePorPais(pais);
                sc.nextLine();
            }

            sc.nextLine();
        }while (opcion != 9);



        /*maraton.inscribirAtleta(at1);
        maraton.inscribirAtleta(at2);
        System.out.println(maraton.lista_atleta.containsKey(1));*/


    }

    public static void menu() {
        System.out.println("1.-Cargar Atletas");
        System.out.println("2.-Guardar Atletas");
        System.out.println("3.-Inscribir Atletas");
        System.out.println("4.-Guardar Tiempo que recibirá el dorsal del atleta");
        System.out.println("5.-Borrar Atleta");
        System.out.println("6.-MostrarListaFinisher");
        System.out.println("7.-Mostrar atletas por categoría");
        System.out.println("8.-Numero de participantes por país");
        System.out.println("9.-Salir");
        System.out.println("");
    }
}
