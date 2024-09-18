import javax.swing.*;
import javax.sql.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class deleteemp extends JFrame implements ActionListener {
    JLabel l;
    JTextField f;
    JButton b;
    public deleteemp(){
        JFrame jf=new JFrame();
        jf.setLayout(new FlowLayout());
        l=new JLabel("ID");
        jf.add(l);
        f=new JTextField(10);
        jf.add(f);
        b=new JButton("delete");
        jf.add(b);
        b.addActionListener(this);
        jf.setSize(200,200);
        jf.setVisible(true);
     }
public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost/sycs46","root","");
                PreparedStatement s=c.prepareStatement("delete from employee where eid=?");
                s.setString(1,f.getText());
                s.executeUpdate();
                System.out.println("delete employee details");
                s.close();
                c.close();
            }
            catch(SQLException se){
                System.out.println("SQL Error");
            }
        catch(ClassNotFoundException e){
            System.out.println("Cannot find class");
        }
        }
        }
    public static void main(String args[])
    {new deleteemp();
}
}
