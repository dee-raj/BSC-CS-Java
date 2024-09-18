/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lookANDfeel;

import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class graphics extends JFrame{
    public graphics(){
        setTitle("Graphics in Java swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
        
        MyPanel panel=new MyPanel();
        panel.setBackground(Color.black);
        add(panel);
        
        validate();
    }
    public static void main(String draj[]){ new graphics().setVisible(true);}
}

