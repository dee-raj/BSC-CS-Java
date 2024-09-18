package gui.layout;
import javax.swing.*;
import java.awt.*;

public class gridBag extends JFrame{
    JButton b1,b2,b3,b4,b5;
    static String mindBlown="Without is with out but with is without out";
    public gridBag(){
        setTitle(mindBlown);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,30,400,400);
        Container con=this.getContentPane();
        
        b1=new JButton("button 1");
        b2=new JButton("button 2");
        b3=new JButton("button 3");
        b4=new JButton("button 4 have extra text");
        b5=new JButton("button 5");

        con.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=gbc.HORIZONTAL;
        // gbc.fill=gbc.BOTH;//fill extra space horizontal & vertical
        // gbc.weighty=0.4;//requests for extra available space vertically
        gbc.weightx=0.6;//requests for extra available space horizontally

        gbc.gridx=0;
        gbc.gridy=0;
        con.add(b1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        con.add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        con.add(b3,gbc);

        gbc.gridwidth=3;
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipady=50;
        con.add(b4,gbc);

        gbc.gridwidth=2;
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.ipady=0;
        gbc.anchor=gbc.PAGE_END;
        gbc.weighty=1;
        con.add(b5,gbc);

        pack();
        setVisible(true);
    }
    public static void main(String draj[]){
        new gridBag();
    }    
}
