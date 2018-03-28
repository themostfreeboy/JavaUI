import java.awt.*;//为了使用布局管理器
import java.awt.event.*;//用来处理事件
import javax.annotation.processing.FilerException;
import javax.swing.*;//最新的GUI组件
import java.io.*;//读写文件用    
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
           jbt_open.addActionListener(this);//注册按钮事件
           jf.setSize(300,300);    
           jf.setVisible(true);    
           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认的关闭操作
           jf.setLocationRelativeTo(null);
     }    
     public void openFile()//打开文件    
     {
            jfc.setDialogTitle("Open File");//设置打开文件对话框的标题
            try
            {     
                       flag=jfc.showOpenDialog(jf);//这里显示打开文件的对话框 
            }    
            catch(HeadlessException head)
            {     
   
                       System.out.println("Open File Dialog ERROR!");    
            }
            if(flag==JFileChooser.APPROVE_OPTION)//如果按下确定按钮，则获得该文件
            {
                       f=jfc.getSelectedFile();//获得该文件    
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
       				   JOptionPane.showMessageDialog(null,"发送文件完成");
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
