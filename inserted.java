import java.sql.*;
import javax.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class inserted extends JFrame implements ActionListener {
JButton b1;
JTextField t1,t2,t3;
JLabel l1,l2,l3;
public inserted(){
JFrame jf=new JFrame();
jf.setLayout(new FlowLayout());
l1=new JLabel("Eid");
jf.add(l1);
t1=new JTextField(10);
jf.add(t1);
l2=new JLabel("Name");
jf.add(l2);
t2=new JTextField(10);
jf.add(t2);
l3=new JLabel("Department");
jf.add(l3);
t3=new JTextField(10);
jf.add(t3);
b1=new JButton("updater");
jf.add(b1);
b1.addActionListener(this);
jf.setSize(200,200);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://localhost/sycs46","root","");
String sql="insert into employee values(?,?,?)";
PreparedStatement pstmt=con.prepareStatement(sql);
int r1=Integer.parseInt(t1.getText());
pstmt.setString(1,t1.getText());
pstmt.setString(2,t2.getText());
pstmt.setString(3,t3.getText());
JOptionPane.showMessageDialog(null,"Record"+r1+"inserted successfully");
pstmt.executeUpdate();
pstmt.close();
con.close();
}
catch(SQLException e)
{
System.out.println("sqlerror");
} catch (ClassNotFoundException ex) {
Logger.getLogger(inserted.class.getName()).log(Level.SEVERE, null,
ex);
}
}}
public static void main(String args[]){
new inserted();
}
}