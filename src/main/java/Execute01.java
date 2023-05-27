import java.sql.*;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","Wdjsnakeomer1");

        Statement st = con.createStatement();

        System.out.println("Connection Success");
    }
}
