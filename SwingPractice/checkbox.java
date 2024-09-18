package gui;
import javax.swing.*;
import java.awt.*;

public class checkbox {
    JFrame jf;
    Container con;
    JCheckBox cb1,cb2,cb3,cb4,cb5;
    checkbox(){
        jf=new JFrame("my check box");
        jf.setBounds(400,20,400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        con=jf.getContentPane();
        con.setLayout(null);

        cb1=new JCheckBox("TOC");
        cb2=new JCheckBox("SW");
        cb3=new JCheckBox("AAD");
        cb4=new JCheckBox("AND");
        cb5=new JCheckBox("IoT");

        cb1.setBounds(5,30,80,30);
        cb2.setBounds(90,30,50,30);
        cb3.setBounds(150,30,50,30);
        cb4.setBounds(210,30,50,30);
        cb5.setBounds(270,30,90,30);

        con.add(cb1);
        con.add(cb2);
        con.add(cb3);
        con.add(cb4);
        con.add(cb5);
        
        con.setBackground(Color.GRAY);
        cb4.setSelected(true);
        cb2.setEnabled(false);
        cb5.setFont(new Font("arial",Font.ITALIC,20));
        cb1.setFont(new Font("arial",Font.BOLD,19));
        cb3.setBackground(Color.LIGHT_GRAY);
        jf.setVisible(true);
    }

    public static void main(String[] Draj) {
        new checkbox();
    }
}
