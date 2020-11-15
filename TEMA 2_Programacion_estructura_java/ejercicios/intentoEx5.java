package com.company;

import java.util.Scanner;

public class intentoEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Actividad 9-5: Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre
        // comienzan sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga
        // (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
        // Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las
        // terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
        // Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita
        // en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
        // nos muestre el mensaje sin muletillas.

        String frase,comienzo,terminacion;
        comienzo ="Javalín,javalón";
        terminacion ="javalen,len,len";

        System.out.println("Introduzca frase");
        frase = sc.nextLine();

        if (frase.length()>comienzo.length()) {

            if (frase.substring(0,comienzo.length()).equals(comienzo)) {

                String resultado = frase.substring(comienzo.length(),frase.length()).trim();
                System.out.println("La frase traducida es: "+resultado);
            }else if (frase.substring(frase.length()-terminacion.length(),frase.length()).equals(terminacion)) {

                String result = frase.substring(0,frase.length()-terminacion.length());
                System.out.println("La frase traducida es: "+result);
            }else {
                System.out.println("El idioma es incorrecto");
            }
        }else {
            System.out.println("El idioma es incorrecto");
        }

    }
}
