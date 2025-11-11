import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLQueries {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:src//db//univ.db");

        Statement stm = con.createStatement();

        stm.executeUpdate("drop table if exists Temp");

        stm.executeUpdate("create table Temp(a integer, b float)");
    }
}
