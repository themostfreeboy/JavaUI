import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
public class ShowBorderLayoutNewColor extends JFrame
{
	public ShowBorderLayoutNewColor()
	{
		Color c1=new Color(255,0,0);
		Color c2=new Color(0,255,0);
		setLayout(new BorderLayout(5,10));
		JButton jbt1=new JButton("East");
		jbt1.setBackground(c1);
		jbt1.setForeground(c2);
		add(jbt1,BorderLayout.EAST);
		JButton jbt2=new JButton("South");
		jbt2.setBackground(c1);
		jbt2.setForeground(c2);
		add(jbt2,BorderLayout.SOUTH);
		JButton jbt3=new JButton("West");
		jbt3.setBackground(c1);
		jbt3.setForeground(c2);
		add(jbt3,BorderLayout.WEST);
		JButton jbt4=new JButton("North");
		jbt4.setBackground(c1);
		jbt4.setForeground(c2);
		add(jbt4,BorderLayout.NORTH);
		JButton jbt5=new JButton("Center");
		jbt5.setBackground(c1);
		jbt5.setForeground(c2);
		add(jbt5,BorderLayout.CENTER);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ShowBorderLayoutNewColor frame=new ShowBorderLayoutNewColor();
		frame.setTitle("ShowBorderLayoutNewColor");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}