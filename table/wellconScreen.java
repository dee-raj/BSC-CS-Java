/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class wellconScreen {
    JButton btn;
    JLabel la;
    JPanel p;
    JFrame f;
    public wellconScreen(){
        displayWellcom();
        f=new JFrame();
        f.setTitle("wellcom window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        
        p=new JPanel();
        btn=new JButton("show window");
        p.add(btn);

        f.add(p);

//        btn.addActionListener(this);
//        f.setVisible(true);
    }
    public static void main(String draj[]){new wellconScreen();}

    private void displayWellcom() {
        JWindow win=new JWindow();
        win.setSize(500,500);
        win.setLocationRelativeTo(null);
        String imgPath="C:\\Users\\hp\\Desktop\\netBeans\\sd02.jpg";
        p=new JPanel();
        win.add(p);
        p.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        
        la=new JLabel(new ImageIcon(imgPath));
        la.setHorizontalAlignment(SwingConstants.CENTER);
        p.add(la);
        p.setBackground(Color.white);
        
        JProgressBar pbr=new JProgressBar(0,100);
        pbr.setForeground(Color.orange);
        win.add(BorderLayout.PAGE_END,pbr);
        
        t=new Timer(100, (ActionEvent e) -> {
            int x=pbr.getValue();
            if(x==100){
                win.dispose();
                f.setVisible(true);
                t.stop();
            } else{
                pbr.setValue(x+2);
            }
        });
        t.start();
        win.setVisible(true);
    }
    Timer t;
}


