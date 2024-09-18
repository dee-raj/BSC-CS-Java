import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class treedemo implements MouseListener {
  JFrame jf;
  JTree t;
  JTextField t1= new JTextField(20);
  public static void main(String args[]){
     new treedemo();
  }
  public treedemo(){
    jf=new JFrame("Tree using swing");
    jf.setLayout(new BorderLayout());
    jf.setSize(100,100);
    jf.setVisible(true);
    jf.getContentPane();
    DefaultMutableTreeNode course= new DefaultMutableTreeNode("course");
    DefaultMutableTreeNode Arts= new DefaultMutableTreeNode("Arts");
    DefaultMutableTreeNode Commerce= new DefaultMutableTreeNode("Commerce");
    DefaultMutableTreeNode Science= new DefaultMutableTreeNode("Science");
    
    DefaultMutableTreeNode a1= new DefaultMutableTreeNode("FineArts");
    DefaultMutableTreeNode a2= new DefaultMutableTreeNode("MassMedia");
    DefaultMutableTreeNode a3= new DefaultMutableTreeNode("History");
    DefaultMutableTreeNode a4= new DefaultMutableTreeNode("English");
    
    DefaultMutableTreeNode c1= new DefaultMutableTreeNode("BAF");
    DefaultMutableTreeNode c2= new DefaultMutableTreeNode("BMS");
    DefaultMutableTreeNode c3= new DefaultMutableTreeNode("Bcom");
    DefaultMutableTreeNode c4= new DefaultMutableTreeNode("BBI");
    
    DefaultMutableTreeNode s1= new DefaultMutableTreeNode("CS");
    DefaultMutableTreeNode s2= new DefaultMutableTreeNode("IT");
    DefaultMutableTreeNode s3= new DefaultMutableTreeNode("Physics");
    DefaultMutableTreeNode s4= new DefaultMutableTreeNode("Maths");
    course.add(Arts);
    course.add(Commerce);
    course.add(Science);
    Arts.add(a1);
    Arts.add(a2);
    Arts.add(a3);
    Arts.add(a4);
    Commerce.add(c1);
    Commerce.add(c2);
    Commerce.add(c3);
    Commerce.add(c4);
    Science.add(s1);
    Science.add(s2);
    Science.add(s3);
    Science.add(s4);
    t = new JTree(course);
    JScrollPane jsp=new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jf.add(jsp);
    jf.add(jsp,BorderLayout.NORTH);
    jf.add(t1,BorderLayout.SOUTH);
    t.addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
TreePath tp=t.getPathForLocation(me.getX(),me.getY());
if(tp!=null)
{
t1.setText(tp.toString());
}
else
{
t1.setText("");
}}
public void mousePressed(MouseEvent me)
{
 }
public void mouseReleased(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me)
{
}
public void mouseExited(MouseEvent me)
{
}
}