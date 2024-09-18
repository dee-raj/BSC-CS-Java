/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class desktop extends JFrame {
    JDesktopPane dp;
    public desktop(){
        setTitle("deskto Pane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(700,220);
        
        dp=new JDesktopPane();
        
        display(dp);
        
        
        
        add(dp,BorderLayout.CENTER);
        
        setVisible(true);
    }
    public static void main(String draj[]){new desktop();}

    private void display(JDesktopPane dp) {
        int numFrame =3, x=30, y=30;
        for(int i=1; i<=numFrame;i++){
            JInternalFrame inframe=new JInternalFrame("internal frame "+(i+1),true,true,true,true);
            inframe.setBounds(x,y,230,100);
            inframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            inframe.add(new JLabel("Jabva is best language ever"));
            inframe.setVisible(true);
            
            dp.add(inframe);
            y+=110;
        }
    
    }
}













