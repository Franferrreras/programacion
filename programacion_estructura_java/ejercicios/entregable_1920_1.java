package com.company;

import java.util.Scanner;

public class entregable_1920_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EJERCICIO 1 (Clase Ej1.java)

        //Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres notas que
        // ha sacado el alumno en los tres primeros controles.
        //Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado
        // y se mostrará la media y la nota correspondiente .Atendiendo a esa media el alumno tendrá las siguientes notas:

        //Suficiente si la media en mayor o igual que 5 y menor que 6.
        //Bien si la media es mayor o igual que 6 y menor que 7.
        //Notable si la media es mayor o igual que 7 y menor que 9.
        //Sobresaliente en culaquier otro caso.
        //En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación
        // que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
        //ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota
        // será un 5; en caso contrario, se mantienela nota media anterior.


        int n1,n2;
        String n3;
        float media;

        System.out.println("introduzca nota de examanes");
        n1 = sc.nextInt();

        System.out.println("Introduzca nota de examanes");
        n2 = sc.nextInt();

        media = (n1+n2)/2;

        System.out.println("Nota del primer control es: "+n1);
        System.out.println("Nota del segundo control es: "+n2);



            if (media >=5 && media <6) {
                System.out.println("Tu nota de programación es un: "+media+" - Suficiente");
            }else if (media >=6 && media <7) {
                System.out.println("Tu no ta de programación es un: "+media+" - Bien");
            }else if (media >=7 && media < 9) {
                System.out.println("Tu nota de programacion es un: "+media+" - Notable");
            }else if (media >=9 && media<=10){
                System.out.println("Tu nota de programacion es un :"+media+" - Sobresaliente");
            }else  {
                System.out.println("¿Cual ha sido la nota de recuperación");
                sc.nextLine();
                n3 = sc.nextLine();

                if (n3.equals("apto")) {
                    System.out.print("Su nota media es de 5");
                }else {
                    System.out.print("su nota media es de "+media+" - Suspenso");
                }

            }


    }
}