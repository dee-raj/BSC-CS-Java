package gui;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;

public class eventFocus extends JFrame implements FocusListener{
    Container con;
    JTextArea jta;
    JTextField la;
    String text="  Don't play with me besause I know I can better than you.";
    public eventFocus(){
        setTitle("FocusListener for focusEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,50,600,350);
        con=this.getContentPane();
        con.setLayout(null);

        jta=new JTextArea();
        jta.setBounds(110,70,400,200);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        con.add(jta);

        la=new JTextField();
        la.setText(text);
        la.setBounds(15,5,550,50);
        la.setFont(new Font("",Font.BOLD,19));
        la.setBorder(new BevelBorder(BevelBorder.LOWERED));
        con.add(la);
        la.addFocusListener(this);
        // con.setBackground(Color.magenta);
        setVisible(true);
    }
    public void focusGained(FocusEvent fe){
        jta.setText(jta.getText()+"Focus gained to the upper field.\n");
        con.setBackground(Color.GREEN);
    }
    public void focusLost(FocusEvent fe){
        jta.setText(jta.getText()+"focus is lost from the upper field.\n");
        
        la.setFocusable(false);
        con.setBackground(Color.YELLOW);
    }

    public static void main(String Draj[]){
        new eventFocus();
    }
}
