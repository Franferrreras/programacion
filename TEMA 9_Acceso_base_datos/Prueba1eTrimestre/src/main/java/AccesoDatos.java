import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos {


    public static List<Employees> getEmpleados() {
        Connection conextion = ConexionBD.getConnection();
        List<Employees> list_empleados = new ArrayList<>();

        try {
            Statement st = conextion.createStatement();
            ResultSet rs = st.executeQuery("select * from employees");

            while (rs.next()) {
                Employees e = new Employees(rs.getInt(1),
                                            rs.getString(2),
                                            rs.getString(3),
                                            rs.getString(4),
                                            rs.getString(5),
                                            rs.getString(6),
                                            rs.getInt(7),
                                            rs.getString(8));
                list_empleados.add(e);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list_empleados;
    }

    public static List<Offices> getOffices() {
        Connection conextion = ConexionBD.getConnection();
        List<Offices> list_oficinas = new ArrayList<>();

        Statement st = null;
        try {
            st = conextion.createStatement();
            ResultSet rs = st.executeQuery("select * from offices");

            while (rs.next()) {
                Offices o = new Offices(rs.getInt(1),
                                            rs.getString(2),
                                            rs.getString(3),
                                            rs.getString(4),
                                            rs.getString(5),
                                            rs.getString(6),
                                            rs.getString(7),
                                            rs.getString(8),
                                            rs.getString(9));
                list_oficinas.add(o);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list_oficinas;
    }
}
