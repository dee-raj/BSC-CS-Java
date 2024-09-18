package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class actionMenu extends JFrame implements ActionListener{
    Container c;
    JMenuBar menubar;
    JMenu file,edit,open,share;
    JMenuItem undo,redo,cut,copy,paste,new_file,save,select,of,od,ow,exit;
    JTextArea display;

    public actionMenu(){
        setTitle("Action is performed for the menu item.");
        setBounds(200,20,800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);

        menubar=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        open=new JMenu("open");
        share=new JMenu("share");

        undo=new JMenuItem("undo");
        redo=new JMenuItem("redo");
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        
        new_file=new JMenuItem("new file");
        save=new JMenuItem("save");
        select=new JMenuItem("select all");
        exit=new JMenuItem("EXIT ?");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        file.add(new_file);
        file.add(save);
        file.add(share);
        file.add(select);
        share.add(undo);
        share.add(redo);
        
        of=new JMenuItem("Open file");
        od=new JMenuItem("Open folder");
        ow=new JMenuItem("Open workshop");

        open.add(of);
        open.add(od);
        open.add(ow);

        undo.addActionListener(this);
        redo.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        select.addActionListener(this);
        copy.addActionListener(this);


        of.addActionListener(this);
        od.addActionListener(this);
        ow.addActionListener(this);
        new_file.addActionListener(this);
        exit.addActionListener(this);

        file.add(open);//sub-menu
        file.add(exit);
        // menubar.add(open);
        menubar.add(file);
        menubar.add(edit);
        this.setJMenuBar(menubar);

        display=new JTextArea();
        display.setBounds(150,10,390,200);
        display.setFont(new Font("arial",Font.BOLD,19));
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        c.add(display);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==of){
            String str=of.getText();
            display.setText(str);
        }
        if(e.getSource()==od){
            String str=od.getText();
            display.setText(str);
        }
        if(e.getSource()==ow){
            String str=ow.getText();
            display.setText(str);
        }
        if(e.getSource()==new_file){
            String str=new_file.getText();
            display.setText(str);
        }
        if(e.getSource()==exit){
            System.out.println("you exitted successfully!");
            System.exit(0);
        }
        if(e.getSource()==redo){display.setText("redo manually");}
        if(e.getSource()==undo){display.setText("undo manually");}
        if(e.getSource()==select){display.selectAll();}
        if(e.getSource()==copy){display.copy();}
        if(e.getSource()==paste){display.paste();}
        if(e.getSource()==cut){display.cut();}
    }
    
    public static void main(String draj[]){
        new actionMenu();
    }
}
