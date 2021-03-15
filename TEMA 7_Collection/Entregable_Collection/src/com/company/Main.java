package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Alumnos a1 = new Alumnos("Juaquin","Aernandez Sabrina","12345678X","3ºA");
        Alumnos a2 = new Alumnos("Fernando","Valdes Rovira","23456789J");
        Alumnos a3 = new Alumnos("María","Fernandez Guiterrez","34567890D");
        Alumnos a4 = new Alumnos("Fernandinho","Zapata Rovira","123756789J");
        Alumnos a5 = new Alumnos("Lola","Díaz Laflor","45678901J","2ºB");


        Unidad und = new Unidad();

        und.addAlumnoUnidad(a1,"3ºA");
        und.addAlumnoUnidad(a2,"4ºA");
        und.addAlumnoUnidad(a3,"2ºA");
        und.addAlumnoUnidad(a3,"4ºA");
        und.addAlumnoUnidad(a4,"4ºA");
        und.addAlumnoUnidad(a5,"2ºB");

        und.mostrarTodosAlumnosOrdenados();
        und.obtenerUnidadAlumno(1);
        und.mostrarAlumnosUnidad("4ºA");
        //und.guardarAlumno();
        und.cargarAlumnos();
    }

}
