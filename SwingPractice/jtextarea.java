package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jtextarea extends JFrame{

    jtextarea(){
        setTitle("MY TEXT AREA");
        setBounds(500,50,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        JTextArea ta=new JTextArea();
        ta.setBounds(10,20,400,250);
        ta.setText("this is text are");
        ta.setFont(new Font("arial",Font.BOLD,25));

        ta.setLineWrap(true);
        // ta.setEditable(false);
        c.add(ta);
    

        setVisible(true);
    }
    
    public static void main(String[] Draj){
    new jtextarea();
    }
}
