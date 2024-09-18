/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hp
 */
public class fileChoose extends JFrame implements ActionListener{
    JButton o,s;
    JPanel pane;
    JFileChooser file;
    public fileChoose(){
        setTitle("File Chooser");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        
        pane=new JPanel();
        o=new JButton("Open");
        s=new JButton("Save");
        pane.add(o);
        pane.add(s);
        
        o.addActionListener((ActionListener) this);
        s.addActionListener((ActionListener) this);
        
        file=new JFileChooser("D:\\CoreJava\\SwingPractice"); //string arg is for default path of the dialog
//        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        file.setMultiSelectionEnabled(true);
        file.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter filter1=new FileNameExtensionFilter("Only class file","class");
        FileNameExtensionFilter filter2=new FileNameExtensionFilter("Only Java file","java");
        FileNameExtensionFilter filter3=new FileNameExtensionFilter("Only text file","txt");
        file.addChoosableFileFilter(filter1);
        file.addChoosableFileFilter(filter2);
        file.addChoosableFileFilter(filter3);
        add(pane);
        setVisible(true);
    }
    public static void main(String draj[]){
        new fileChoose();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==o){
//            int flag=file.showDialog(pane, "Open my file");
            int f=file.showOpenDialog(null);
            if(f==JFileChooser.APPROVE_OPTION){
                File[] selectedFiles=file.getSelectedFiles();
                for (File selectedFile : selectedFiles) {
                    File sfile=selectedFile;
                    System.out.println("\nSelected file's path= "+sfile.getAbsolutePath());
                }
            }else{
                System.out.println("Not select anything");
            }
        } else if(e.getSource()==s){
            int f=file.showSaveDialog(null);
            if(f==JFileChooser.APPROVE_OPTION){
                System.out.println("Selected file's path= "+file.getSelectedFile().getAbsolutePath());
            }else{
                System.out.println("Not select anything");
            }
        }
    }
}
