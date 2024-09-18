/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcmysql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class JdbcMySQL {
    /**
     * @param draj the command line arguments
     */
    public static void main(String[] draj) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/drajdb";
            String user="root";
            String pass="dR@J473#J!";
            Connection conn=DriverManager.getConnection(url, user, pass);
            
            Statement stm=conn.createStatement();
            String sql="select * from students10";
            ResultSet rs=stm.executeQuery(sql);
            System.out.println("MiD\tName\tDOB\tGender\tCity");
            
            while(rs.next()){
                String id=rs.getString(1);
                String nam=rs.getString(2);
                String dob=rs.getString(3);
                String gen=rs.getString(4);
                String ct=rs.getString(5);
             System.out.println(id+"\t"+nam+"\t"+dob+"\t"+gen+"\t"+ct);
            }
            
            //MEDATADA
            System.out.println("\nMETADATA-----of_____TABLE");
            ResultSetMetaData remetadata=rs.getMetaData();
            String colName,colType;
            int colCount=remetadata.getColumnCount();
            for (int i=1; i<=colCount;i++){
                colName=remetadata.getColumnName(i);
                colType=remetadata.getColumnTypeName(i);
                System.out.print("\nColumn Name=\t"+colName+"\tColumn Type=\t"+colType+"\n");
            }
            
            stm.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("\nSQL Eorror..............!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}