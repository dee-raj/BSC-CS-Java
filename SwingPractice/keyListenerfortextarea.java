package gui;
import gui.keyFrame;
import javax.swing.*;

public class keyListenerfortextarea {
    public static String quate="deth is not the greatest loss in life the greatest loss is what dies inside us when we alive.";
    public keyListenerfortextarea(){
    }
    public static void main(String draj[]){
        keyFrame kf=new keyFrame();
        kf.setTitle("Key listener for key Event");
        kf.setBounds(600,20,500,500);
        kf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kf.setVisible(true);
    }
}