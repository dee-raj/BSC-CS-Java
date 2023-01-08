package projects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import projects.*;

public class GamePlay extends JPanel implements ActionListener, KeyListener{
    private boolean play=false;
    private int score=0;
    private int bricks=200;
    private final Timer timer;
    private final int delay=0;
    private int ballAtX=120;
    private int ballAtY=350;
    private int ballXdir =-1;
    private int ballYdir =-1;
    private int playerX=250;
    private MapGenerator Mg;
    
    @Override
    public void paint(Graphics g){
        //black canvas
        g.setColor(Color.black);
        g.fillRect(3, 3, 692,592);
        
        //border
        g.setColor(Color.yellow);
        g.fillRect(0,0,692,3);
        g.fillRect(0,3,3,589);
        g.fillRect(690,3,3,589);
    
        //paddle
        g.setColor(Color.green);
        g.fillRect(playerX,576,100,8);
    
        //bricks
        Mg.draw((Graphics2D)g);
        
        //ball
        g.setColor(Color.magenta);
        g.fillOval(ballAtX,ballAtY,20,20);
        
        //score
        g.setColor(Color.green);
        g.setFont(new Font("",Font.BOLD,23));
        g.drawString("Score: "+score, 550, 23);
        
        //game over
        if(ballAtY>580){
            play=false;
            ballXdir=0;
            ballYdir=0;
            
            g.setColor(Color.red);
            g.setFont(new Font("",Font.BOLD,27));
            g.drawString("GAME OVER! YOU LOST Total Score: "+score, 150, 423);
            
            g.setFont(new Font("",Font.BOLD,19));
            g.drawString("press Enter to restart", 250, 523);
        }
        
        
        //game win
        if(bricks ==0){
            play=false;
            ballXdir=0;
            ballYdir=0;
            
            g.setColor(Color.green);
            g.setFont(new Font("",Font.BOLD,27));
            g.drawString("GAME OVER! YOU WON!! Total Score: "+score, 150, 423);
            
            g.setFont(new Font("",Font.BOLD,19));
            g.drawString("press Enter to restart", 250, 523);
        }
    }
    public GamePlay(){
        addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);

        timer=new Timer(delay,this);
        timer.start();
        
        Mg=new MapGenerator(10,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(play){
            if(ballAtX<=0) ballXdir = -ballXdir; //left-wall
            if(ballAtX>=670) ballXdir = -ballXdir; //right-wall
            if(ballAtY<=0) ballYdir = -ballYdir; //top-celing
            
            Rectangle ballRect=new Rectangle(ballAtX,ballAtY,20,20);
            Rectangle paddleRect=new Rectangle(playerX,580,99,7);
            if(ballRect.intersects(paddleRect)){
                ballYdir = -ballYdir; //down-paddle
            }
            
            A:for(int i=0; i<Mg.map.length;i++){
                for(int j=0;j< Mg.map[0].length;j++){
                    if(Mg.map[i][j]>0){
                        int width = Mg.brickWidth;
                        int height = Mg.brickHeight;
                        int brickAtX = 20+ j*width;
                        int brickAtY = 20+ i*height;
                        
                        Rectangle brickRect=new Rectangle(brickAtX,brickAtY,width,height);
                        if(ballRect.intersects(brickRect)){
                            Mg.setBrick(0, i, j);
                            bricks--;
                            score +=5;
                            
                            if(ballAtX+19 <= brickAtX || ballAtY+1 >= brickAtX + width){ ballXdir = -ballXdir;}
                            else{ ballYdir = -ballYdir;}
                            
                            break A;
                        }
                    }
                }
            }
            
            ballAtX += ballXdir;
            ballAtY += ballYdir;
        }
        repaint();
    }

    private void moveLeft() {
        play=true;
        playerX -=20;    
    }

    private void moveRight() {
        play=true;
        playerX +=20;    
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(playerX<=15) playerX=15;
            else moveLeft();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(playerX>=585) playerX=585;
            else moveRight();
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(!play){
                score=0;
                bricks=20;
                
                ballAtY=350;
                ballXdir =-1;
                ballYdir =-1;
                playerX=250;
                
                Mg=new MapGenerator(10,20);
            }
        }
        if(e.getKeyChar()=='q'){ System.exit(0); }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
}