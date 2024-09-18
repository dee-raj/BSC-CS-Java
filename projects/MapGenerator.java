/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author hp
 */
public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row, int col){
        map=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                map[i][j]=1;
            }
        }
        brickWidth=645/col;
        brickHeight=200/row;
        
    }
    public void setBrick(int value,int r, int c){
        map[r][c]=value;
    }
    public void draw(Graphics2D g){
        for(int i=0;i<map.length;i++){
            for(int j=0; j<map[0].length;j++){
                if(map[i][j]>0){
                    g.setColor(Color.WHITE);
                    g.fillRect(j*brickWidth+20, i*brickHeight+30,brickWidth, brickHeight);
                    
                    g.setColor(Color.red);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j*brickWidth+20, i*brickHeight+30,brickWidth, brickHeight);
                }
            }
        }
    }
}
