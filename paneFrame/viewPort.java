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
public class viewPort {
    String imgPath="C:\\Users\\hp\\Pictures\\Camera Roll\\Snapchat-713551482.jpg";
    JButton bt1,bt2,bt3,bt4;
    public viewPort(){
        JFrame frame =new JFrame();
        frame.setTitle("JViewport demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        
        ImageIcon img=new ImageIcon(imgPath);
        JLabel la=new JLabel(img);
        JScrollPane pane=new JScrollPane(la);
        frame.add(pane);
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        pane.setViewportBorder(BorderFactory.createLineBorder(Color.red));
        

        final JViewport view=new JViewport();
        bt1=new JButton("UP");
        bt2=new JButton("DOWN");
        bt3=new JButton("LEFT");
        bt4=new JButton("RIGHT");
        
        JPanel panel=new JPanel();
       
       
        
        bt1.addActionListener((ActionEvent e) -> {
            Point origin=view.getViewPosition();
            Point newOrigin= origin=new Point(origin.x,origin.y-100);
            view.setViewPosition(newOrigin);
            System.exit(0);
        });
        bt2.addActionListener((ActionEvent e) -> {
            Point origin=view.getViewPosition();
            Point newOrigin= origin=new Point(origin.x,origin.y+100);
            view.setViewPosition(newOrigin);
        });
        bt3.addActionListener((ActionEvent e) -> {
            Point origin=view.getViewPosition();
            Point newOrigin= origin=new Point(origin.x-100,origin.y);
            view.setViewPosition(newOrigin);
        });
        bt4.addActionListener((ActionEvent e) -> {
            Point origin=view.getViewPosition();
            Point newOrigin= origin=new Point(origin.x+100,origin.y-100);
            view.setViewPosition(newOrigin);
        });
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        frame.add(panel,BorderLayout.NORTH);
        
        frame.setVisible(true);
    }
    public static void main(String draj[]){new viewPort();}
}
