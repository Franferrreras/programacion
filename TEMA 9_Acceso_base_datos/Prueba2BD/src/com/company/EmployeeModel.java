package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeModel {

    public static void insertEmployee(Employee employee) throws SQLException {
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO employee values (?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1,employee.getEmployeeid());
        sentencia.setString(2,employee.getLastName());
        sentencia.setString(3,employee.getFirstName());
        sentencia.setString(4,employee.getEmail());
        sentencia.setString(5,employee.getOfficeCode());
        sentencia.setString(6,employee.getSpecialitation());

        sentencia.executeUpdate();
    }


}
