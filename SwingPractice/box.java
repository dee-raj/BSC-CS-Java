package gui.layout;

import java.awt.*;
import javax.swing.*;

public class box extends JFrame{
    Container con;
    JButton b1,b2,b3,b4;
    BoxLayout bl;
    public box(){
        setTitle("Box Layout");
        setBounds(400,20,400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con=this.getContentPane();
        bl=new BoxLayout(con,bl.Y_AXIS);
        con.setLayout(bl);

        b1=new JButton("button one");
        b2=new JButton("button two not too");
        b3=new JButton("button three");
        b4=new JButton("button four................");

        b1.setAlignmentX(CENTER_ALIGNMENT);
        b2.setAlignmentX(CENTER_ALIGNMENT);
        b3.setAlignmentX(CENTER_ALIGNMENT);
        b4.setAlignmentX(CENTER_ALIGNMENT);

        con.add(b1);
        con.add(Box.createRigidArea(new Dimension(0,40)));//to create an empty space
        con.add(b2);
        con.add(b3);
        con.add(b4);

        con.setBackground(Color.CYAN);
        setVisible(true);
    }
    public static void main(String[] drajStrings) {
     new box();   
    }
}