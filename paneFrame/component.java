/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class component extends JComponent{
        @Override
        protected void paintComponent(Graphics g){
                g.setColor(Color.MAGENTA);
                g.fillRect(10,20,200,200);
            }
    public static void main(String draj[]){
        JFrame frame =new JFrame();
        frame.setTitle("JRootPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        component comp = new component();
        frame.getContentPane().add(comp);
    }
}
