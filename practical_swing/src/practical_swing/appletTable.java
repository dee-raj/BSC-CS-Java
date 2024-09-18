package practical_swing;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.*;
/*
<applet code="appletTable.class" width=400 height=400></applet>
*/
public class appletTable extends JApplet{
    public static void main(String[] args){
        new appletTable();
    }
    String heading[]={"Roll no","Name","Age","Hobby"};
    Object[][] data={
        {1,"Ram",18,"hunting"},
        {2,"Ramesh",22,"dancing"},
        {3,"Raju",31,"singing"}
    };
    
    @Override
    public void init(){
        JTable students=new JTable(data,heading);
        setLayout(new FlowLayout());
        Container cnt=getContentPane();
        students.setVisible(true);
    }
}