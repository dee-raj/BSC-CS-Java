package practical_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tappane_pract implements ActionListener, ItemListener {
    int type=JOptionPane.PLAIN_MESSAGE;
    JCheckBox cb1,cb2,cb3,cb4;
    JRadioButton rb1,rb2,rb3;
    JComboBox comb;
    JLabel la;
    
    public Tappane_pract(){
    la=new JLabel("This is label object.");
    
    JPanel jp=new JPanel();
    cb1=new JCheckBox("C");
    cb2=new JCheckBox("python");
    cb3=new JCheckBox("Java");
    cb4=new JCheckBox("PHP");
    
    cb1.addItemListener(this);
    cb2.addItemListener(this);
    cb3.addItemListener(this);
    cb4.addItemListener(this);
    
    jp.add(cb1);
    jp.add(cb2);
    jp.add(cb3);
    jp.add(cb4);
    
    
    JPanel jp2 =new JPanel();
    rb1=new JRadioButton("Windows");
    rb2=new JRadioButton("Linux");
    rb3=new JRadioButton("MacOS");
    
    rb1.addActionListener(this);
    rb2.addActionListener(this);
    rb3.addActionListener(this);
    
    jp2.add(rb1);
    jp2.add(rb2);
    jp2.add(rb3);
    
    ButtonGroup bg=new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);

    JPanel jp3=new JPanel();
    comb=new JComboBox();
    comb.addItem("select subject");
    comb.addItem("phy");
    comb.addItem("chem");
    comb.addItem("math");
    comb.addItem("bio");
    
    jp3.add(la);
    jp3.add(comb);
    
    JFrame jf=new JFrame("TapPane practical");
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setBounds(700,300,500,400);
    
    JTabbedPane jtp=new JTabbedPane();
    jtp.addTab("Subject",jp3);
    jtp.addTab("Language",jp2);
    jtp.addTab("OS",jp);
    jtp.setTabPlacement(JTabbedPane.LEFT);
    
    jf.add(jtp);
    }
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    String msg="";
    if(e.getSource()==cb1){
        if(cb1.isSelected()==true){
            msg="Language C selected";
            JOptionPane.showMessageDialog(null, msg);
        }
        if (e.getSource()==cb1){
        la.setText((String)e.getItem());
        }
    }}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public static void main(String draj[]){
        new Tappane_pract();
    }
}