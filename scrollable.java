import java.sql.*;
public class scrollable {
    public static void  main (String args[]) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/sycs46", "root","");
            Statement s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=s.executeQuery("select * from employee");
            rs.absolute(2);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
            rs.previous();
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
            rs.relative(2);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
            rs.relative(-2);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
            rs.next();
            s.close();
            c.close();
        }
        catch(SQLException e){
            System.out.println("error");
        }
    }
}
