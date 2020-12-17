package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int n1, ingreso, retirar;


        CuentaCorriente Cc = new CuentaCorriente();




        do {
            Cc.saldo = 50;

            System.out.println("Que quiere hacer? (1 para ingresar, 2 para retirar dinero");
            n1 = sc.nextInt();

            if (n1 ==1 ) {
                System.out.println("Cuanto dinero quiere ingresar?");
                ingreso = sc.nextInt();

                Cc.saldo += ingreso;
            }

            if (n1 == 2) {
                System.out.println("Cuanto dinero quiere retirar?");
                retirar = sc.nextInt();

                Cc.saldo -= retirar;
            }

            if (Cc.saldo < Cc.limite_descubierto){
                System.out.println("No puede tener un descubierto menor de "+Cc.limite_descubierto+"$");
            }

        }while (n1 <1 || n1 > 2 || Cc.saldo < Cc.limite_descubierto);


        System.out.println("Usted dispone ahora de "+Cc.saldo+"$ en su cuenta corriente");








    }
}
