import javax.swing.*;
public class scrollpaneeg extends JFrame
{
JTextArea t= new JTextArea();
JScrollPane s=new JScrollPane(t);
public scrollpaneeg()
{ 
s.setBounds(3,3,300,200);
add(s);
}
public static void main(String args[])
{ 
scrollpaneeg sp = new scrollpaneeg();
sp.setSize(300,200);
sp.setTitle("Scroll textarea with JScrollpane");
sp.show();
}
}