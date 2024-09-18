package gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class cal_Frame extends JFrame implements ActionListener{
    Container c;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton btn1,btn2,btn3,btn4;

    cal_Frame(){
        c=getContentPane();
        c.setLayout(null);

        setTitle("Simple calculator");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Fist number: ");
        l2=new JLabel("Second number: ");
        l3=new JLabel("Result: ");
        l1.setBounds(10,5,150,20);
        l2.setBounds(10,40,150,20);
        l3.setBounds(10,150,70,30);
        c.add(l1);
        c.add(l2);
        c.add(l3);

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t1.setBounds(110,5,150,30);
        t2.setBounds(110,40,150,30);
        t3.setBounds(80,150,190,30);
        c.add(t1);
        c.add(t2);
        c.add(t3);

        btn1=new JButton("/");
        btn2=new JButton("*");
        btn3=new JButton("+");
        btn4=new JButton("-");
        btn1.setBounds(20,90,50,50);
        btn2.setBounds(95,90,50,50);
        btn3.setBounds(170,90,50,50);
        btn4.setBounds(245,90,50,50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            int a =Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int result;
            if(ae.getSource()==btn1){
                // if(b!=0){
                    result=a/b;
                    t3.setText(a+" / "+b+" = "+result);
                // }
                // else{
                //     t3.setBounds(80,150,220,30);
                //     t3.setText("SYNTAX ERROR! => con't / by 0");
                // }
            }else if(ae.getSource()==btn2){
                result = a*b;
                t3.setText(a+" * "+b+" = "+result);
            }else if(ae.getSource()==btn3){
                result= a+b;
                t3.setText(a+" + "+b+" = "+result);
            }else if(ae.getSource()==btn4){
                result= a-b;
                t3.setText(a+" - "+b+" = "+result);
            }
		    c.setBackground(Color.GREEN);
        }catch(NumberFormatException nexp){
		    c.setBackground(Color.RED);
            t3.setBounds(80,150,330,30);
            t3.setText("PLEASE ENTER INTEGER VALUE(numbers) ONLY.");
        }catch(ArithmeticException aexp){
		    c.setBackground(Color.MAGENTA);
            t3.setText("SYNTAX ERROR! => con't / by 0");
        }
    }
}
public class calculator{
    public static void main(String Draj[]){
        cal_Frame cf=new cal_Frame();
    }
}