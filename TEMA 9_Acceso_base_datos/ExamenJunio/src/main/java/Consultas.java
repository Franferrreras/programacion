import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static void main(String[] args) throws SQLException {
        Connection connection = ConexionDB.getConnection();
        Gson gson = new Gson();
        //Mostrar lista de empleados en formato json
        System.out.println(gson.toJson(Consultas.MostrarEmployees("1")));

        connection.close();
    }
    public static List<Employee> MostrarEmployees(String officeCode) {
        Connection connection = ConexionDB.getConnection();
        List<Employee> listEmployee = new ArrayList<>();

        try {
            String  sql = "SELECT * FROM employees WHERE officeCode=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,officeCode);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Employee e = new Employee(  rs.getInt(1),
                                            rs.getString(2),
                                            rs.getString(3),
                                            rs.getString(4),
                                            rs.getString(5),
                                            rs.getString(6),
                                            rs.getInt(7),
                                            rs.getString(8)
                );
                listEmployee.add(e);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listEmployee;
    }
}
