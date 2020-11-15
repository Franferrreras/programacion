package com.company;

import java.util.Scanner;

public class repaso7_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:

        verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
                falso. En caso contrario.
        escribe el código necesario para inicializar "jasp" en una línea.*/

        int edad,nivel_etud, ingresos;
        boolean jasp;

        jasp = false;

        System.out.println("Introduzca edad");
        edad = sc.nextInt();

        System.out.println("Introduzca nivel de estudio");
        nivel_etud = sc.nextInt();

        System.out.println("Introduzca ingresos");
        ingresos = sc.nextInt();

        jasp = (edad <=28 && nivel_etud >3 && ingresos >=2800) ? true : false;
        System.out.println(jasp);
    }
}
