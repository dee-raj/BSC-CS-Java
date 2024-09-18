/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class BricksBreaker {
    
    public static void main(String draj[]){
        JFrame frame=new JFrame("Brick Breaker");
        frame.setSize(710,630);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        GamePlay gamePlay=new GamePlay();
        frame.add(gamePlay);
        
        
        frame.setVisible(true);
    }
}



