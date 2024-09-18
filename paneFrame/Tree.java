/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author hp
 */
public class Tree{
    JTree tree;
    JFrame frame;
    JLabel show;
    public Tree(){
        frame=new  JFrame("JTree demo");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        DefaultMutableTreeNode rootnode=new DefaultMutableTreeNode("Root Node");
        DefaultMutableTreeNode A=new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("a1");
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("a2");
        
        DefaultMutableTreeNode B=new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("b1");
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("b2");
        DefaultMutableTreeNode b3=new DefaultMutableTreeNode("b3");
        
        DefaultMutableTreeNode C=new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("c1");
        DefaultMutableTreeNode c11=new DefaultMutableTreeNode("c11");
        DefaultMutableTreeNode c12=new DefaultMutableTreeNode("c12");
        
        DefaultMutableTreeNode D=new DefaultMutableTreeNode("D");
        DefaultMutableTreeNode d1=new DefaultMutableTreeNode("d1");
        DefaultMutableTreeNode E=new DefaultMutableTreeNode("E");
        
        A.add(a1);
        A.add(a2);
        
        B.add(b1);
        B.add(b2);
        B.add(b3);
        
        C.add(c1);
        c1.add(c11);
        c1.add(c12);
        
        D.add(d1);
      
        rootnode.add(A);
        rootnode.add(B);
        rootnode.add(C);
        rootnode.add(D);
        rootnode.add(E);
        
        tree=new JTree(rootnode);
        frame.add(tree);

        show=new JLabel();

        tree.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            TreePath tp=tree.getPathForLocation(e.getX(),e.getY());
            if(e.getClickCount()==2){
                show.setText(tp.toString());
                frame.add(show,BorderLayout.SOUTH);
                frame.validate();
            }else{
                show.setText(null);
            }
        }
        });
        frame.setVisible(true);
    }
    public static void main(String draj[]){new Tree();}
}
