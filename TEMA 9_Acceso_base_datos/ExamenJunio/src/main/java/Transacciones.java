import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        Connection connection = ConexionDB.getConnection();
        //Inserción de categira y dos nuesvos productos
        try {
            connection.setAutoCommit(false);
            Transacciones.insertCategoria();
            connection.commit();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void insertCategoria() throws SQLException {
        Connection connection = ConexionDB.getConnection();

        String sql = "INSERT INTO productlines values(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,"Electric Card");
        statement.setString(2,"That card use electric energy, produce 0 Co2 to earth");
        statement.setString(3,"");
        statement.setString(4,"");

        statement.executeUpdate();

        String sql2 = "INSERT INTO products values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement1 = connection.prepareStatement(sql2);

        statement1.setString(1,"S10_1999");
        statement1.setString(2,"Tesla Model X");
        statement1.setString(3,"Electric Card");
        statement1.setString(4,"2:4");
        statement1.setString(5,"Tesla");
        statement1.setString(6,"That card is 100% eco");
        statement1.setInt(7,20);
        statement1.setDouble(8,63779.99);
        statement1.setDouble(9,95.7);

        statement1.executeUpdate();

        String sql3 = "INSERT INTO products values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement2 = connection.prepareStatement(sql3);
        statement2.setString(1,"S10_2000");
        statement2.setString(2,"Tesla Model S");
        statement2.setString(3,"Electric Card");
        statement2.setString(4,"2:4");
        statement2.setString(5,"Tesla");
        statement2.setString(6,"That card is 100% eco");
        statement2.setInt(7,10);
        statement2.setDouble(8,90900.99);
        statement2.setDouble(9,95.7);

        statement2.executeUpdate();
    }
 }
