import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jintframedemo extends JFrame implements ActionListener,ItemListener{
JButton b;
JComboBox cb;
JRadioButton rb;
JCheckBox ck;
String msg, dtitle="Dialog";
int type=JOptionPane.PLAIN_MESSAGE;
public Jintframedemo()
{ b=new JButton("frame1");
cb=new JComboBox();
cb.addItem("DCN");
cb.addItem("Adv Java");
cb.addItem("OS");
cb.addItem("DBMs");
rb=new JRadioButton("frame3");
ck=new JCheckBox("frame4");
JDesktopPane dp;
JInternalFrame f1,f2,f3,f4;
JFrame f=new JFrame("Multiple frame");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

dp=new JDesktopPane();

f1=new JInternalFrame("frame1",true,true,true,true);
f1.setBounds(20,20,100,100);
f1.add(b);
b.addActionListener(this);
f1.setVisible(true);

f2=new JInternalFrame("frame2",true,true,true,true);
f2.setBounds(150,20,100,100);
f2.add(cb);
f2.setVisible(true);

f3=new JInternalFrame("frame3",true,true,true,true);
f3.setBounds(20,150,100,100);
f3.add(rb);
rb.addActionListener(this);
f3.setVisible(true);

f4=new JInternalFrame("frame4",true,true,true,true);
f4.setBounds(150,150,100,100);
f4.add(ck);
ck.addItemListener(this);
f4.setVisible(true);

dp.add(f1);
dp.add(f2);
dp.add(f3);
dp.add(f4);
f.add(dp);
f.setSize(300,300);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==b)
{msg=b.getText();
}
else if (ae.getSource()==rb)
{ msg=ae.getActionCommand().toString();
}
JOptionPane.showMessageDialog(null,msg,dtitle,type);
}

public void itemStateChanged(ItemEvent ie){
if(ie.getSource()==ck)
{msg=ck.getText();
}
else if (ie.getSource()==b)
{ msg=(String)ie.getItem();
}
JOptionPane.showMessageDialog(null,msg,dtitle,type);
}
public static void main(String agrs[]){
new Jintframedemo();
}
}