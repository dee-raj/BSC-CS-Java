/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class callOtherJFrame {
    public static void main(String draj[]){new another();}
}
class another implements ActionListener{
    JButton btn,btn2;
    JLabel la;
    JTextField ta;
    JPanel p,p2;
    JFrame f,frame;

    public another(){
        f=new JFrame();
        f.setTitle("JFrame one");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,400,400);
        f.setLocationRelativeTo(null);
        
        p=new JPanel();
        btn=new JButton("fill details");
        la=new JLabel("This is frame one which call other frame");
        p.add(btn);
        p.add(la);
        f.add(p);
        btn.addActionListener(this);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("fill details")){
            frame=new JFrame();
            frame.setTitle("JFrame two");
            
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setBounds(500,550,500,300);
            frame.setLocationRelativeTo(null);

            p2=new JPanel();
            btn2=new JButton("submit");
            ta=new JTextField(20);
            p2.add(btn2);
            p2.add(ta);
            frame.add(p2);
            btn2.addActionListener(this);

            frame.setVisible(true);
            f.dispose();
        }if(e.getActionCommand().equals("submit")){
            
            String msg=ta.getText();
            la.setText(msg);
            frame.dispose();
            f.setVisible(true);
        }
    }
}