/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class internalFrame extends JFrame{
    JInternalFrame frame1,frame2;
    
    public internalFrame(){
        setTitle("internal frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(700,220);
        setLayout(null);
 
        frame1=new JInternalFrame("frame 1",true,true,true,true);
        initFrame(frame1);
        add(frame1);
        
        frame2=new JInternalFrame("frame 2",true,true,true,true);
        initFrame(frame2);
        add(frame2);
        
        setVisible(true);
    }
    public static void main(String[] draj){new internalFrame();}
    
    public static void initFrame(JInternalFrame f){
        f.setSize(300,300);
        f.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        f.setLocation(50,50);
        f.setLayout(new FlowLayout());
        
        JButton btn=new JButton("click to show");
        JTextArea show=new JTextArea();
        btn.addActionListener((ActionEvent e)->{
            show.setSize(10,20);
            show.setText("nothing is visible");
            f.add(show);
        });
        f.add(btn);
        
        f.setVisible(true);
    }
}
