import javax.swing.*;
import java.awt.BorderLayout;
//import java.awt.Color;
public class ShowBorderLayout extends JFrame
{
	public ShowBorderLayout()
	{
		setLayout(new BorderLayout(5,10));
		add(new JButton("East"),BorderLayout.EAST);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("Center"),BorderLayout.CENTER);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ShowBorderLayout frame=new ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		//Color c1=new Color(255,0,0);
		//Color c2=new Color(0,255,0);
		//frame.setBackground(c1);
		//frame.setForeground(c2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}