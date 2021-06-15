import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeModels {

    public static void insertarCliente() throws SQLException {
        Connection connection = ConexionDB.getConnection();
        Scanner sc = new Scanner(System.in);

        String sql = "INSERT INTO employees values(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        System.out.println("Inserte los datos del empleado| apellidos, nombre, extension, email, officeCode,jobTitle, codigoEmple,reportsTo");
        String apell = sc.nextLine();
        String name = sc.nextLine();
        String extension = sc.nextLine();
        String email = sc.nextLine();
        String officeCode= sc.nextLine();
        String jobTitle= sc.nextLine();
        int numeroEmple= sc.nextInt();
        int reportsTo= sc.nextInt();

        statement.setInt(1,numeroEmple);
        statement.setString(2,apell);
        statement.setString(3,name);
        statement.setString(4,extension);
        statement.setString(5,email);
        statement.setString(6,officeCode);
        statement.setInt(7,reportsTo);
        statement.setString(8,jobTitle);

        statement.executeUpdate();
    }
}
