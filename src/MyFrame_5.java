import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
public class MyFrame_5 extends JFrame implements ChangeListener 
{
	JLabel jlb3;
	JProgressBar jpb1;
	int value;
	public MyFrame_5()
	{
		JFrame jf1=new JFrame();
		jf1.setTitle("frame标题");//frame标题
		JPanel jpl1=new JPanel();//jf1整体布局
		jpl1.setLayout(new BorderLayout());//边界布局
		JPanel jpl2=new JPanel();//jpl1上方布局
		JPanel jpl3=new JPanel();//jpl1中间布局
		JPanel jpl4=new JPanel();//jpl1左侧布局
		String[] com=new String[2];
		com[0]=new String("组合框1");
		com[1]=new String("组合框2");
		JComboBox jcombob1=new JComboBox(com);//组合框
		jpl2.add(jcombob1);
		JRadioButton jrb1=new JRadioButton("单选按钮1(A)");//单选按钮
		jrb1.setMnemonic('A');//设置热键为A
		jpl2.add(jrb1);
		JRadioButton jrb2=new JRadioButton("单选按钮2(B)");//单选按钮
		jrb2.setMnemonic('B');//设置热键为B
		jpl2.add(jrb2);
		ButtonGroup group1=new ButtonGroup();//为了将单选按钮放到一个组里
		group1.add(jrb1);
		group1.add(jrb2);
		JCheckBox jcheckb1=new JCheckBox("复选框1(C)",true);//复选框1，默认选中
		jcheckb1.setMnemonic('C');//设置热键为C
		JCheckBox jcheckb2=new JCheckBox("复选框2(D)",false);//复选框2，默认不选中
		jcheckb2.setMnemonic('D');//设置热键为D
		jpl2.add(jcheckb1);
		jpl2.add(jcheckb2);
		JTextField jtf1=new JTextField("文本域");//文本域
		jpl2.add(jtf1);
		JPasswordField jpf1=new JPasswordField("密码域");//密码域
		jpl2.add(jpf1);
		JTextArea jta1=new JTextArea("大型文本区域");//大型文本区域
		jta1.setBackground(Color.red);//设置背景色为红色
		jta1.setForeground(Color.green);//设置前景色为绿色
		jpl2.add(jta1);
		JLabel jlb1=new JLabel("标签");//标签
		jlb1.setToolTipText("标签提示");//标签提示
		jpl2.add(jlb1);
		JButton jbt1=new JButton("按钮");//按钮
		jbt1.setToolTipText("按钮提示");//按钮提示
		jpl2.add(jbt1);
		JScrollBar jsb1=new JScrollBar(JScrollBar.HORIZONTAL);//水平滚动条
		JScrollBar jsb2=new JScrollBar(JScrollBar.VERTICAL);//垂直滚动条
		jpl1.add(jsb1,BorderLayout.SOUTH);
		jpl1.add(jsb2,BorderLayout.EAST);
		ImageIcon MyIcon=new ImageIcon("./Image/MyImage.gif");//图片
		JLabel jlb2=new JLabel(MyIcon);
		jpl3.add(jlb2);
		JToolBar jtb1=new JToolBar("工具栏");//工具栏
		JButton jbt2=new JButton("工具栏按钮1");//工具栏按钮1
		JButton jbt3=new JButton("工具栏按钮2");//工具栏按钮2
		jtb1.add(jbt2);
		jtb1.add(jbt3);
		jpl3.add(jtb1);
		jpb1=new JProgressBar();
		jpb1.setOrientation(JProgressBar.HORIZONTAL); //设置进度条方向为水平
		jpb1.setMinimum(0);//设置最小值为0
		jpb1.setMaximum(100);//设置最大值为100
		jpb1.setValue(0);//设置初值为0
		jpb1.setStringPainted(true);//设置进度条上显示进度
		jlb3=new JLabel("",JLabel.CENTER);
		jlb3.setToolTipText ("显示进度信息");
		jpb1.setToolTipText ("进度条");//设置提示信息为“进度条”
		jpb1.addChangeListener(this);//增加时间监听器
		for(int i=1;i<=500000000;i++) 
		{
                    if(i%5000000==0)
                   jpb1.setValue(++value);//改变进度条的值，触发ChangeEvent
	    }
		
		
		
		
		jpl3.add(jpb1);

		
		
		
		
		
		
		jpl1.add(jpl2,BorderLayout.NORTH);
		jpl1.add(jpl3,BorderLayout.CENTER);
		jpl1.add(jpl4,BorderLayout.WEST);
		jf1.add(jpl1);
		jf1.setSize(800,600);//frame大小
		jf1.setLocationRelativeTo(null);//居中显示
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭此frame程序结束
		jf1.setVisible(true);//frame显示
	}
	public void stateChanged(ChangeEvent e)  
	{
             value=jpb1.getValue();
             jlb3.setText ("目前已完成进度："+value+"％"); 
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new MyFrame_5();
	}
}
