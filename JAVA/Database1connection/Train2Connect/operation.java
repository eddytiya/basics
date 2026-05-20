package Train2Connect;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class operation implements operations {

    Connection con = getConnection.getConnection();

    @Override
    public void insertdata() {
        try {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students VALUES (?, ?)");

            ps.setInt(1, 3);
            ps.setString(2, "Peter");

            ps.executeUpdate();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatedata() {
        try {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE students SET name=? WHERE id=?");

            ps.setString(1, "John");
            ps.setInt(2, 3);

            ps.executeUpdate();

            System.out.println("Data updated successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletedata() {
        try {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM students WHERE id=?");

            ps.setInt(1, 3);

            ps.executeUpdate();

            System.out.println("Data deleted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showdata() {
        try {
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM students");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
