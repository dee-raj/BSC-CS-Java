package gui;
import javax.swing.*;
import java.awt.*;

public class menubar {
    JFrame jf;
    JMenuBar jmb;
    JMenu m1,m2;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;

    menubar(){
        jf=new JFrame("MY menu BAR...");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,30,400,500);
        jf.setLocationRelativeTo(null);
        
        jmb=new JMenuBar();

        m1=new JMenu("files");
        m2=new JMenu("edit");

        mi1=new JMenuItem("new");
        mi2=new JMenuItem("open");
        mi3=new JMenuItem("save");
        mi4=new JMenuItem("exit");
        mi5=new JMenuItem("save as");
        mi6=new JMenuItem("redo");
        mi7=new JMenuItem("undo");

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);

        jmb.add(m1);
        m1.add(m2);  //submenu
        // jmb.add(m2);

        jf.setJMenuBar(jmb);

        jf.setVisible(true);
    }
    public static void main(String Draj[]){
        new menubar();
    }
}