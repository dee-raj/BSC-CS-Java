package gui;
import javax.swing.*;
import java.awt.*;
public class jframe{
    String heSaid="it is better to walk alone than to walk with a fool";
	public static void main(String[] draj){
		//new jframe();
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(400,300);
		//frame.setLocation(800,100);
		frame.setBounds(950,350,400,220);
		frame.setTitle("This frame created for jframe swing");
		
		ImageIcon icon=new ImageIcon("Pascal.png");
		frame.setIconImage(icon.getImage());
		
		Container co=frame.getContentPane();
		Color clr=new Color(164,65,64);
		co.setBackground(clr);
		//co.setBackground(Color.GREEN);
		
		frame.setResizable(false);
	}	
}