import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class resultset {
    public static void main(String draj[]){
        ResultSetMetaData rmd;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/drajdb";
            Connection con=DriverManager.getConnection(url,"root","dR@J473#J!");
            Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
            String sql="SELECT * FROM man;";
            ResultSet rs=stm.executeQuery(sql);
            
            rmd=rs.getMetaData();           
System.out.println(rmd.getColumnLabel(1)+"\t"+rmd.getColumnLabel(2)+"\t"+rmd.getColumnLabel(3)+"\t"+rmd.getColumnLabel(4)+"\t"+rmd.getColumnLabel(5));
            
            rs.relative(1);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getString(5));
            
            rs.absolute(2);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getString(5));
            
            rs.next();
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
            
            rs.previous();
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getString(5));
            
            rs.first();
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getString(5));    
            
            
        } catch(SQLException se){
            System.out.println(se.getMessage());
        } catch(ClassNotFoundException ce){
            Logger.getLogger(resultset.class.getName()).log(Level.SEVERE, null, ce);
        }
    }    
}
