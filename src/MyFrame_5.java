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
		jf1.setTitle("frame����");//frame����
		JPanel jpl1=new JPanel();//jf1���岼��
		jpl1.setLayout(new BorderLayout());//�߽粼��
		JPanel jpl2=new JPanel();//jpl1�Ϸ�����
		JPanel jpl3=new JPanel();//jpl1�м䲼��
		JPanel jpl4=new JPanel();//jpl1��಼��
		String[] com=new String[2];
		com[0]=new String("��Ͽ�1");
		com[1]=new String("��Ͽ�2");
		JComboBox jcombob1=new JComboBox(com);//��Ͽ�
		jpl2.add(jcombob1);
		JRadioButton jrb1=new JRadioButton("��ѡ��ť1(A)");//��ѡ��ť
		jrb1.setMnemonic('A');//�����ȼ�ΪA
		jpl2.add(jrb1);
		JRadioButton jrb2=new JRadioButton("��ѡ��ť2(B)");//��ѡ��ť
		jrb2.setMnemonic('B');//�����ȼ�ΪB
		jpl2.add(jrb2);
		ButtonGroup group1=new ButtonGroup();//Ϊ�˽���ѡ��ť�ŵ�һ������
		group1.add(jrb1);
		group1.add(jrb2);
		JCheckBox jcheckb1=new JCheckBox("��ѡ��1(C)",true);//��ѡ��1��Ĭ��ѡ��
		jcheckb1.setMnemonic('C');//�����ȼ�ΪC
		JCheckBox jcheckb2=new JCheckBox("��ѡ��2(D)",false);//��ѡ��2��Ĭ�ϲ�ѡ��
		jcheckb2.setMnemonic('D');//�����ȼ�ΪD
		jpl2.add(jcheckb1);
		jpl2.add(jcheckb2);
		JTextField jtf1=new JTextField("�ı���");//�ı���
		jpl2.add(jtf1);
		JPasswordField jpf1=new JPasswordField("������");//������
		jpl2.add(jpf1);
		JTextArea jta1=new JTextArea("�����ı�����");//�����ı�����
		jta1.setBackground(Color.red);//���ñ���ɫΪ��ɫ
		jta1.setForeground(Color.green);//����ǰ��ɫΪ��ɫ
		jpl2.add(jta1);
		JLabel jlb1=new JLabel("��ǩ");//��ǩ
		jlb1.setToolTipText("��ǩ��ʾ");//��ǩ��ʾ
		jpl2.add(jlb1);
		JButton jbt1=new JButton("��ť");//��ť
		jbt1.setToolTipText("��ť��ʾ");//��ť��ʾ
		jpl2.add(jbt1);
		JScrollBar jsb1=new JScrollBar(JScrollBar.HORIZONTAL);//ˮƽ������
		JScrollBar jsb2=new JScrollBar(JScrollBar.VERTICAL);//��ֱ������
		jpl1.add(jsb1,BorderLayout.SOUTH);
		jpl1.add(jsb2,BorderLayout.EAST);
		ImageIcon MyIcon=new ImageIcon("./Image/MyImage.gif");//ͼƬ
		JLabel jlb2=new JLabel(MyIcon);
		jpl3.add(jlb2);
		JToolBar jtb1=new JToolBar("������");//������
		JButton jbt2=new JButton("��������ť1");//��������ť1
		JButton jbt3=new JButton("��������ť2");//��������ť2
		jtb1.add(jbt2);
		jtb1.add(jbt3);
		jpl3.add(jtb1);
		jpb1=new JProgressBar();
		jpb1.setOrientation(JProgressBar.HORIZONTAL); //���ý���������Ϊˮƽ
		jpb1.setMinimum(0);//������СֵΪ0
		jpb1.setMaximum(100);//�������ֵΪ100
		jpb1.setValue(0);//���ó�ֵΪ0
		jpb1.setStringPainted(true);//���ý���������ʾ����
		jlb3=new JLabel("",JLabel.CENTER);
		jlb3.setToolTipText ("��ʾ������Ϣ");
		jpb1.setToolTipText ("������");//������ʾ��ϢΪ����������
		jpb1.addChangeListener(this);//����ʱ�������
		for(int i=1;i<=500000000;i++) 
		{
                    if(i%5000000==0)
                   jpb1.setValue(++value);//�ı��������ֵ������ChangeEvent
	    }
		
		
		
		
		jpl3.add(jpb1);

		
		
		
		
		
		
		jpl1.add(jpl2,BorderLayout.NORTH);
		jpl1.add(jpl3,BorderLayout.CENTER);
		jpl1.add(jpl4,BorderLayout.WEST);
		jf1.add(jpl1);
		jf1.setSize(800,600);//frame��С
		jf1.setLocationRelativeTo(null);//������ʾ
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ�frame�������
		jf1.setVisible(true);//frame��ʾ
	}
	public void stateChanged(ChangeEvent e)  
	{
             value=jpb1.getValue();
             jlb3.setText ("Ŀǰ����ɽ��ȣ�"+value+"��"); 
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new MyFrame_5();
	}
}
