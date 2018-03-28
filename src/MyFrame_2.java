import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
public class MyFrame_2 extends JFrame
{
	final JFrame jf=this;
	public MyFrame_2()
	{
		JButton jn1=new JButton("OK1");
		JButton jn2=new JButton("OK2");
		JButton jn3=new JButton("OK3");
		JButton jn4=new JButton("OK4");
		final Container ct=this.getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jn1);
		ct.add(jn2);
		ct.add(jn3);
		ct.add(jn4);
		jn1.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						jf.setTitle("OK1");
					}
				}
		);
		jn2.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						jf.setTitle("OK2");
					}
				}
		);
		jn3.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						jf.setTitle("OK3");
					}
				}
		);
		jn4.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						jf.setTitle("OK4");
					}
				}
		);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFrame_2 frame=new MyFrame_2();
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
