/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lookANDfeel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,34));
        
        g.drawString("TOO TIP TEXT KEY",50,50);
    
        g.drawLine(100,100,200,150);
        
        g.drawRect(100,200,100,50);
        g.fillRect(300,100,200,100);
        
        g.drawOval(300, 230, 100,100);//circle
        g.drawOval(500, 230, 40,110);//elipse
        
        g.setColor(Color.green);
        g.fillOval(10,300,120,67);
        
        g.drawArc(80,300,110,100,0,90);
        g.setColor(Color.blue);
        g.fillArc(180,300,110,100,10,90);
        
        int x[]={100,200,300};
        int y[]={400,600,400};
        g.drawPolygon(x,y,3);
        
        int l[]={400,500,600};
        int b[]={400,550,403};
        g.fillPolygon(l,b,3);
    
        g.setColor(Color.red);
        int y2[]={740,599,680};
        int l1[]={700,599,809};
        g.drawPolyline(l1, y2, 3);
    
        String url="C:\\Users\\hp\\Desktop\\netBeans\\sd02.jpg";
        Image image=new ImageIcon(url).getImage();
        g.drawImage(image,570, 100,300,200,null);
        
//        g.clearRect(0,0,900,999);
    }
    
}