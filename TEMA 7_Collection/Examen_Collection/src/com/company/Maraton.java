package com.company;

import java.io.*;
import java.util.*;

public class Maraton {

    private int num = 0;
    private final String lugar = "Castilleja de la cuesta";
    Map<Integer, Atleta> lista_atleta;

    public Maraton() {
        lista_atleta = new HashMap<>();
        num = 0;
    }


   /* public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Maraton.num = num;
    }*/

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLugar() {
        return lugar;
    }

    public Map<Integer, Atleta> getLista_atleta() {
        return lista_atleta;
    }

    public void setLista_atleta(Map<Integer, Atleta> lista_atleta) {
        this.lista_atleta = lista_atleta;
    }



    public void guardarTiempo(int dorsal, String tiempo) {

        if (!lista_atleta.containsKey(dorsal)) {
            System.out.println("No hay ningún atleta con ese número");
        }else {
            if (lista_atleta.get(dorsal).isFinisher()) {
                lista_atleta.get(dorsal).setMarca(tiempo);
            }else {
                System.out.println("El atleta no ha terminado la máraton todavía");
            }
        }
    }

    public void inscribirAtleta(Atleta atleta) {
        num+=1;
        if (!lista_atleta.containsValue(atleta)) {
            lista_atleta.put(num,atleta);
        }else {
            System.out.println("El atleta ya está inscrito");
        }
    }

    public boolean borarAtleta(int num) {

        if (!lista_atleta.containsKey(num)) {
            System.out.println("El número de dorsal no corresponde a ningun atleta");
            return false;
        }else {
            lista_atleta.remove(num);
            return true;
        }
    }

    public void mostrarListaFinisher() {

       Collection<Atleta> conjunto = lista_atleta.values();

       Iterator it = conjunto.iterator();

       while (it.hasNext()){
           Atleta at = (Atleta) it.next();

           if (at.isFinisher()) {
               System.out.println(at);
           }
       }
    }

    public void mostrarLIstaCategoria(Categoria cate) {
        Collection<Atleta> conjunto = lista_atleta.values();
        int contador = 0;
        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Atleta atle = (Atleta) it.next();

            if (atle.getCategoria().equals(cate)) {
                System.out.println(atle);
                contador++;
            }
             if (contador == 0) {
                 System.out.println("No hay atletas de esa categoria");
             }
        }
    }

    public void participantePorPais(String pais) {
        Collection<Atleta> conjunto = lista_atleta.values();
        int cont = 0;
        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Atleta atl = (Atleta) it.next();

            if (atl.getPais().equals(pais)) {
                cont++;
            }
        }
        System.out.println(cont);
        if (cont == 0) {
            System.out.println("No hay atletas inscritos de "+pais);
        }
    }

    public void guardarAtletas() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("atletas.dat"));

            Collection<Atleta> conjunto = lista_atleta.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()){
                Atleta atl = (Atleta) it.next();

                oos.writeObject(atl);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void cargarAtletas() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("atletas.dat"));

            while (true) {

                Atleta at = (Atleta) ois.readObject();

                inscribirAtleta(at);
                System.out.println(at);
            }
        } catch (Exception e) {
            System.out.println("Atletas cargados");
        }

    }

}