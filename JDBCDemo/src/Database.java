import java.sql.*;
public class Database {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:src//db//univ.db");

        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("select * from dept");

        int dno;
        String dname;

        while (rs.next()) {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");

            System.out.println(dno + " " + dname);
        }
        rs.close();

        ResultSet rs2 = stm.executeQuery("select * from students");
        System.out.println();

        while (rs2.next()) {
            System.out.print(rs2.getInt("roll") + " ");
            System.out.print(rs2.getString("name") + " ");
            System.out.print(rs2.getString("city") + " ");
            System.out.println(rs2.getInt("deptno") + " ");
        }
        rs2.close();
        stm.close();
        con.close();
    }
}
