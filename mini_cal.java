import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mini_cal extends JFrame implements ActionListener{
JFrame jf;
JLabel L1,L2,L3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4;
public mini_cal(){
jf=new JFrame();
jf.setTitle("Mini calculator using Swing");
jf.setLayout(new FlowLayout());
jf.setSize(400,400);
jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
L1=new JLabel("First number");
L2=new JLabel("Second number");
L3=new JLabel("Result");
t1=new JTextField(5);
t2=new JTextField(5);
t3=new JTextField(5);
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("/");
jf.add(L1);
jf.add(t1);
jf.add(L2);
jf.add(t2);
jf.add(b1);
jf.add(b2);
jf.add(b3);
jf.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
jf.add(L3);
jf.add(t3);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
int a,b,c=0;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
if (ae.getSource()==b1)
{
c=a+b;
}
else if(ae.getSource()==b2)
{
c=a-b;
}
else if(ae.getSource()==b3)
{
c=a*b;
}
else if(ae.getSource()==b4)
{
c=a/b;
}
t3.setText(Integer.toString(c));
}
public static void main(String args[])  
{
new mini_cal();
}
}