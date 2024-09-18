/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class glass extends JFrame{
    public glass(){
        setTitle("JRootPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        
        JPanel p1=new JPanel();
        JLabel la=new JLabel("GlassPane");
        
        JButton btn1=new JButton("click here");
        JButton btn2=new JButton("show");
        
    
        p1.add(la);
        p1.add(btn1);
        p1.add(btn2);
        
        getContentPane().add(p1);
        setVisible(true);
        btn1.addActionListener((ActionEvent e)->{
            la.setVisible(!la.isVisible());
        });
        
        setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g){
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0,0,getWidth(),getHeight());
            }
        });
        
        Container glassPane=(Container) this.getGlassPane();
//        glassPane.setVisible(true);
        glassPane.setLayout(new GridBagLayout());
        JButton btn3=new JButton(" HIDE ");
        glassPane.add(btn3);
        
        glassPane.addMouseListener(new MouseAdapter() {});//it will listens all mouse Event but can not responds back
        
        btn2.addActionListener((ActionEvent e)->{
            glassPane.setVisible(true);
        });
        btn3.addActionListener((ActionEvent e)->{
            glassPane.setVisible(false);
        });
        
    }
    public static void main(String draj[]){new glass();}
}
