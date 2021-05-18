package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public static List<Employee> getEmployees() {
        Connection con = ConexionBD.getConnection();
        ArrayList<Employee> list_employee = new ArrayList<>();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");

            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list_employee.add(e);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list_employee;

    }

    public  static List<Office> getOffices() {
        Connection con = ConexionBD.getConnection();
        ArrayList<Office> list_offices = new ArrayList<>();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from office");

            while (rs.next()) {
                Office o = new Office(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list_offices.add(o);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list_offices;
    }

}
