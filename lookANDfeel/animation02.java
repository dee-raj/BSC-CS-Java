
package lookANDfeel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class Panel extends JPanel{
    int x=0,y=0;
    int width=50,height=50;
    int speed_x=10,speed_y=10;
    int max_x,max_y;
    Panel(int w,int h){
        this.max_x=w-width; 
        this.max_y=h-height;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        
        g.fillOval(x,y,width,height);
        if(x>max_x || x<0) speed_x= - speed_x;
        if(y>max_y || y<0) speed_y= - speed_y;
        y=y+speed_y;        
        x=x+speed_x;

        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint();
    }
}

public class animation02 extends JFrame{
    public animation02(){
        setTitle("Animation of Ball bouncing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
//        setVisible(true);
        setLocationRelativeTo(null);
        
        Panel pan=new Panel(770,550);
        pan.setBackground(Color.gray);
        add(pan);
        
     validate();   
    }
    public static void main(String draj[]){ new animation02().setVisible(true);}
}