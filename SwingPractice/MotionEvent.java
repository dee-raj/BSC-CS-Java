package gui;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;

public class MotionEvent extends JFrame implements MouseMotionListener{
    JTextArea jta;
    JLabel la;
    String text="  Don't play with me besause I know I can better than you.";
    public MotionEvent(){
        setTitle("MouseMotionListener for mouseMotionEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,50,600,350);
        Container con=this.getContentPane();
        con.setLayout(null);

        jta=new JTextArea();
        jta.setBounds(110,70,400,200);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        con.add(jta);

        la=new JLabel();
        la.setText(text);
        la.setBounds(5,5,550,50);
        la.setFont(new Font("",Font.BOLD,19));
        la.setBorder(new BevelBorder(BevelBorder.LOWERED));
        con.add(la);
        la.addMouseMotionListener(this);
        con.setBackground(Color.magenta);
        setVisible(true);
    }
    public void mouseMoved(MouseEvent me){
        jta.setText(text+"\n  Mouse is moving over the label");
    }
    public void mouseDragged(MouseEvent me){
        jta.setText(jta.getText()+"\n  Dragging the mouse over the label");
    }

    public static void main(String Draj[]){
        new MotionEvent();        
    }
}
