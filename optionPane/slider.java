/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author hp
 */
public class slider extends JFrame implements ChangeListener{
    JLabel l;
    JSlider slid;
    public slider(){
        setVisible(true);
        setTitle("tool tip for the component msg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(300,220);
        setLayout(new FlowLayout());
    
        slid=new JSlider();
        add(slid);
        
        slid.setMinimum(0);
        slid.setMaximum(210);
        
        slid.setPaintTicks(true);
//        slid.setPaintTrack(true);
        slid.setPaintLabels(true);

        slid.setMajorTickSpacing(30);
        slid.setMinorTickSpacing(5);
        
//        slid.setOrientation(JSlider.VERTICAL);
        
        slid.addChangeListener(this);
        
        l=new JLabel();
        l.setText("The value of slider: "+slid.getValue());
        add(l);
        
        validate();
    }
    public static void main(String[] draj){new slider();}

    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("The Value: "+slid.getValue());
    }
    
}
