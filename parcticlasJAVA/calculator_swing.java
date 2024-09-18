import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator_swing extends JFrame implements ActionListener {
    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    public calculator_swing(){
        jf=new JFrame();
        jf.setTitle("MINI calculator using swing");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1=new JLabel("First number: ");
        l2=new JLabel("Second number: ");
        l3=new JLabel("RESULT:= ");

        b1=new JButton("+ ");
        b2=new JButton(" -");
        b3=new JButton("* ");
        b4=new JButton(" /");

        t1=new JTextField("       ");
        t2=new JTextField("       ");
        t3=new JTextField();

        jf.add(l1);
        jf.add(t1);

        jf.add(l2);
        jf.add(t2);

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        jf.add(l3);
        jf.add(t3);
        jf.setVisible(true);
        jf.setSize(300,200);
    }
    public void actionPerformed(ActionEvent ae){
        int a,b,c=10;
        // t1.setText("1st ");
        // t2.setText("2nd ");
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        if (ae.getSource()==b1){
            c=a+b;
            t3.setText(Integer.toString(c));
        }
        else if (ae.getSource()==b2){
            c=a-b;
            t3.setText(Integer.toString(c));
        }
        else if (ae.getSource()==b3){
            c=a*b;
            t3.setText(Integer.toString(c));
        }
        else if (ae.getSource()==b4){
            c=a/b;
            t3.setText(Integer.toString(c));
        }
        else{
            System.out.println("Invalid input");
        }
        // t3.setText("result: ");
    }
    public static void main(String[] args){
        new calculator_swing();

    }
}