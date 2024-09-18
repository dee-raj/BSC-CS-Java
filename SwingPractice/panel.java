package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class panel extends JFrame implements ActionListener{
    JTextArea show;
    String mindBlown="Without is with out but with is without out\n";
    JButton btn;
    Container c;
    public panel(){
        setTitle("Jpanel for container");
        setBounds(300,20,400,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);


        JPanel p=new JPanel();
        p.setBounds(50,20,300,500);
        p.setBackground(Color.gray);
        p.setLayout(null);
        c.add(p);

        show=new JTextArea(mindBlown);
        show.setBounds(10,220,270,200);
        p.add(show);

        JPanel pp=new JPanel();
        pp.setBounds(25,10,250,180);
        pp.setBackground(Color.yellow);
        pp.setLayout(null);
        p.add(pp);
        // c.add(pp);//to add in container

        btn= new JButton("click to show");
        btn.setBounds(50,70,150,40);
        pp.add(btn);
        btn.addActionListener(this);


        c.setBackground(Color.magenta);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            show.setLineWrap(true);
            show.setWrapStyleWord(true);
            show.setText(show.getText()+" internal panel ");
            c.setBackground(Color.CYAN);
        }
    }
    public static void main(String Draj[]){
        new panel();
    }
}
