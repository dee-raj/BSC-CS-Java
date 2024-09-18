package gui.layout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class card extends JFrame implements ActionListener{
    JButton btn1,btn2,btn3,btn4,btn5;
    Container con;
    CardLayout cl;
    public card(){
        setTitle("Card layout");
        setBounds(400,20,400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con=this.getContentPane();
        cl=new CardLayout();
        con.setLayout(cl);
        
        btn1=new JButton("1=> next");
        btn2=new JButton("2=> show who's id=b3");
        btn3=new JButton("3=> last");
        btn4=new JButton("4=> first");
        btn5=new JButton("5=> previous");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        con.add(btn1,"b1");
        con.add(btn2,"b2");
        con.add(btn3,"b3");
        con.add(btn4,"b4");
        con.add(btn5,"b5");
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            cl.next(con);
            btn1.setBackground(Color.pink);
            System.out.println("\n"+btn1.getText().toString().toUpperCase());
        }
        if(e.getSource()==btn2){
            cl.show(con,"b3");
            btn2.setBackground(Color.ORANGE);
            System.out.println(btn2.getText().toString().toUpperCase());
        }
        if(e.getSource()==btn3){
            cl.last(con);
            btn3.setBackground(Color.magenta);
            System.out.println(btn3.getText().toString().toUpperCase());
        }
        if(e.getSource()==btn4){
            cl.first(con);
            btn4.setBackground(Color.green);
            System.out.println(btn4.getText().toString().toUpperCase());
        }
        if(e.getSource()==btn5){
            cl.previous(con);
            btn5.setBackground(Color.yellow);
            System.out.println(btn5.getText().toString().toUpperCase());
        }
    }
    public static void main(String draj[]) {
        new card();
    }
}
