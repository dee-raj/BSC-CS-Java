package gui.layout;
import javax.swing.*;
import java.awt.*;

public class grid extends JFrame{
    JButton b1,b2,b3,b4,b5;
    public grid(){
        setTitle("Flow Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,500,200);
        Container con=this.getContentPane();


        // b1=new JButton("button one extra size");
        b1=new JButton("button one");
        b2=new JButton("button 2");
        b3=new JButton("button 3");
        b4=new JButton("button 4");
        b5=new JButton("button 5");

        con.add(b1);
        con.add(b2,0);
        con.add(b3);
        con.add(b4);
        con.add(b5,3);
        
        
        // con.setLayout(new GridLayout(3,2));
        GridLayout g=new GridLayout();
        // g.setHgap(20);
        // g.setVgap(30);
        con.setLayout(g);
        setVisible(true);
    }
    public static void main(String draj[]){
        new grid();
    }
}
