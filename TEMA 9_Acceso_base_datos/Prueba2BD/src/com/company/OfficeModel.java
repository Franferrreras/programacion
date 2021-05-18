package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OfficeModel {

    public static Integer insertOffice(Office office) throws SQLException {
        Integer rowsAffected=0;
        Connection con = ConexionBD.getConnection();

        String sql = "INSERT INTO office values(?, ?, ?, ?, ?, ?)";
        PreparedStatement setencia = con.prepareStatement(sql);

        setencia.setString(1,office.getOfficeCode());
        setencia.setString(2,office.getCity());
        setencia.setString(3,office.getPhone());
        setencia.setString(4,office.getAddress());
        setencia.setString(5,office.getPostalCode());
        setencia.setString(6,office.getCountry());

        rowsAffected=setencia.executeUpdate();

        return rowsAffected;
    }


}
