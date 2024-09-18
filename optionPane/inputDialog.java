/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class inputDialog{
    public static void main(String[] draj){
        JFrame jf=new JFrame();
        jf.setTitle("JOptionPane for input,message,confirm");
        jf.setBounds(200,10,500,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        
        JButton btn=new JButton("to get input");
        
        JButton plan=new JButton("to show plan msg dialog");
        JButton info=new JButton("to show information msg dialog");
        JButton ques=new JButton("to show question msg dialog");
        JButton error=new JButton("to show error msg dialog");
        JButton warr=new JButton("to show warrning msg dialog"); 
        
        JButton conform=new JButton("conform to exit");

        

        jf.add(btn);
        
        jf.add(plan);
        jf.add(info);
        jf.add(ques);
        jf.add(warr);
        jf.add(error);
        
        jf.add(conform);
        



        btn.addActionListener((ActionEvent e) -> {
            String name = JOptionPane.showInputDialog("Enter your name: ");
            if(name.length()>0){
                System.out.println("Name: "+name);
            }
        });
        plan.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(jf, "Hello there!", "Plane msg", JOptionPane.PLAIN_MESSAGE);
        });
        info.addActionListener((ActionEvent e)->{
        JOptionPane.showMessageDialog(jf, "Hello there!", "information msg", JOptionPane.INFORMATION_MESSAGE);
        });
        ques.addActionListener((ActionEvent e)->{
        JOptionPane.showMessageDialog(jf, "Hello there!", "question msg", JOptionPane.QUESTION_MESSAGE);
        });
        error.addActionListener((ActionEvent e)->{
        JOptionPane.showMessageDialog(jf, "Hello there!", "error msg", JOptionPane.ERROR_MESSAGE);
        });
        warr.addActionListener((ActionEvent e)->{
        JOptionPane.showMessageDialog(jf, "Hello there!", "warning msg", JOptionPane.WARNING_MESSAGE);
        });

        conform.addActionListener((ActionEvent e)->{
            int check =JOptionPane.showConfirmDialog(jf, "Do you want to exit?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            switch (check) {
                case JOptionPane.YES_OPTION:
                    System.out.println("YES_OPTION is selected.");
                    System.exit(0);
                case JOptionPane.NO_OPTION:
                    System.out.println("NO_OPTION is selected.");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    System.out.println("CANCEL_OPTION is selected.");
                    break;
                    
            }
        });
        jf.setVisible(true);       
    }
}
