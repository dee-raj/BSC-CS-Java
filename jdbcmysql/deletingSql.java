/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcmysql;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
//import java.util.*;
/**
 *
 * @author hp
 */
public class deletingSql extends JFrame implements ActionListener {
    public static void main(String draj[]){
    new deletingSql();
    }
    JFrame jf;
    JLabel jl,message;
    JTextField jtf;
    JButton jb;
    public deletingSql(){
    jf=new JFrame("frame for record Deleting");
    jf.setBounds(600,200,400,200);
    jf.setVisible(true);
    jf.setLayout(new FlowLayout());
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    jl=new JLabel("Delete record for ID:");
    jf.add(jl);
    jtf=new JTextField(4);
    jf.add(jtf);
    jb=new JButton("delete");
    jf.add(jb);
    jb.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent as){
        if (as.getSource()==jb){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/drajdb";
             Connection con=DriverManager.getConnection(url,"root","dR@J473#J!");
             
             String sql="DELETE FROM actors WHERE id=?";
             PreparedStatement pstm=con.prepareStatement(sql);
             
             pstm.setString(1, jtf.getText());
             pstm.executeUpdate();
             
             System.out.println("record is deleted for id="+jtf.getText());
             pstm.close();
             con.close();
         }catch(SQLException se){
            System.out.println(se.getMessage());
         } catch(ClassNotFoundException cf){}         
        }       
    }
}