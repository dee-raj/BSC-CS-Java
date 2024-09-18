/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcmysql;
import java.sql.*;
/**
 *
 * @author hp
 */
public class batch1insertJdbc {
    /**
    *@param draj the command line arguments
    *@throws java.lang.ClassNotFoundException
    */
    public static void main(String draj[]) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/drajdb";
            Connection conn=DriverManager.getConnection(url,"root","dR@J473#J!");
            
            Statement stm=conn.createStatement();
            
            stm.addBatch("update person set rollno=31 where age=25");
//            stm.addBatch("insert into person(rollno,name,age) values(12,'Ramesh',25);");
//            stm.addBatch("insert into person(rollno,name,age) values(41,'Rakesh',23);");
//            stm.addBatch("insert into person(rollno,name,age) values(7,'Rahul',22);");
//            stm.addBatch("insert into person(rollno,name,age) values(21,'Rajan',19);");            
            
            int[] insertCount=stm.executeBatch();
            for (int i:insertCount){
                System.out.println(i+" record inserted.");
            }
        } catch(SQLException se){
        }
    }
    
}
