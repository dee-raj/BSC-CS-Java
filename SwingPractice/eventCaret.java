package gui;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import javax.swing.event.*;

public class eventCaret extends JFrame implements CaretListener{
    Container con;
    JTextArea jta;
    JTextField la;
    String text="  Don't play with me besause I know I can better than you.";
    public eventCaret(){
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
        la.addCaretListener(this);
        con.setBackground(Color.magenta);
        setVisible(true);
    }
    public void caretUpdate(CaretEvent ce){
        jta.setText("Caret is updated.\nPosition of Caret: "+ce.getMark());
        con.setBackground(Color.GREEN);
    }

    public static void main(String Draj[]){
        new eventCaret();
    }
}
