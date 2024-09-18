import java.sql.*;
public class batch1 {
    public static void main(String args[]) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/sycs46","root","");
            Statement s=c.createStatement();
            s.addBatch("insert into employee(eid,name,dept) values(1,'ram',123)");
            s.addBatch("insert into employee(eid,name,dept) values(2,'kalyan',124)");
            s.addBatch("insert into employee(eid,name,dept) values(3,'arif',125)");
            s.addBatch("insert into employee(eid,name,dept) values(4,'gokhul',126)");
            s.addBatch("insert into employee(eid,name,dept) values(5,'vivek',127)");
            s.addBatch("insert into employee(eid,name,dept) values(6,'sobit',128)");
            s.addBatch("insert into employee(eid,name,dept) values(7,'sumit',129)");
            s.addBatch("insert into employee(eid,name,dept) values(8,'dhurbhu',130)");
            s.addBatch("insert into employee(eid,name,dept) values(9,'aditya',131)");
            s.addBatch("insert into employee(eid,name,dept) values(10,'tanmay',132)");
            int[] updateCounts=s.executeBatch();
            for(int count:updateCounts){
                System.out.println(count);
            }
            //c.commit();
            c.rollback();
            c.close();
           }
        catch(SQLException e){
            e.printStackTrace();
        }
    }    
}
