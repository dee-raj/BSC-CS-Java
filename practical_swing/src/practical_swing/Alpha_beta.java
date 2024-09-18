/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author hp
 */
public class Alpha_beta {
    public static void main(String[] draj) {
        new Alpha_beta();
    }
    JLabel l1;
    JButton b1,b2;
    public Alpha_beta(){
        JFrame jf=new JFrame("Frame with label and button");
        
        l1=new JLabel("Press a button");
        
        jf.setBounds(700,300,500,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        
        b1=new JButton("Alpha");
        b2=new JButton("Beta");
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                l1.setText("Alpha is pressed");
        }});
        b2.addActionListener((ActionEvent ae) -> {
            l1.setText("Beta is pressed");
        });
        
        jf.add(b1);
        jf.add(b2);
        jf.add(l1);
        jf.setVisible(true);
    }
}