import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
public class tree implements MouseListener {
    JFrame jf;
    JTree tr;
    JTextField t1=new JTextField(21);
    
    public tree(){
        jf=new JFrame("Tree using swing");
        jf.setLayout(new BorderLayout());
        jf.setSize(290,490);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.getContentPane();
    
        DefaultMutableTreeNode cource=new DefaultMutableTreeNode("Cource");
        DefaultMutableTreeNode arts=new DefaultMutableTreeNode("Arts");
        DefaultMutableTreeNode commerce=new DefaultMutableTreeNode("Commerce");
        DefaultMutableTreeNode science=new DefaultMutableTreeNode("Science");

        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Finarts");
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("MassMedia");
        DefaultMutableTreeNode a3=new DefaultMutableTreeNode("HIstory");
        DefaultMutableTreeNode a4=new DefaultMutableTreeNode("Engish");

        DefaultMutableTreeNode s1=new DefaultMutableTreeNode("CS");
        DefaultMutableTreeNode s2=new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode s3=new DefaultMutableTreeNode("PYSICS");
        DefaultMutableTreeNode s4=new DefaultMutableTreeNode("MATHS");

        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("BAF");
        DefaultMutableTreeNode c2=new DefaultMutableTreeNode("BMS");
        DefaultMutableTreeNode c3=new DefaultMutableTreeNode("BBI");
        DefaultMutableTreeNode c4=new DefaultMutableTreeNode("B.com");

        cource.add(arts);
        cource.add(commerce);
        cource.add(science);

        arts.add(a1);
        arts.add(a2);
        arts.add(a3);
        arts.add(a4);
    
        science.add(s1);
        science.add(s2);
        science.add(s3);
        science.add(s4);

        commerce.add(c1);
        commerce.add(c2);
        commerce.add(c3);
        commerce.add(c4);

        tr=new JTree(cource);
        JScrollPane jsp=new JScrollPane(tr,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jf.add(jsp,BorderLayout.NORTH);
        jf.add(t1,BorderLayout.SOUTH);
        tr.addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
        TreePath tp=tr.getPathForLocation(e.getX(),e.getY());
        if(tp!=null){
            t1.setText(tp.toString());
        }
        else{
        t1.setText(" ");
        }
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args){
       new tree();
    }
}