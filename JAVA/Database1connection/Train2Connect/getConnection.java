package Train2Connect;


import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/test11", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
