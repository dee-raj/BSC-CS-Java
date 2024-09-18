package gui.layout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class nullLayout extends JFrame{
    String q="beauty is nothing without brains";
    JButton btn1,btn2,btn3,btn4,btn5;
    public nullLayout(){
        setTitle("null layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,200,370,300);

        Container con=this.getContentPane();
        con.setLayout(null);

        btn1=new JButton("BUTTON 1");
        btn2=new JButton("BUTTON 2");
        btn3=new JButton("BUTTON 3");
        btn4=new JButton("BUTTON 4");
        btn5=new JButton("BUTTON 5");

        btn1.setBounds(10,10,130,20);
        btn2.setBounds(10,40,130,20);
        btn3.setBounds(10,70,130,20);
        btn4.setBounds(10,100,130,20);
        btn5.setBounds(10,130,130,20);     
        
        
        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(btn4);
        con.add(btn5);

        setVisible(true);
    }
    public static void main(String draj[]) {
        new nullLayout();
        String breathing="Nothing much...Converting Oxygen into carbon dioxide.";
    }
    
}
