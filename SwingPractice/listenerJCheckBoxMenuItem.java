package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import gui.menubar;

public class listenerJCheckBoxMenuItem extends JFrame implements ItemListener {
    JMenuBar menubar;
    JMenu file,help;
    JCheckBoxMenuItem print,newFile,open,save,feedback,tips,report,about,update;
    JTextArea field;
    public listenerJCheckBoxMenuItem(){
        // Container c=this.getContentPane();
        // c.setLayout(null);
        this.setLayout(null);

        file=new JMenu("File");
        print=new JCheckBoxMenuItem("print");
        newFile=new JCheckBoxMenuItem("newFile");
        open=new JCheckBoxMenuItem("open");
        save=new JCheckBoxMenuItem("save");
        file.add(print);
        file.add(newFile);
        file.add(open);
        file.add(save);
        
        help=new JMenu("Help!");
        feedback=new JCheckBoxMenuItem("feedback");
        tips=new JCheckBoxMenuItem("tips");
        report=new JCheckBoxMenuItem("report");
        about=new JCheckBoxMenuItem("about");
        update=new JCheckBoxMenuItem("update");
        help.add(feedback);
        help.add(tips);
        help.add(report);
        help.add(about);
        help.add(update);
        
        menubar=new JMenuBar();
        menubar.add(file);
        menubar.add(help);

        this.setJMenuBar(menubar);

        field=new JTextArea();
        field.setBounds(200,20,400,300);
        field.setLineWrap(true);
        field.setWrapStyleWord(true);
        field.setFont(new Font("",Font.BOLD,18));
        this.add(field);
        // c.add(field);

        feedback.addItemListener(this);
        save.addItemListener(this);
        print.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==feedback){
            field.setText("please, fill the feedback...");
        }
        if(ie.getSource()==save){
            field.setText("Content SAVED successfully.");
        }
        if(ie.getSource()==print){
            field.setText("printing the document...\nin 3...2..1.");
        }
        // this.setBackground(Color.MAGENTA);
    }
    public static void main(String draj[]){
        JFrame jf=new listenerJCheckBoxMenuItem();
        jf.setTitle("Itemlistener JCheckBoxMenuItem");
        jf.setBounds(500,50,700,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jf.setVisible(true);
    }
}