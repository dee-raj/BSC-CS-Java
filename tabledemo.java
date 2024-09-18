import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tabledemo extends JApplet
{
String heading[]={"rollno","name","hobby"};
Object [][] data={
{new Integer(100),"Kalyan","Dance"},
{new Integer(101),"arif","singing"},
{new Integer(102),"Dhurbharaj","watching movie"},
{new Integer(103),"Gokhul","being serious"},
{new Integer(104),"vivek","Being dumb"},
{new Integer(105),"Rudra","Gym"},
{new Integer(106),"Noyal","helping"},
{new Integer(107),"Rohan","Listening song"},
{new Integer(108),"sobit","sleeping"},
{new Integer(109),"Sumit","Having fun"}
};

public void init()
{ 
JTable student= new JTable(data,heading);
Container cp=getContentPane();
setLayout(new FlowLayout());
cp.add(student);
student.setVisible(true);
}
}
/*
<applet code="tabledemo.class" width=300 height=100>
</applet>
*/