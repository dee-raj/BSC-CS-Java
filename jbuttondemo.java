import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jbuttondemo
{
JLabel l;
JButton b1,b2;
public jbuttondemo(){
JFrame f=new JFrame("Frame with buttons, label and event");
l=new JLabel("Press a BUtton");
f.setLayout(new FlowLayout());
f.setSize(200,100);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton b1=new JButton("ALPHA");
JButton b2=new JButton("BETA");
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
l.setText("ALPHA PRESSED");
}});
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
l.setText("BETA PRESSED");
}});
f.add(b1);
f.add(b2);
f.add(l);
f.setVisible(true);
}
public static void main(String args[])
{
new jbuttondemo();
}}