import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
public class tappane_demo implements ActionListener,ItemListener
{
int type = JOptionPane.PLAIN_MESSAGE;
JCheckBox cb1,cb2,cb3,cb4;
JRadioButton rb1,rb2,rb3;
JComboBox b1;
JLabel l;
public tappane_demo()
{
l = new JLabel();
JPanel p1 = new JPanel();
cb1 = new JCheckBox("C");
cb2 = new JCheckBox("Python");
cb3 = new JCheckBox("Java");
cb4 = new JCheckBox("PHP");
p1.add(cb1);
p1.add(cb2);
p1.add(cb3);
p1.add(cb4);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
JPanel p2 = new JPanel();
rb1 = new JRadioButton("Windows");
rb2 = new JRadioButton("Linux");
rb3 = new JRadioButton("Macintosh");
p2.add(rb1);
p2.add(rb2);
p2.add(rb3);
ButtonGroup bg= new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
JPanel p3 = new JPanel();
b1 = new JComboBox();
b1.addItem("Bsc");
b1.addItem("Msc");
b1.addItem("Mca");
p3.add(b1);
p3.add(l);
JFrame f=new JFrame();
JTabbedPane t=new JTabbedPane();
t.addTab("Language",p1);
t.addTab("OS",p2);
t.addTab("Course",p3);
f.setTitle("Tabbed Pane in swing");
t.setTabPlacement(JTabbedPane.TOP);
f.add(t);
f.setVisible(true);
f.setSize(400,400);
}
public void itemStateChanged(ItemEvent i)
{
String msg="";
if(i.getSource()==cb1)
{
if(cb1.isSelected()==true)
msg="C Selected";
JOptionPane.showMessageDialog(null, msg);
}
if(i.getSource()==b1)
{ l.setText((String)i.getItem());
}}
public static void main(String args[])
{
new tappane_demo();
}
public void actionPerformed(ActionEvent e)
{
throw new UnsupportedOperationException("Not supported yet!!");
}}