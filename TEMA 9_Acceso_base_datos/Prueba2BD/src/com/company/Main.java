package com.company;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection con = ConexionBD.getConnection();
        try {
            OfficeModel.insertOffice(
                new Office("41803","Madrid","6436364","Marcenolo","41800","Spain")

            );

            System.out.println("Insertado oficina");

            EmployeeModel.insertEmployee(
                    new Employee(5,"Garcia","America","@gsdgasd","41803","Corredor")
            );
            System.out.println("Insertado oficina");

        } catch (SQLException e) {
            System.out.println("error: " +e.getMessage());
            try {
                if (con!=null) {
                    System.out.println("Dejemos la BBDD en estado consistente.");
                    con.rollback();
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }



        /*
        System.out.println("LISTA DE EMPLEADOS");
        System.out.println(ADClassicModels.getEmployees());
        System.out.println("-----------------------------");


        System.out.println("-----------------------------");
        System.out.println("LISTA DE OFFICINAS");
        System.out.println(ADClassicModels.getOffices());
        System.out.println("-----------------------------");


        //cerrar conexión
        ConexionBD.close();

         */
    }
}
