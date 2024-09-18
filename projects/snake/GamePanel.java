/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author hp
 */
class GamePanel extends JPanel implements ActionListener,KeyListener{
    private boolean left=false;
    private boolean right=true;
    private boolean up=true;
    private boolean down=false;
    private int score=0;
    
    private final int[] lenX=new int[850];
    private final int[] lenY=new int[850];
    private int snakeLen=3;
    private int moves=0;
    private final int X[]={25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500, 525, 550, 575, 600, 625,650, 675, 700, 725, 750, 775, 800, 825};
    private final int Y[]={75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500, 525, 550, 575};
    private final Random random=new Random();
    private int enemyX,enemyY;

    private final ImageIcon snakeTitle=new ImageIcon(getClass().getResource("snaketitle.jpg"));
    private final ImageIcon leftMouth=new ImageIcon(getClass().getResource("leftmouth.png"));
    private final ImageIcon rightMouth=new ImageIcon(getClass().getResource("rightmouth.png"));
    private final ImageIcon upMouth=new ImageIcon(getClass().getResource("upmouth.png"));
    private final ImageIcon downMouth=new ImageIcon(getClass().getResource("downmouth.png"));
    private final ImageIcon enemy=new ImageIcon(getClass().getResource("enemy.png"));
    private final ImageIcon snakeBody=new ImageIcon(getClass().getResource("snakeimage.png"));
    
    private final Timer timer;
    private int delay=300;
    private boolean gameover=false;
    
    public GamePanel(){
        addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(true);
        timer=new Timer(delay,this);
        timer.start();
        
        eatFood();
        newEnemy();
    }
    private void eatFood() {
        if(lenX[0]==enemyX && lenY[0]==enemyY){
            newEnemy();
            snakeLen++;
            score++;
        }
    }
    private void newEnemy() {
        enemyX=X[random.nextInt(32)];
        enemyY=Y[random.nextInt(20)];
        
        for(int i=snakeLen-1;i>=0;i--){
            if(lenX[i]==enemyX && lenY[i]==enemyY){
                newEnemy();
            }
        }
    }   


    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.white);
        g.drawRect(24,10,857,55);//title bar    
        g.drawRect(24,74,851,581);//main-play-box
        
        snakeTitle.paintIcon(this, g, 28, 11);//title-bar image
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 580);
        
        if(moves==0){
            lenX[0]=100;
            lenX[1]=75;
            lenX[2]=50;
            
            lenY[0]=100;
            lenY[1]=100;
            lenY[2]=100;
        }
        if(left){
            leftMouth.paintIcon(this, g, lenX[0], lenY[0]);
        }
        else if(right){
            rightMouth.paintIcon(this, g, lenX[0], lenY[0]);
        }
        else if(up){
            upMouth.paintIcon(this, g, lenX[0], lenY[0]);
        }
        else if(down){
            downMouth.paintIcon(this, g, lenX[0], lenY[0]);
        }
        for(int i=0; i<snakeLen;i++){
            snakeBody.paintIcon(this, g, lenX[i], lenY[i]);
        }
        enemy.paintIcon(this, g, enemyX, enemyY);
        
        if(gameover){
            g.setColor(Color.red);
            g.setFont(new Font("",Font.BOLD,34));
            g.drawString("GAME OVER! Total score: "+score, 250, 300);
            
            g.setColor(Color.magenta);
            g.setFont(new Font("",Font.ITALIC,24));
            g.drawString("press SPACE to restart", 350, 400);
            
        }
        g.setColor(Color.magenta);
        g.setFont(new Font("",Font.ITALIC,24));
        g.drawString("score: "+score, 750,40);
        
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=snakeLen-1;i>0;i--){
            lenX[i] =lenX[i-1];
            lenY[i] =lenY[i-1];
        }
        
        if(left){
            lenX[0] =lenX[0] -25;
        }
        else if(right){            
            lenX[0] =lenX[0] +25;
        }
        else if(up){
            lenY[0] =lenY[0] -25;
        }
        else if(down){
            lenY[0] =lenY[0] +25;
        }
        if(lenX[0]>850){lenX[0]=25;}
        if(lenX[0]<25){lenX[0]=850;}
        if(lenY[0]>625){lenY[0]=75;}
        if(lenY[0]<75){lenY[0]=625;}
        
        eatFood();
        endGame();
        
        repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT && !right){
            moves++;
            left=true;
            right=false;
            up=false;
            down=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT && !left){
            moves++;
            left=false;
            right=true;
            up=false;
            down=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP && !down){
            moves++;
            left=false;
            right=false;
            up=true;
            down=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN && !up){
            moves++;
            left=false;
            right=false;
            up=false;
            down=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            restart();
        }
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {    }
    @Override
    public void keyReleased(KeyEvent e) {    }

    
    private void endGame(){
        for(int i=snakeLen+1;i>0;i--){
            if(lenX[i]==lenX[0] && lenY[i]==lenY[0]){
                
                gameover=true;
                timer.stop();
            }
        }
    }

    private void restart() {
        gameover=false;
        moves=0;
        score=0;
        snakeLen=3;

        timer.start();
        newEnemy();
        
        repaint();
    }
}