import java.awt.*;
import javax.swing.*;
class awtmenu extends JFrame
{
MenuBar mb;
Menu menu1,menu2,submenu,menu3;
MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9;
public awtmenu()
{
setTitle("AWT Menu");
setSize(400,400);
setLayout(new FlowLayout());
setVisible(true);
setLocationRelativeTo(null);
mb = new MenuBar();
menu1 = new Menu("file");
submenu = new Menu("Color");
m1 = new MenuItem("New");
m2 = new MenuItem("Save ");
m3 = new MenuItem("Save as ");
m4 = new MenuItem("Blue");
m5 = new MenuItem("Red");
m9 = new MenuItem("Exit");		
menu1.add(m1);
menu1.add(m2);
menu1.add(m3);
menu1.add(m9);
submenu.add(m4);
submenu.add(m5);
mb.add(menu1);
menu2 = new Menu("Edit");
m6 = new MenuItem("Undo");
m7 = new MenuItem("Redo");
menu2.add(m6);
menu2.add(m7);
mb.add(menu2);
menu3 = new Menu("Help");
m8 = new MenuItem("About us");
menu3.add(m8);
mb.add(menu3);
setMenuBar(mb);		
}
public static void main(String args[])
{ new awtmenu(); }
}