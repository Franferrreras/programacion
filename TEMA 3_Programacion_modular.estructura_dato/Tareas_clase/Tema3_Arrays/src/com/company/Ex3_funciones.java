package com.company;

public class Ex3_funciones {

    public static void main(String[] args) {


        //Actividad 3: Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
        // Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, hemos de pasarle a la función el radio de la base y la altura.

                //Área total:

        cilindro(1, 2, 4);
    }

    public static double cilindro (int tipo, double radio, double altura) {

        if (tipo==1) {

            System.out.println("El área del cilindro es "+2*Math.PI*radio*(altura+radio));
            return 2*Math.PI*radio*(altura+radio);

        }else if (tipo == 2) {

            System.out.println("El volumen del cilindro es "+Math.PI*radio*radio*altura);
            return Math.PI*radio*radio*altura;

        }else {
            return 0;
        }

    }
}
