import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
public class Login_1 extends JFrame implements ActionListener
{
	JFrame jf1;//登陆界面
	JFrame jf2;//登陆成功界面
	JPanel jpl1;//jf1中的整体布局
	JPanel jpl2;//jf1中的上方布局
	JPanel jpl3;//jf1中的中方布局
	JPanel jpl3_temp;//jpl3中的临时布局，用于解决jtf1和jpf1中的text区域被无限放大的问题
	JPanel jpl4;//jf1中的下方布局
	JPanel jpl5;//jf2中的整体布局
	JPanel jpl5_temp;//jpl5中的临时布局，用于解决jlb5区域不居中的问题
	JButton jbt1;//jf1中的确认
	JButton jbt2;//jf1中的重置
	JButton jbt3;//jf1中的退出
	JLabel jlb1;//用户名
	JLabel jlb2;//密码
	JLabel jlb3;//提示输入用户名和密码
	JLabel jlb4;//显示图片
	JLabel jlb5;//显示“我来给你拜年来啦！！！”
	JTextField jtf1;//用户名
	JPasswordField jpf1;//密码
	String[] UserName=new String[100];
	String[] UserPassword=new String[100];
    int TotalOfUser=2;
	JScrollBar jsb1;
	JScrollBar jsb2;
	ImageIcon MyIcon;
	public Login_1()
	{
		UserName[0]=new String("2012211706");
		UserPassword[0]=new String("2012211706");
		UserName[1]=new String("2012211718");
		UserPassword[1]=new String("2012211718");
		jf1=new JFrame();//登陆界面
		jf1.setLayout(new BorderLayout());
		jf2=new JFrame();//登陆成功界面
		jf2.setLayout(new BorderLayout());
		jpl1=new JPanel();//jf1中的整体布局
		jpl1.setLayout(new BorderLayout());
		jpl2=new JPanel();//jf1中的上方布局
		jpl2.setLayout(new FlowLayout());
		jpl3=new JPanel();//jf1中的中方布局
		jpl3.setLayout(new GridLayout(2,2,1,1));
		jpl3_temp=new JPanel();
		jpl3_temp.setLayout(new FlowLayout());
		jpl4=new JPanel();//jf1中的下方布局
		jpl4.setLayout(new FlowLayout());
		jpl5=new JPanel();//jf1中的下方布局
		jpl5.setLayout(new BorderLayout());
		//jf1的设置
		jbt1=new JButton("确认");
		jbt2=new JButton("重置");
		jbt3=new JButton("退出");
		jlb1=new JLabel("用户名：");
		jlb2=new JLabel("密码：");
		jlb3=new JLabel("请输入用户名和密码：");
		jtf1=new JTextField(10);
		//jtf1.setHorizontalAlignment(SwingConstants.CENTER);//居中对齐
		jpf1=new JPasswordField(10);
		//jpf1.setEchoChar("#");//指定一个新的回显字符#
		jpl2.add(jlb3);
		jpl3.add(jlb1);
		jpl3.add(jtf1);
		jpl3.add(jlb2);
		jpl3.add(jpf1);
		jpl3_temp.add(jpl3);
		jpl4.add(jbt1);
		jpl4.add(jbt2);
		jpl4.add(jbt3);
		jpl1.add(jpl2,BorderLayout.NORTH);
		jpl1.add(jpl3_temp,BorderLayout.CENTER);
		jpl1.add(jpl4,BorderLayout.SOUTH);
		jf1.add(jpl1,BorderLayout.CENTER);
		jbt1.addActionListener(this);//对确认按键的监听
		jbt2.addActionListener(this);//对重置按键的监听
		jbt3.addActionListener(this);//对退出按键的监听
		jtf1.addActionListener(this);//对用户名区域回车按键的监听
		jpf1.addActionListener(this);//对密码区域回车按键的监听
		jf1.setTitle("JXL制");
		jf1.setSize(350,170);
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		//jf2的设置
		jsb1=new JScrollBar(JScrollBar.HORIZONTAL);//水平滚动条
		jsb2=new JScrollBar(JScrollBar.VERTICAL);//垂直滚动条
		jpl5.add(jsb1,BorderLayout.SOUTH);
		jpl5.add(jsb2,BorderLayout.EAST);
		MyIcon=new ImageIcon("./Image/MyImage.gif");
		jlb4=new JLabel(MyIcon);
		jlb5=new JLabel("我来给你拜年来啦！！！");
		jpl5.add(jlb4,BorderLayout.CENTER);
		jpl5_temp=new JPanel();
		jpl5_temp.setLayout(new FlowLayout());
		jpl5_temp.add(jlb5);
		jpl5.add(jpl5_temp,BorderLayout.NORTH);
		jf2.add(jpl5);
		jf2.setTitle("JXL制");
		jf2.setSize(350,170);
		jf2.setLocationRelativeTo(null);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbt1||e.getSource()==jtf1||e.getSource()==jpf1)//点击确认键或在用户名区域敲击回车键或在密码区域敲击回车键
		{
			String TempPassword=new String(jpf1.getPassword());
			for(int i=0;i<TotalOfUser;i++)
			{
				if(jtf1.getText().length()==0&&TempPassword.length()==0)//用户名和密码均为空
				{
					jlb3.setText("用户名和密码不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(jtf1.getText().length()==0)//仅用户名为空
				{
					jlb3.setText("用户名不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(TempPassword.length()==0)//仅密吗为空
				{
					jlb3.setText("密码不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(UserName[i].equals(jtf1.getText())&&TempPassword.equals(UserPassword[i]))//用户名和密码输入正确
				{
					jf1.setVisible(false);
					jf2.setVisible(true);
					jf1.repaint();
					jf2.repaint();
					return;
				}
			}
			//用户名和密码输入错误
			jlb3.setText("你输入的用户名或密码有误，请重新输入用户名和密码：");
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
			return;
		}
		else if(e.getSource()==jbt2)//点击重置键
		{
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
		}
		else if(e.getSource()==jbt3)//点击退出键
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Login_1 frame=new Login_1();
	}
}
