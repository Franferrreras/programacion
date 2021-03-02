package com.company;

import java.util.ArrayList;
import java.util.List;

public class EjBaraja {

    public static void main(String[] args) {


        String[] valores = {"AS","2","3","4","5","6","7","SOTA","CABALLO","REY"};
        String[] palos = {"Oro","Copas","Bastos","Espadas"};
        List cartas = new ArrayList<Carta>();

        while (cartas.size() < 11) {
            String v = valores[(int)(Math.random()*10)];
            String p = palos[(int)(Math.random()*4)];
            Carta c = new Carta(v,p);
            if (!cartas.contains(c)) {
                cartas.add(c);
            }
        }
        System.out.println(cartas);
    }
}
