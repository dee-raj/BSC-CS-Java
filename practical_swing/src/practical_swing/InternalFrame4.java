package practical_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InternalFrame4 implements ActionListener, ItemListener{
    public static void main(String draj[]){
        new InternalFrame4();
    }
    JFrame jf;
    JButton bt;
    JLabel l,ll;
    JRadioButton rb;
    JComboBox cmb;
    JCheckBox chb;
    String msg,title="Dialogs...!";
    int type=JOptionPane.PLAIN_MESSAGE;
    JDesktopPane dp;
    JInternalFrame f1,f2,f3,f4;
    
    public InternalFrame4(){
        bt=new JButton("Button frame");
        bt.setBounds(10,5,110,30);
        l=new JLabel("This is a label in f1");
        l.setBounds(1,1,25,50);
        ll=new JLabel("This is a label in f2");
        ll.setBounds(7,0,50,5);
        
        chb=new JCheckBox("CheckBOx frame");
        rb=new JRadioButton("RadioBitton Frame");

                
        cmb=new JComboBox();
        cmb.addItem("select options...");
        cmb.addItem("Operating system");
        cmb.addItem("linear algebra");
        cmb.addItem("web");
        cmb.addItem("java");
        cmb.addItem("dbms");
        cmb.addItem("Data structure");
        cmb.setBounds(30,5,180,40);
        
        jf=new JFrame("The main frame for internal frams");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(300,100,920,350);
        jf.setVisible(true);
          
        f1=new JInternalFrame("the first frame",true,true,true,true);
        f1.setBounds(5,50,210,150);
        f1.add(bt);
        f1.add(l);
        bt.addActionListener(this);
        f1.setVisible(true);
        
        f2=new JInternalFrame("the second frame",true,true,true,true);
        f2.setBounds(220,50,220,150);
        f2.add(cmb);
        f2.add(ll);
        f2.setVisible(true);
        
        f3=new JInternalFrame("the third frame",true,true,true,true);
        f3.add(rb);
        rb.addActionListener(this);
        f3.setBounds(445,50,220,150);
        f3.setVisible(true);
        
        f4=new JInternalFrame("the fourth frame",true,true,true,true);
        f4.setBounds(670,50,220,150);
        f4.setVisible(true);
        f4.add(chb);
        
        dp=new JDesktopPane();
        dp.add(f1);
        dp.add(f2);
        dp.add(f3);
        dp.add(f4);
        jf.add(dp);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bt){
//            msg=bt.getText();
              msg="Button is pressed";
        } else if(e.getSource()==rb){
//            msg=e.getActionCommand();
            msg="RadioButton is clicked";
        }
        JOptionPane.showMessageDialog(null, msg,title,type);        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==cmb){
            ll.setText(cmb.getSelectedItem()+"selected");
//              msg="Item checked";
        }else if (e.getSource()==chb){
            if (chb.isSelected()==true){
//            msg=chb.getText();
            msg=" CheckBox Item checked";
        }}
        JOptionPane.showMessageDialog(null,msg,title,type);
    }
}