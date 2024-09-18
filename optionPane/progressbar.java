/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class progressbar extends JFrame {
    public progressbar(){
        setVisible(true);
        setTitle("tool tip for the component msg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(300,220);
        setLayout(new FlowLayout());
        
        JProgressBar pb=new JProgressBar();
        pb.setStringPainted(true);
        add(pb);
        
        JProgressBar pb2=new JProgressBar();
        pb2.setStringPainted(true);
        pb2.setOrientation(SwingConstants.VERTICAL);
        add(pb2);
        
        //to increase progress
        int i=0;
        while(i<=100){
            try {
                pb.setValue(i);
                pb2.setValue(i);
                
                Thread.sleep(300);
               
                if(i==100){
                    Thread.sleep(1000);
                    System.exit(0);
                }
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(progressbar.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i<10){
                pb2.setString("initializing..");
            } else if(i<50){
                pb2.setString("Processing...");
            }else if(i>=50){
                pb2.setString("please wait");
            }else if(75<=i && i<=99){
                pb2.setString("Completing...");
            }else if(i==100){
                pb2.setString("TASK COMPLED");
            }
        }
        
        
        validate();
    }
    public static void main(String[] draj){
    new progressbar();
    }
}
