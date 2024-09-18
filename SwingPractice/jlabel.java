package gui;
import javax.swing.*;
// import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
public class jlabel{
	public static void main(String[] draj){
		//new jlabel();
		JFrame frame=new JFrame("This is for JLabel swing");
		frame.setBounds(900,300,450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container co=frame.getContentPane();
		
		ImageIcon image=new ImageIcon("classes.png");
		
		JLabel label=new JLabel("Username: ",image,JLabel.CENTER);
		label.setBounds(10,50,400,100);
		//label.setText("Password ");
		
		co.add(label);
		//frame.add(label);
		
		//co.setLayout(null);
		//frame.setLayout(null);
		
		//Font font=new Font("Arial",Font.BOLD,70);
		//Font font=new Font("Arial",Font.ITALIC,70);
		//label.setFont(font);
		
		
		//JLabel lb=new JLabel(image);
		//lb.setBounds(0,0,300,400);
		//lb.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
		//frame.add(lb);
		//co.add(lb);
		
		frame.setVisible(true);
	}
}