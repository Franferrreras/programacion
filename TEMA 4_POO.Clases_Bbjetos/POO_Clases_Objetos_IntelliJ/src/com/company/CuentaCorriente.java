package com.company;

public class CuentaCorriente {


        /*Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:

        -Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de -50 euros.

                -Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano que indique lo mismo.

        -Ingresar dinero: se incrementa el saldo.

        -Mostrar información: muestra la información de la cuenta corriente.*/


    String nombre = "";
    int DNI = 0;
    int saldo = 0;
    int limite_descubierto = -50;

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", saldo=" + saldo +
                ", limite_descubierto=" + limite_descubierto +
                '}';
    }
}
