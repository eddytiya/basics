package databseconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        
        try {
            // Load MariaDB Driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Create Connection
            Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/test11", "root", "");

            // Create Statement
            Statement statement = connection.createStatement();

            // Execute Query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            // Process Result
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("----------------------");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}