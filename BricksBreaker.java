package projects;

import javax.swing.JFrame;
import projects.*;
public class BricksBreaker {
    
    public static void main(String draj[]){
        new BricksBreaker();
        JFrame frame=new JFrame("Brick Breaker");
        frame.setSize(710,630);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        GamePlay gamePlay=new GamePlay();
        frame.add(gamePlay);
        
        
        frame.setVisible(true);
    }
}