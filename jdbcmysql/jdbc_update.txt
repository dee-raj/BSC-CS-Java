/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcmysql;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.logging.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.sql.*;

/**
 *
 * @author hp
 */
public class updatingSql extends JFrame implements ActionListener {
    JButton bt;
    JTextField t1,t2,t3,t4;
    JFrame jf;
    JLabel l1,l2,l3,l4;
    
    public updatingSql(){
        jf=new JFrame("Frame for updating table");
        jf.setVisible(true);
        jf.setBounds(600,100,700,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1=new JLabel("ID: ");
        jf.add(l1);
        t1=new JTextField(10);
        jf.add(t1);
        
        l2=new JLabel("Fname: ");
        jf.add(l2);
        t2=new JTextField(10);
        jf.add(t2);
        
        l3=new JLabel("Lname: ");
        jf.add(l3);
        t3=new JTextField(10);
        jf.add(t3);
        
        l4=new JLabel("dept: ");
        jf.add(l4);
        t4=new JTextField(10);
        jf.add(t4);
        
        bt=new JButton("update");
        bt.addActionListener(this);
        jf.add(bt);
    }   
    public static void main(String draj[]){
        new updatingSql();
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bt){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/drajdb";
            Connection conn=DriverManager.getConnection(url,"root","dR@J473#J!");
            
//            Statement stm=conn.createStatement();
            String sql="UPDATE data set id=?, fname=?, lname=?, dept=? where id=3";
            PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.setString(1, t1.getText());
            pstm.setString(2, t2.getText());
            pstm.setString(3, t3.getText());
            pstm.setString(4, t4.getText());
            pstm.executeUpdate();     
            
            System.out.println("updating is done for id="+t1.getText());
        } catch(SQLException se){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(updatingSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}