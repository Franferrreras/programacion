package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Empresa emp1 = new Empresa("Inditex");
        Departamento depart = new Departamento("SevillaEnterprise","Sevilla","43546346436");
        Departamento depart2 = new Departamento("MadridEnterprise","Madrid","43654675474");
        Departamento depart3 = new Departamento("Cataluña","5363546377457");
        Empleado emple = new Empleado("Jose Garcias Tomares","4354364365","545236632436");
        Empleado emple2 = new Empleado("Mario Velazques Cruz","4265246246","325235255235");
        Empleado emple3 = new Empleado("Carlos Torres Cruz","6745747543","57457547547",Puesto.administrativo);
        Empleado emple4 = new Empleado("Fran Gutierrez Diaz","4364363634","346346436436",Puesto.directiva);
        Empleado emple5 = new Empleado("Pedro Castro Rubio","57648457547","65387345734",Puesto.directiva);
        Empleado emple6 = new Empleado("Luis Sanchez Iglesias","747457574","675574784568");


        System.out.println(emp1);
        System.out.println(depart);
        System.out.println(emple);

        emp1.anadirDepartamento(depart);
        emp1.anadirDepartamento(depart2);
        emp1.anadirDepartamento(depart3);



        depart.anadirEmpleado(emple);
        depart.anadirEmpleado(emple3);

        System.out.println("");
        System.out.println(emp1);
        System.out.println(depart);
        System.out.println(emple);

        depart2.anadirEmpleado(emple2);
        depart2.anadirEmpleado(emple4);

        System.out.println("");
        System.out.println(emp1);
        System.out.println(depart);
        System.out.println(emple);

        depart3.anadirEmpleado(emple5);
        depart3.anadirEmpleado(emple6);

        System.out.println("");
        System.out.println(emp1);
        System.out.println(depart);
        System.out.println(emple);

    }
}
