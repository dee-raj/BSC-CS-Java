import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class dialog_demo extends JFrame implements ActionListener{
JFrame f=new JFrame();
JButton b1=new JButton("Information Dialog");
JButton b2=new JButton("Error Dialog");
JButton b3=new JButton("Question Dialog");
JButton b4=new JButton("Warning Dialog");
JButton b5=new JButton("Plain Dialog");

public dialog_demo(){
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
cp.add(b1);
cp.add(b2);
cp.add(b3);
cp.add(b4);
cp.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
f.setVisible(true);
f.add(cp);
f.setSize(250,250);
}
public void actionPerformed(ActionEvent ae){
String dtitle="Dialog";
String msg="Hello from swing";
int type=JOptionPane.PLAIN_MESSAGE;
if(ae.getSource()==b1)
type=JOptionPane.INFORMATION_MESSAGE;
if(ae.getSource()==b2)
type=JOptionPane.ERROR_MESSAGE;
if(ae.getSource()==b3)
type=JOptionPane.QUESTION_MESSAGE;
if(ae.getSource()==b4)
type=JOptionPane.WARNING_MESSAGE;
if(ae.getSource()==b5)
type=JOptionPane.PLAIN_MESSAGE;
JOptionPane.showMessageDialog(null, msg,dtitle,type);
}
public static void main(String [] args)
{ new dialog_demo();
}
}