import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static List<Office> MostrarOficinas() {
        Connection connection = ConexionDB.getConnection();
        List<Office> listOffice = new ArrayList<>();


        try {
            String sql = "SELECT * FROM offices";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Office o = new Office(  rs.getString("officeCode"),
                                        rs.getString("city"),
                                        rs.getString("phone"),
                                        rs.getString("addressline1"),
                                        rs.getString("addressline2"),
                                        rs.getString("state"),
                                        rs.getString("country"),
                                        rs.getString("postalCode"),
                                        rs.getString("territory")
                );
                listOffice.add(o);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listOffice;
    }
}
