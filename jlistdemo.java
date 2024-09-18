import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jlistdemo extends JPanel
{
public jlistdemo(){
JList l;
String browser[]={"Chrome","Tor","Brave","Opera","Fire Fox","Safari","Tor","DuckDuckGo","Binge","Infinity"};
l=new JList();
l.setListData(browser);
l.setSelectedIndex(1);
int mode=ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
l.setSelectionMode(mode);
add(new JScrollPane(l));
}
public static void main(String args[])
{
JFrame f=new JFrame("List in Swing");
jlistdemo ld=new jlistdemo();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(250,200);
f.getContentPane().add(ld);
f.setVisible(true);
}}