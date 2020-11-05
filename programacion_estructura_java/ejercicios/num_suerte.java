package com.company;

import java.util.Scanner;

public class num_suerte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar suerte a un usuario. Solicitaremos a un usuario
        cuáles son sus 3 números favoritos y para calcular  si un número le va a dar suerte dicho número tendrá más ocurrencias de esos números que de los demás.

                Ejemplo 1:

        Introduzca sus números favoritos 1:

        3

        5

        7

        Introduzca el número de la lotería: 74123

        Ese número no le va a dar suerte

        Ejemplo 2:

        Introduzca sus números favoritos 1:

        3

        5

        7

        Introduzca el número de la lotería: 55173

        Ese número le va a dar suerte.*/

        String n1,n2,n3,num_loteria;

            System.out.println("introduzca sus tres numero");
            n1 = sc.nextLine();
            n2 = sc.nextLine();
            n3 = sc.nextLine();

            System.out.println("Introduzca número de la loteria");
            num_loteria = sc.nextLine();

            if (num_loteria.contains(n1) && num_loteria.contains(n2) && num_loteria.contains(n3)) {
                System.out.println("El número le va a dar suerte");
            }else {
                System.out.println("El número no le va a dar suerte");
            }


    }
}
