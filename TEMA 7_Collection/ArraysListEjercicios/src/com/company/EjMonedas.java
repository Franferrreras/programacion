package com.company;

import java.util.ArrayList;
import java.util.List;

public class EjMonedas {

    public static void main(String[] args) {
        List listaMonedas = new ArrayList<Moneda>();
        String[] valores = {"1c","2c","5c","10c","20c","50c","1€","2€"};
        String[] posicion = {"Cara","Cruz"};
        String v = valores[(int)(Math.random()*8)];
        String p = posicion[Math.random()>0.5 ? 1 : 0];
        Moneda previa = new Moneda(v,p);

        while(listaMonedas.size()<7){
            String v1 = valores[(int)(Math.random()*8)];
            String p1 = posicion[ Math.random()>0.5 ? 1 : 0];
            if ((v1 == previa.getMoneda() && p1 != previa.getPosicion()) || (v1 != previa.getMoneda() && p1 == previa.getPosicion())){
                Moneda m = new Moneda(v1,p1);
                listaMonedas.add(m);
                previa = m;
            }
        }

        System.out.println(previa.getMoneda());
        System.out.println(listaMonedas);
    }
}
