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
    int x=10;
    int y=100;
    int width=150;
    int height=40;
    int step=10;
    int max_x,max_y;
    Panel(int w,int h){
        this.max_x=w; 
        this.max_y=h;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
//        g.setColor(Color.white);
        g.setColor(Color.red);
        
        g.fillRect(x, y,width,height);
        if(x>max_x || x<10) step = - step;
        x = x + step;
        try {
            Thread.sleep(40);
        } catch (InterruptedException ex) {
        }
        repaint();
    }
}

public class animation01 extends JFrame{
    public animation01(){
        setTitle("Animation of rectangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
//        setVisible(true);
        setLocationRelativeTo(null);
        
        Panel pan=new Panel(400,200);
        pan.setBackground(Color.gray);
        add(pan);
        
     validate();   
    }
    public static void main(String draj[]){ new animation01().setVisible(true);}
}