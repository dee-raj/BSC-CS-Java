import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class colorchooser extends JApplet implements ActionListener
{
JPanel jp=new JPanel();
JButton b1;
public void init()
{
b1=new JButton("Click to Choose Color");
jp.add(b1);
getContentPane().add(jp);
b1.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e)
{
Color x=JColorChooser.showDialog(jp,"Select color",Color.WHITE);
b1.setForeground(x);
jp.setBackground(Color.BLUE);
}
}
/*
<applet code="colorchooser.class" width=500 height=200>
</applet>
*/