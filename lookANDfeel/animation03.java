/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lookANDfeel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author hp
 */
class Panel extends JPanel{
    int x,y;
    int fan_width=350,fan_height=350;
    int center_x,center_y;
    int angle=0;
    Panel(int w,int h){
        this.center_x=w/2; 
        this.center_y=h/2;
        this.x=center_x-fan_width/2;
        this.y=center_y-fan_height/2;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);

//        g.drawOval(206,97,355,355);
//        g.fillOval(330,230,100,100);

        g.fillArc(x, y,fan_width,fan_height,angle,60);
        g.fillArc(x, y,fan_width,fan_height,angle+120,60);
        g.fillArc(x, y,fan_width,fan_height,angle+240,60);
        angle = (angle - 30) % 360;
        
//        g.setColor(Color.ORANGE);

        g.fillRect(center_x, center_y,5,2*fan_height);
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
        }
        repaint();
    }
}

public class animation03 extends JFrame{
    public animation03(){
        setTitle("Animation of Fan moving");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
//        setVisible(true);
        setLocationRelativeTo(null);
        
        Panel pan=new Panel(770,550);
        pan.setBackground(Color.yellow);
        add(pan);
        
     validate();   
    }
    public static void main(String draj[]){ new animation03().setVisible(true);}
}







