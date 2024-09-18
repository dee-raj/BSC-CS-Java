package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionFrame extends JFrame implements ActionListener{
    JButton btn;
    Container con;

    ActionFrame(){
        setTitle("Button click event handling...");
        setBounds(400,30,400,500);
        // setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        con=getContentPane();
        con.setLayout(null);
        btn=new JButton("click here!");
        btn.setBounds(40,200,150,30);
        con.add(btn);
        
        btn.addActionListener(this);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String str =btn.getText();
        con.setBackground(Color.gray);
        btn.setText(str.toUpperCase());
        btn.setBackground(Color.CYAN);
    }
}

public class buttonClick {
    public static void main(String[] Draj){
        new ActionFrame();
    }
}