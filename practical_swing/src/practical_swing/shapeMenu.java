package practical_swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class shapeMenu extends JFrame implements MouseListener{
    public static void main(String draj[]){
        new shapeMenu();
    }
    JMenu jm1,jm2,jm3,jm4,jm5;
    JMenuBar jmb;
    ImageIcon i1,i2,i3,i4;
    JLabel jl;
    
    public shapeMenu(){
        setLayout(new BorderLayout());
        setTitle("Menu bar project");
        setVisible(true);
        setBounds(500,30,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jmb=new JMenuBar();
        jm1=new JMenu("Project");
        jm2=new JMenu("java");
        jm4=new JMenu("AD. DBMS");
        jm3=new JMenu("C++");
        jm5=new JMenu("Exit");
        
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);
        
        jm1.addMouseListener(this);
        jm2.addMouseListener(this);
        jm3.addMouseListener(this);
        jm4.addMouseListener(this);
        jm5.addMouseListener(this);
        jl=new JLabel();
        
        add(jmb,BorderLayout.NORTH);
        add(jl);
    }
    /**
     *
     * @param me
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==jm1){
            i1=new ImageIcon("ad_form.png");
            jl.setIcon(i1);
//            jl.setText("Image not found"); // put image in the main directory
        }else if(me.getSource()==jm2){
            i2=new ImageIcon("java_switch.png");
            jl.setIcon(i2);
        } else if(me.getSource()==jm3){
            i3=new ImageIcon("multiple.png");
            jl.setIcon(i3);
        } else if(me.getSource()==jm4){
            i4=new ImageIcon("f_hi.png");
            jl.setIcon(i4);
        } else if(me.getSource()==jm5){
            System.exit(0);
        }
    }    @Override
    public void mousePressed(MouseEvent me){
    }    @Override
    public void mouseEntered(MouseEvent me){   
    }    @Override
    public void mouseExited(MouseEvent me){
    }    @Override
    public void mouseReleased(MouseEvent e) {
    }
}