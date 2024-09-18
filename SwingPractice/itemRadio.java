package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class itemRadio extends JFrame implements ItemListener{
    Container c;
    JRadioButton m,f;
    JTextArea show;

    public itemRadio(){
        c=this.getContentPane();
        c.setLayout(null);
        m=new JRadioButton("Male");
        f=new JRadioButton("Female");
        m.setBounds(10,10,120,30);
        f.setBounds(10,110,120,30);

        ButtonGroup btn=new ButtonGroup();
        btn.add(m);
        btn.add(f);

        c.add(m);
        c.add(f);
        show=new JTextArea();
        show.setBounds(200,10,200,170);
        c.add(show);

        m.addItemListener(this);
        f.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==m){
            c.setBackground(Color.blue);
            show.setText(m.getText().toUpperCase().toString()+" is clicked");
        }
        if(ie.getSource()==f){
            show.setText(f.getText().toLowerCase().toString()+" is clicked");
            c.setBackground(Color.pink);
        }
    }
    public static void main(String draj[]){
        JFrame jf=new itemRadio();
        jf.setTitle("item listener for radio button ");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400,30,600,300);

        jf.setVisible(true);
    }
}