import javax.swing.*;
import java.awt.GridLayout;
//import java.awt.Color;
public class ShowGridLayout extends JFrame
{
	public ShowGridLayout()
	{
		setLayout(new GridLayout(3,2,5,5));
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ShowGridLayout frame=new ShowGridLayout();
		frame.setTitle("ShowGridLayout");
		frame.setSize(200,125);
		frame.setLocationRelativeTo(null);
		//Color c1=new Color(255,0,0);
		//Color c2=new Color(0,255,0);
		//frame.setBackground(c1);
		//frame.setForeground(c2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
