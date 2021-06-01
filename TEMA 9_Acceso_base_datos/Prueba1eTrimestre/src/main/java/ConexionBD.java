import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection connextion = null;

    public static Connection getConnection() {
        try {
            if (connextion == null) {
                connextion = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=joseluis03"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return (connextion);
    }

    public static void close() {
        try {
            if (connextion != null) connextion.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
