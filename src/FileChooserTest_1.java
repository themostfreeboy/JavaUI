import java.awt.*;//Ϊ��ʹ�ò��ֹ�����
import java.awt.event.*;//���������¼�
import javax.annotation.processing.FilerException;
import javax.swing.*;//���µ�GUI���
import java.io.*;//��д�ļ���    
public class FileChooserTest_1 extends JFrame implements ActionListener
{    
    JFrame jf;    
    JButton jbt_open;    
    JPanel jpl;    
    File f;    
    JFileChooser jfc;    
    int flag;    
    public FileChooserTest_1()
    {    
           jf=new JFrame("java");
           jbt_open=new JButton("open");
           jpl=new JPanel();
           jfc=new JFileChooser();
           Container c=jf.getContentPane();
           c.setLayout(new FlowLayout());
           c.add(jpl);
           jpl.add(jbt_open);
           jbt_open.addActionListener(this);//ע�ᰴť�¼�
           jf.setSize(300,300);    
           jf.setVisible(true);    
           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����Ĭ�ϵĹرղ���
           jf.setLocationRelativeTo(null);
     }    
     public void openFile()//���ļ�    
     {
            jfc.setDialogTitle("Open File");//���ô��ļ��Ի���ı���
            try
            {     
                       flag=jfc.showOpenDialog(jf);//������ʾ���ļ��ĶԻ��� 
            }    
            catch(HeadlessException head)
            {     
   
                       System.out.println("Open File Dialog ERROR!");    
            }
            if(flag==JFileChooser.APPROVE_OPTION)//�������ȷ����ť�����ø��ļ�
            {
                       f=jfc.getSelectedFile();//��ø��ļ�    
                       System.out.println("open file:Name:"+f.getName());
                       System.out.println("Path:"+f.getAbsolutePath());
                       ImageIcon Icon=new ImageIcon(f.getAbsolutePath());
                       JLabel jlb=new JLabel(Icon);
                       jf.add(jlb);
					   try 
					   {
						   FileOutputStream fos = new FileOutputStream("D:\\"+f.getName());
	       				   BufferedOutputStream bos=new BufferedOutputStream(fos);
	       				   FileInputStream fis = new FileInputStream(f);
						   BufferedInputStream bis=new BufferedInputStream(fis);
	       				   byte[] buf = new byte[1024];
	       				   int len = 0;
	       				   while((len=bis.read(buf))!=-1)
	       				   {
	       				   	   bos.write(buf,0,len);
	       				   }
	       				   bis.close();
	       				   bos.close();
					   } 
					   catch (IOException e)
					   {
						   // TODO Auto-generated catch block
						   e.printStackTrace();
					    }
       				   JOptionPane.showMessageDialog(null,"�����ļ����");
                       jf.repaint();
                       jf.setVisible(true);
             }
      }
      public void actionPerformed(ActionEvent e)
      {
                    if(e.getSource()==jbt_open)
                           openFile();
      }
      public static void main(String[] args)
      {
              new FileChooserTest_1();
      }
} 
