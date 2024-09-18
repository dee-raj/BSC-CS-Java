import java.sql.*;

public class view_employee {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/sycs46", "root", "");
            Statement s = c.createStatement();
            String sql = "select * from employee";
            ResultSet rs = s.executeQuery(sql);
            // System.out.println("Eid \t\t Name \t\t Dept");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t\t");
                System.out.println(rs.getString(2) + "\t\t");
                System.out.println(rs.getString(3) + "\t\t");
                System.out.println();
            }
            s.close();
            c.close();
        } catch (Exception e) {
            System.out.println("\n SQL Error");
            e.printStackTrace();
        }
    }
}
