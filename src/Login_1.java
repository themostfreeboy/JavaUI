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
	JFrame jf1;//��½����
	JFrame jf2;//��½�ɹ�����
	JPanel jpl1;//jf1�е����岼��
	JPanel jpl2;//jf1�е��Ϸ�����
	JPanel jpl3;//jf1�е��з�����
	JPanel jpl3_temp;//jpl3�е���ʱ���֣����ڽ��jtf1��jpf1�е�text�������޷Ŵ������
	JPanel jpl4;//jf1�е��·�����
	JPanel jpl5;//jf2�е����岼��
	JPanel jpl5_temp;//jpl5�е���ʱ���֣����ڽ��jlb5���򲻾��е�����
	JButton jbt1;//jf1�е�ȷ��
	JButton jbt2;//jf1�е�����
	JButton jbt3;//jf1�е��˳�
	JLabel jlb1;//�û���
	JLabel jlb2;//����
	JLabel jlb3;//��ʾ�����û���������
	JLabel jlb4;//��ʾͼƬ
	JLabel jlb5;//��ʾ�������������������������
	JTextField jtf1;//�û���
	JPasswordField jpf1;//����
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
		jf1=new JFrame();//��½����
		jf1.setLayout(new BorderLayout());
		jf2=new JFrame();//��½�ɹ�����
		jf2.setLayout(new BorderLayout());
		jpl1=new JPanel();//jf1�е����岼��
		jpl1.setLayout(new BorderLayout());
		jpl2=new JPanel();//jf1�е��Ϸ�����
		jpl2.setLayout(new FlowLayout());
		jpl3=new JPanel();//jf1�е��з�����
		jpl3.setLayout(new GridLayout(2,2,1,1));
		jpl3_temp=new JPanel();
		jpl3_temp.setLayout(new FlowLayout());
		jpl4=new JPanel();//jf1�е��·�����
		jpl4.setLayout(new FlowLayout());
		jpl5=new JPanel();//jf1�е��·�����
		jpl5.setLayout(new BorderLayout());
		//jf1������
		jbt1=new JButton("ȷ��");
		jbt2=new JButton("����");
		jbt3=new JButton("�˳�");
		jlb1=new JLabel("�û�����");
		jlb2=new JLabel("���룺");
		jlb3=new JLabel("�������û��������룺");
		jtf1=new JTextField(10);
		//jtf1.setHorizontalAlignment(SwingConstants.CENTER);//���ж���
		jpf1=new JPasswordField(10);
		//jpf1.setEchoChar("#");//ָ��һ���µĻ����ַ�#
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
		jbt1.addActionListener(this);//��ȷ�ϰ����ļ���
		jbt2.addActionListener(this);//�����ð����ļ���
		jbt3.addActionListener(this);//���˳������ļ���
		jtf1.addActionListener(this);//���û�������س������ļ���
		jpf1.addActionListener(this);//����������س������ļ���
		jf1.setTitle("JXL��");
		jf1.setSize(350,170);
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		//jf2������
		jsb1=new JScrollBar(JScrollBar.HORIZONTAL);//ˮƽ������
		jsb2=new JScrollBar(JScrollBar.VERTICAL);//��ֱ������
		jpl5.add(jsb1,BorderLayout.SOUTH);
		jpl5.add(jsb2,BorderLayout.EAST);
		MyIcon=new ImageIcon("./Image/MyImage.gif");
		jlb4=new JLabel(MyIcon);
		jlb5=new JLabel("���������������������");
		jpl5.add(jlb4,BorderLayout.CENTER);
		jpl5_temp=new JPanel();
		jpl5_temp.setLayout(new FlowLayout());
		jpl5_temp.add(jlb5);
		jpl5.add(jpl5_temp,BorderLayout.NORTH);
		jf2.add(jpl5);
		jf2.setTitle("JXL��");
		jf2.setSize(350,170);
		jf2.setLocationRelativeTo(null);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbt1||e.getSource()==jtf1||e.getSource()==jpf1)//���ȷ�ϼ������û��������û��س����������������û��س���
		{
			String TempPassword=new String(jpf1.getPassword());
			for(int i=0;i<TotalOfUser;i++)
			{
				if(jtf1.getText().length()==0&&TempPassword.length()==0)//�û����������Ϊ��
				{
					jlb3.setText("�û��������벻��Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(jtf1.getText().length()==0)//���û���Ϊ��
				{
					jlb3.setText("�û�������Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(TempPassword.length()==0)//������Ϊ��
				{
					jlb3.setText("���벻��Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(UserName[i].equals(jtf1.getText())&&TempPassword.equals(UserPassword[i]))//�û���������������ȷ
				{
					jf1.setVisible(false);
					jf2.setVisible(true);
					jf1.repaint();
					jf2.repaint();
					return;
				}
			}
			//�û����������������
			jlb3.setText("��������û������������������������û��������룺");
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
			return;
		}
		else if(e.getSource()==jbt2)//������ü�
		{
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
		}
		else if(e.getSource()==jbt3)//����˳���
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
