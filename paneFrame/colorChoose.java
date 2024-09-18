/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class colorChoose extends JFrame{
    
    public colorChoose(){
        setTitle("JRootPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
       
        Container con=this.getContentPane();
        con.setLayout(new GridBagLayout());
        JButton btn=new JButton("Change color");
        con.add(btn);
        btn.addActionListener((ActionEvent e)->{
            Color col=JColorChooser.showDialog(null, "select a color", Color.black);
            con.setBackground(col);
        });
        
        setVisible(true);
    }
    public static void main(String draj[]){ new colorChoose();}
}
