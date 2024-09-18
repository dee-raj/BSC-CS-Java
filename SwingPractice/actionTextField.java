package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PressField extends JFrame implements ActionListener{
    Container c;
    JTextField text;
    JButton btn;
    PressField(){
        setTitle("press enter for a text field");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,40,500,330);

        c=getContentPane();
        c.setLayout(null);

        text=new JTextField("focus here ...");
        text.setBounds(20,10,200,40);
        text.addActionListener(this);
        c.add(text);
        text.setFont(new Font("arial",Font.BOLD,18));

        btn=new JButton("Print");
        btn.setBounds(40,80,90,40);
        btn.addActionListener(this);
        c.add(btn);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==text){
            String get=text.getText();
            text.setText(get.toUpperCase());
            text.setBackground(Color.MAGENTA);
        }
        if(e.getSource()==btn){
            System.out.println("This is typied there:=>> "+text.getText());
            c.setBackground(Color.cyan);
            btn.setBackground(Color.green);
        }
    }
}

public class actionTextField{
    public static void main(String Draj[]){
        new PressField();
    }
}