package com.company;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int puntos;
        String respustas;
        String sexo,v;
        v = "verdadero";

        puntos=0;

        /*Tu pareja parece estar más inquieta de lo normal sin ningún motivo
        aparente.
        2. Ha aumentado sus gastos de vestuario
        3. Ha perdido el interés que mostraba anteriormente por ti
        4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
        arregla el pelo y se asea con más frecuencia (si es mujer)
        5. No te deja que mires la agenda de su teléfono móvil
        6. A veces tiene llamadas que dice no querer contestar cuando estás tú
        delante
        7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
        8. Muchos días viene tarde después de trabajar porque dice tener mucho
        más trabajo
        9. Has notado que últimamente se perfuma más

         */

        System.out.println("Tu pareja es hombre o mujer");
        sexo = sc.nextLine();

        if (sexo.equals("hombre")) {
            System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?");
            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ha aumentado sus gastos de vestuario?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ha perdido el interés que mostraba anteriormente por ti?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ahora se afeita y se asea con más frecuencia (si es hombre)?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }

            System.out.println("¿No te deja que mires la agenda de su teléfono móvil?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Has notado que últimamente se perfuma más?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }

        /*if (puntos >=0 && puntos <=10) {
            System.out.println("En hora buena tu pareja es total mente fiel");
        }*/

            if (puntos >10 && puntos <= 22) {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            }else if (puntos >22 && puntos <= 30) {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
            }else {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("En hora buena tu pareja es total mente fiel");
            }
        }else if (sexo.equals("mujer")){

            System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?");
            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ha aumentado sus gastos de vestuario?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ha perdido el interés que mostraba anteriormente por ti?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }

            System.out.println("¿No te deja que mires la agenda de su teléfono móvil?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Has notado que últimamente se perfuma más?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }
            System.out.println("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");

            respustas = sc.nextLine();
            if (respustas.equals("verdadero")) {
                puntos=puntos+3;
            }

        /*if (puntos >=0 && puntos <=10) {
            System.out.println("En hora buena tu pareja es total mente fiel");
        }*/

            if (puntos >10 && puntos <= 22) {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            }else if (puntos >22 && puntos <= 30) {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
            }else {
                System.out.println("Tu puntuación es de "+puntos);
                System.out.println("En hora buena tu pareja es total mente fiel");
            }
        }

    }
}
