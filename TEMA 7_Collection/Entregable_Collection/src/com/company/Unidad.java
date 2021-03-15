package com.company;

import java.io.*;
import java.security.AllPermission;
import java.util.*;

public class Unidad {

    Map<String, Set<Alumnos>> lista_alumnos;

    public Unidad() {
        this.lista_alumnos = new HashMap<>();
    }

    public void mostrarTodosAlumnosOrdenados() {

        System.out.println(lista_alumnos);
    }

    public void obtenerUnidadAlumno(Integer idAlumno) {
        if (!lista_alumnos.containsKey(Alumnos.getId(idAlumno))) {
            System.out.println("No hay ningun alumno con esa id");
        }
        System.out.println(lista_alumnos.containsKey(Alumnos.getId(idAlumno)));
    }

    public void mostrarAlumnosUnidad(String unidad) {
        if (!lista_alumnos.containsKey(unidad)){
            System.out.println("Esta unidad no está registrada");
        }else {
            List<Alumnos> alumnos = new ArrayList<>(lista_alumnos.get(unidad));
            alumnos.sort(new Comparator<Alumnos>() {
                @Override
                public int compare(Alumnos o1, Alumnos o2) {
                    return o1.getDni().compareTo(o2.getDni());
                }
            });
            System.out.println(alumnos);
        }
    }

    public boolean addAlumnoUnidad(Alumnos alumno, String unidad) {
        if (unidad.equals(alumno.getUnidad())) {
            if (!lista_alumnos.containsKey(unidad)) {
                lista_alumnos.put(unidad,new TreeSet<>());
            }
            lista_alumnos.get(unidad).add(alumno);
            return true;
        }else {
            System.out.println("No coincide la unidad con el alumno");
            return false;
        }
    }

    public void cargarAlumnos() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true) {
                Alumnos alumn = (Alumnos) ois.readObject();
                addAlumnoUnidad(alumn,alumn.getUnidad());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void guardarAlumno() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            Collection<Set<Alumnos>> conjunto = lista_alumnos.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Alumnos> alm = (Set<Alumnos>) it.next();

                for (Alumnos a : alm) {
                    oos.writeObject(a);
                }
            }
            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
