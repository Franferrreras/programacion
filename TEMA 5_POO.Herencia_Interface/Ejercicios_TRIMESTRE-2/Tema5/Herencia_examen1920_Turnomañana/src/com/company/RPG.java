package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class RPG  {


    private Personajes[] personajes;



    public Personajes[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personajes[] personajes) {
        this.personajes = personajes;
    }

    public boolean añadirPersonaje(Personajes per) {
        if (personajes!=null) {
            if (personajes.length < 10 ) {
                personajes = Arrays.copyOf(personajes,personajes.length+1);
                personajes[personajes.length-1] = per;
                return true;
            }else {
                System.out.println("No se pueden añadir más personajes");
                return false;
            }
        }else {
            personajes = new Personajes[1];
            personajes[0] = per;
            return true;
        }
    }

    public void borrarMuerto() {
        int numMuerto = 0;
        for (int i = 0; i <personajes.length ; i++) {
            if ( personajes[i].getEnergia() <=0 ) {
                numMuerto++;
            }
        }

        Personajes[] p1 = new Personajes[personajes.length-numMuerto];

        int contador = 0;
        for (int i = 0; i <personajes.length ; i++) {
            if (personajes[i].getEnergia() >0 ) {
                p1[contador] = personajes[i];
                contador++;
            }
        }

        personajes = p1;
    }

    public void mostrarEstado() {
        Arrays.sort(personajes);
        System.out.println(Arrays.deepToString(personajes));
    }

    public void mostratAtaque() {
        Arrays.sort(personajes, new Comparator<Personajes>() {
            @Override
            public int compare(Personajes o1, Personajes o2) {
                return o1.getCapAtaque() - o2.getCapAtaque();
            }
        });

        System.out.println(Arrays.deepToString(personajes));
    }


    public void mostrarxDefensa() {
        Arrays.sort(personajes, new Comparator<Personajes>() {
            @Override
            public int compare(Personajes o1, Personajes o2) {
                return o1.getCapacidadDefensa()-o2.getCapacidadDefensa();
            }
        });

        System.out.println(Arrays.deepToString(personajes));
    }

    public void hayGanador(Personajes[] personajes){
        int contvivo = 0;
        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia() > 0) {
                contvivo++;
            }
        }

        if (contvivo == 1) {
            System.out.println(Arrays.deepToString(personajes));
        }
    }
}
