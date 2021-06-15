import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        /*
        Gson gson = new Gson();
        System.out.println(gson.toJson(Consultas.MostrarOficinas()));

         */
        Connection connection = ConexionDB.getConnection();

        try {
            connection.setAutoCommit(false);
            EmployeModels.insertarCliente();
            connection.commit();
        } catch (SQLException e) {
            System.out.println("error"+e.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error en el roolback");
                throwables.printStackTrace();
            }
        }

        ConexionDB.close();
    }
}
