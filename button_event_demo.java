//package ad_java;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class button_event_demo{
    JLabel jb;
    public button_event_demo()
	{
        JFrame jf=new JFrame("Frame with Button, Label & Event");
        jb=new JLabel("Press a button");
        jf.setLayout(new FlowLayout());
        jf.setSize(200,100);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("ALPHA");

        JButton b2=new JButton("BETA");
        b1.addActionListener(ae -> jb.setText("ALPHA pressed."));
        b2.addActionListener(ae -> jb.setText("BETA pressed."));
        jf.add(b1);
        jf.add(b2);
        jf.add(jb);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        new button_event_demo();
    }
}