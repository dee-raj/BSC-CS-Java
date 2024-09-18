package gui;
import javax.swing.*;
import java.awt.*;
public class jtextfield{
	public static void main(String[] draj){
		//new jlabel();
		JFrame frame=new JFrame("This frame is for JTextField swing");
		frame.setVisible(true);
		frame.setBounds(900,300,450,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Container co=frame.getContentPane();
		co.setLayout(null);
		
		JTextField textfield=new JTextField();
		textfield.setBounds(10,20,130,40);
		co.add(textfield);
		textfield.setText("Write here...");
		Font font = new Font("Arial",Font.ITALIC,20);
		textfield.setFont(font);
		
		textfield.setForeground(Color.RED);
		textfield.setBackground(Color.GREEN);
		
		//textfield.setEditable(true);//default value
		textfield.setEditable(false);
	}
}