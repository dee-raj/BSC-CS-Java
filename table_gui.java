import java.awt.*;
import javax.swing.*;
 import java.awt.event.*;
/* 
 <applet code="table_gui.class" ></applet>
*/
public class table_gui extends JApplet{
    String heading[]={"Roll no: ","Name: ","Hobby: "};
        Object[][] data={
            {10,"SHIV","Dancing"},
            {11," SHANKAR ","Singing"},
            {12," MAHESH ","Drawing"},
            {13," BRAHMA ","meditating"},
            {14," BISHNU ","travelling"},
            {15," KAILASH ","Fighting"},
            {16," BHOLENATH ","Have fun"},
            {17," PASUPATHI ","Boxing"},
            {18," RAM ","Teaching"},
            {19," RAMESHWAR ","Speech"}
        };
    public void init(){
        JTable jt=new JTable(data,heading);
         setLayout(new FlowLayout());
        Container cp=getContentPane();
        cp.add(jt);
        jt.setVisible(true);
    }
    public static void main(String[] args){
        new table_gui();
    }
}