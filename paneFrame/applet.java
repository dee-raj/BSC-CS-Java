/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class applet extends JApplet{
    JTextField t1;
    JButton btn;
    
    @Override
    public void init(){
        t1=new JTextField();
        btn=new JButton("click");
        t1.setBounds(20,20,100,30);
        btn.setBounds(20,20,100,30);
        add(t1);
        add(btn);
        
        btn.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
    t1.setText("Applet is working perfectlly.");
    }
}
