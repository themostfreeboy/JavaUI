import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame_3 extends JFrame implements ActionListener
{
	JFrame jf=this;
	JButton jn1;
	JButton jn2;
	JButton jn3;
	public MyFrame_3()
	{
		jn1=new JButton("OK1");
		jn2=new JButton("OK2");
		jn3=new JButton("OK3");
		Container ct=this.getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jn1);
		ct.add(jn2);
		ct.add(jn3);
		jn1.addActionListener(this);
		jn2.addActionListener(this);
		jn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		jf.setTitle("OK");
		if(e.getSource()==jn1)
		{
			jf.setTitle("OK1");
		}
		else if(e.getSource()==jn2)
		{
			jf.setTitle("OK2");
		}
		else if(e.getSource()==jn3)
		{
			jf.setTitle("OK3");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFrame_3 frame=new MyFrame_3();
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}