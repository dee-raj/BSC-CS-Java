package gui.layout;
import javax.swing.*;
import java.awt.*;

public class flow extends JFrame{
    JButton b1,b2,b3,b4,b5;
    public flow(){
        setTitle("Flow Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,500,200);
        Container con=this.getContentPane();


        // b1=new JButton("button one get extra size");
        b1=new JButton("button one");
        b2=new JButton("button 2");
        b3=new JButton("button 3");
        b4=new JButton("button 4");
        b5=new JButton("button 5");

        con.add(b1);
        con.add(b2);
        con.add(b3,1);
        con.add(b4);
        con.add(b5,1);
        
        con.setLayout(new FlowLayout(FlowLayout.RIGHT,30,20));
        /*
            FlowLayout f=new FlowLayout(FlowLayout.RIGHT);
            f.setHgap(110);
            f.setVgap(50);
            con.setLayout(f);
        */

        setVisible(true);
    }
    public static void main(String draj[]){
        new flow();
    }
}
