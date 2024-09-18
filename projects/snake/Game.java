/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects.snake;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Game extends JFrame{
    public Game(){
        setTitle("The snake game");
        setBounds(200,40,905,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
    }
    public static void main(String draj[]){
        Game game = new Game();
        GamePanel panel=new GamePanel();
        panel.setBackground(Color.darkGray);
        game.add(panel);
        
        game.setVisible(true);
    }
}
