import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MyFrame_4 extends JFrame implements ActionListener
{
	JFrame jf=this;
	JButton jn1;
	JButton jn2;
	JButton jn3;
	JButton jn4;
	JPanel jp1;
	public MyFrame_4()
	{
		jp1=new JPanel();
		jp1.setLayout(new BorderLayout());
		jn1=new JButton("OK1");
		jn2=new JButton("OK2");
		jn3=new JButton("OK3");
		jn4=new JButton("Test");
		Container ct=this.getContentPane();
		ct.setLayout(new FlowLayout());
		jp1.add(jn1,BorderLayout.NORTH);
		jp1.add(jn2,BorderLayout.SOUTH);
		jp1.add(jn3,BorderLayout.WEST);
		jp1.add(jn4,BorderLayout.EAST);
		ct.add(jp1);
		jn1.addActionListener(this);
		jn2.addActionListener(this);
		jn3.addActionListener(this);
		jn4.addActionListener(this);
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
		else if(e.getSource()==jn4)
		{
			jf.setTitle("Test");
			ImageIcon MyIcon=new ImageIcon("./Image/MyImage.gif");
			JLabel jbl=new JLabel(MyIcon);
			JPanel jp2=new JPanel();
			jp2.setLayout(new BorderLayout());
			jp2.add(jbl,BorderLayout.CENTER);
			jf.add(jp2);
			jf.setVisible(true);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFrame_4 frame=new MyFrame_4();
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}