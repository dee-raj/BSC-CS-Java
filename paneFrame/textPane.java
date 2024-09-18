/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneFrame;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


/**
 *
 * @author hp
 */
public class textPane {
    JFrame frame;
    public textPane(){
        frame=new JFrame("JTextPane example");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        JTextPane textp=new JTextPane();  
        textp.setText("Hey there,");
        
        SimpleAttributeSet attr=new SimpleAttributeSet();
        StyleConstants.setBold(attr, true);
//        textp.setCharacterAttributes(attr, true);
        Document doc=textp.getStyledDocument();
        try {
            doc.insertString(doc.getLength(), " wellcom ", attr);
            attr=new SimpleAttributeSet();
            StyleConstants.setItalic(attr, true);
            doc.insertString(doc.getLength(), " to ", attr);
            
            doc.insertString(doc.getLength(), " Java ", attr);
            attr=new SimpleAttributeSet();
            StyleConstants.setUnderline(attr, true);
            doc.insertString(doc.getLength(), " swing ", attr);
            
            doc.insertString(doc.getLength(), " tutoril ", attr);
            attr=new SimpleAttributeSet();
            StyleConstants.setBackground(attr, Color.gray);
            doc.insertString(doc.getLength(), " ): ", attr);
            
        } catch (BadLocationException ex) {
            Logger.getLogger(textPane.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        frame.getContentPane().add(textp);
        frame.revalidate();
    }
    public static void main(String draj[]){new textPane();}
}




