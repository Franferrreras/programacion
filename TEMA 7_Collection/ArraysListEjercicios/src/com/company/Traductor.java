package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Traductor {



    private Map<String,String> diccionario = new HashMap<>();

    public Traductor(String fichero) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea = br.readLine();
            while (linea != null) {
                String[] valores = linea.split(",");
                diccionario.put(valores[0],valores[1]);
                linea = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(Map<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public String traducir(String frase) {
        String resultado="";
        String[] palabras = frase.split(" ");

        for (String p: palabras) {
            resultado+= (diccionario.get(p)==null) ? p : diccionario.get(p)+" ";
        }
        return resultado;
    }
}
