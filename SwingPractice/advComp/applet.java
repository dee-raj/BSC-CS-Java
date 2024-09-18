package comgui;
import java.awt.event.*;
import javax.swing.*;

public class applet extends JApplet{
    JTextField t1;
    JButton btn;
    
    @Override
    public void init(){
        t1=new JTextField();
        btn=new JButton("click");
        t1.setBounds(20,20,100,30);
        btn.setBounds(20,20,100,30);
        add(t1);
        add(btn);
        
        btn.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
    t1.setText("Applet is working perfectlly.");
    }
}
/*
<applet code="applet.class" width="300" height="400"></applet>

*/