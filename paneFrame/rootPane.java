/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;

import javax.swing.*;

/**
 *
 * @author hp
 */
public class rootPane extends JFrame{
    public rootPane(){
        JRootPane rtp=this.getRootPane();
        
        
        JButton btn=new JButton("button");
        JMenuBar mbr=new JMenuBar();
        JMenu file=new JMenu("File");
        
        file.add("new file");
        file.add("open file");
        file.add("save file");
        file.add("close file");
        mbr.add(file);
        
        rtp.getContentPane().add(btn);
        rtp.setJMenuBar(mbr);
        
    }
    public static void main(String draj[]){
        rootPane rp = new rootPane();
        rp.setTitle("JRootPane");
        rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rp.setSize(600,400);
        rp.setLocationRelativeTo(null);
        rp.setVisible(true);
    }
}
