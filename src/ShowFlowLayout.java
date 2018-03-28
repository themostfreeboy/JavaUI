import javax.swing.*;
import java.awt.FlowLayout;
//import java.awt.Color;
public class ShowFlowLayout extends JFrame
{
	public ShowFlowLayout()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
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
		ShowFlowLayout frame=new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		//Color c1=new Color(255,0,0);
		//Color c2=new Color(0,255,0);
		//frame.setBackground(c1);
		//frame.setForeground(c2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
