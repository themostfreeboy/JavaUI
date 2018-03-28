import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login_2  extends JFrame implements ActionListener
{
	JButton jbt1;
	JButton jbt2;
	JPanel jpl1;
	JPanel jpl2;
	JPanel jpl3;
	JPanel jpl4;
	JTextField jtf1;
	JTextField jtf2;
	JLabel jlb1;
	JLabel jlb2;
	JLabel jlb3;
	JLabel jlb4;
	JComboBox jcb1;
	public Login_2()
	{
		jbt1=new JButton("OK1");
		jbt2=new JButton("OK2");
		jtf1=new JTextField(10);
		jtf2=new JTextField(10);
		jlb1=new JLabel("用户名");
		jlb2=new JLabel("密码");
		jlb3=new JLabel("权限");
		jlb4=new JLabel("登陆界面");
		String[] com=new String[2];
		com[0]=new String("管理员");
		com[1]=new String("普通用户");
		jcb1=new JComboBox(com);
		jpl1=new JPanel();
		jpl1.setLayout(new GridLayout(3,2,10,10));
		jpl2=new JPanel();
		jpl3=new JPanel();
		jpl4=new JPanel();
		jtf1=new JTextField();
		jtf2=new JTextField();
		Container ct=this.getContentPane();
		jpl1.add(jlb1);
		jpl1.add(jtf1);
		jpl1.add(jlb2);
		jpl1.add(jtf2);
		jpl1.add(jlb3);
		jpl1.add(jcb1);
		jpl2.add(jpl1);
		jpl3.add(jlb4);
		jpl4.add(jbt1);
		jpl4.add(jbt2);
		ct.add(jpl2,BorderLayout.CENTER);
		ct.add(jpl3,BorderLayout.NORTH);
		ct.add(jpl4,BorderLayout.SOUTH);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbt1)
		{
			String User=jtf1.getText();
			String Password=jtf2.getText();
			String lim=(String)jcb1.getSelectedItem();
			try 
			{
				FileReader fr=new FileReader("User.txt");
				LineNumberReader lr=new LineNumberReader(fr);
				String temp=(String)lr.readLine();
				StringTokenizer st=new StringTokenizer(temp,",");
				String iuser=(String)st.nextElement();
				String ipassword=(String)st.nextElement();
				String ilim=(String)st.nextElement();
			} 
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Login_2 frame=new Login_2();
		frame.setTitle("JXL制");
		frame.setSize(300,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
