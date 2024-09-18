/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class window implements ActionListener{
    JButton btn;
    JLabel la;
    JPanel p;
    JFrame f;

    public window(){
        f=new JFrame();
        f.setTitle("window Frame one");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,400,400);
        f.setLocationRelativeTo(null);
        
        p=new JPanel();
        btn=new JButton("show window");
        p.add(btn);

//        la=new JLabel("This is frame one which call other frame");
//        p.add(la);
        f.add(p);

        btn.addActionListener(this);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final JWindow w= new JWindow();
        w.setSize(200,200);
        w.setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        w.add(panel);
        w.setVisible(true);
        
        w.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){ w.dispose();}
            }
        });
    }
    public static void main(String draj[]){new window();}
}















