import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DMLQueries {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:src//db//univ.db");

        Statement stm = con.createStatement();

        stm.executeUpdate("delete from dept where deptno >= 60");

        stm.executeUpdate("insert into dept values(60, 'Chem')");

        stm.executeUpdate("update dept set dname='Chem' where deptno=50");

        PreparedStatement pstm = con.prepareStatement("insert into students values(?, ?, ?, ?)");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Data: ");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int sno = sc.nextInt();

        pstm.setInt(1, r);
        pstm.setString(2, name);
        pstm.setString(3, city);
        pstm.setInt(4, sno);

        pstm.executeUpdate();


        stm.close();
        con.close();
    }
}
