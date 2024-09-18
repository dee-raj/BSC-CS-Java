import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shape extends JFrame implements MouseListener{
	JMenu jm1,jm2,jm3;
	JMenuBar jmb;
	ImageIcon i1,i2;
	JLabel li;
	
	public shape(){
		setLayout(new BorderLayout());
		jmb=new JMenuBar();
		jm1=new JMenu("Circle");
		jm2=new JMenu("Rectange");
		jm3=new JMenu("Exit");
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);

		jm1.addMouseListener(this);
		jm2.addMouseListener(this);
		jm3.addMouseListener(this);

		li=new JLabel();
		add(jmb,BorderLayout.NORTH);
		add(li);

		setSize(400,300);
		setTitle("MENU USING SWING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e){
		if (e.getSource()==jm1){
			i1=new ImageIcon("circle.png");
			li.setIcon(i1);
		}
		else if (e.getSource()==jm2){
			i2=new ImageIcon("rect.jpg");
			li.setIcon(i2);
		}
		else if (e.getSource()==jm3){
			System.exit(0);
		}
	}
	@Override
	public void mousePressed(MouseEvent e){}

	@Override
	public void mouseReleased(MouseEvent e){}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e){}


	public static void main(String[] args){
		new shape();
	}

}