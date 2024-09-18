/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class layeredPane extends JFrame{
    public layeredPane(){
        setTitle("JRootPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        
        JLayeredPane pane=this.getLayeredPane();
        
        JButton btn1=new JButton("RED");
        btn1.setBackground(Color.red);
        btn1.setBounds(40,10,330,150);
        
        JButton btn2=new JButton("GREEN");
        btn2.setBackground(Color.green);
        btn2.setBounds(20,50,150,150);
        
        JButton btn3=new JButton("BULE");
        btn3.setBackground(Color.blue);
        btn3.setBounds(80,120,250,150);
        
        pane.add(btn1,new Integer(10));
        pane.add(btn2,new Integer(100));
        pane.add(btn3,new Integer(70));
        
        setVisible(true);
    }
    public static void main(String draj[]){new layeredPane();}
}
