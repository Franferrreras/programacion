package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ejercicio 2

        Crear una función insertarValor que:

        Reciba como parámetros un vector de enteros, un valor y una posición
        Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada. De esta manera el vector resultado tendrá un elemento más.
        En caso de que la posición exceda los límites del vector deberá mostrar un error por pantalla y devolver el mismo vector recibido.

                Realizar una llamada a la función mostrando el vector resultado.

                Ejemplo:*/

        int[] tabla = {1,2,3,4,5,6,7,8};
        int pos,num;

        System.out.println("Qué numero quiere insertar?");
        num = sc.nextInt();

        System.out.println("En qué posición quiere insertarlo");
        pos = sc.nextInt();


        System.out.println(Arrays.toString(insertarValor(tabla, num, pos)));


    }

    public static int[] insertarValor(int[] v, int num, int pos) {

        int [] resultado = new int[v.length+1];

        if (pos > v.length || pos < 0) {
            System.out.println("Se ha producido un error");
            return v;
        }

        for (int i = 0; i < v.length ; i++) {

            if (i<pos) {
                resultado[i] = v[i];
            }else {
                resultado[i+1]=v[i];
            }
        }
        resultado[pos] = num;
        return resultado;
    }
}
