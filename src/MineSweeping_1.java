import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MineSweeping_1 extends JFrame implements ActionListener
{
	JFrame jf;
	JPanel jpl1;//整体布局
	JPanel jpl2;//上方布局
	JPanel jpl3;//下方布局
	JButton[] jbt=new JButton[64];
	int[][] data=new int[10][10];
	int[][] datashow=new int[10][10];//1表示已显示出来，0表示未显示出来
	public MineSweeping_1()
	{
		int i,j,k,l;
		jf=new JFrame();
		jpl1=new JPanel();//整体布局
		jpl1.setLayout(new BorderLayout());
		jpl2=new JPanel();//上方布局
		jpl2.setLayout(new GridLayout(8,8,2,2));
		jpl3=new JPanel();//下方布局
		jpl3.setLayout(new BorderLayout());
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				data[i][j]=0;
				datashow[i][j]=0;
			}
		}
		double TempNumber_1;
		for(int n=0;n<10;)
		{
			TempNumber_1=Math.random()*10;
			i=(int)(TempNumber_1);
			TempNumber_1=Math.random()*10;
			j=(int)(TempNumber_1);
			if(data[i][j]!=-1&&i!=0&&j!=0&&i!=9&&j!=9)
			{
				data[i][j]=-1;
				n++;
			}
		}
		for(i=1;i<9;i++)
		{
			for(j=1;j<9;j++)
			{
				int TempNumber_2=0;
				if(data[i][j]!=-1)
				{
					for(k=i-1;k<=i+1;k++)
					{
						for(l=j-1;l<=j+1;l++)
						{
							if(data[k][l]==-1)
							{
								TempNumber_2++;
							}
						}
					}
					data[i][j]=TempNumber_2;
				}
			}
		}
		for(i=0;i<64;i++)
		{
			jbt[i]=new JButton();
			jpl2.add(jbt[i]);
		}
		jpl1.add(jpl2,BorderLayout.CENTER);
		jf.add(jpl1);
		for(i=0;i<64;i++)
		{
			jbt[i].addActionListener(this);
		}
		jf.setTitle("这是JXL制的扫雷游戏");
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int i,j,k;
		String TempString=new String();
		for(i=0;i<64;i++)
		{
			if(e.getSource()==jbt[i])
			{
				jf.setTitle("Button"+i);
				int row=i/8+1;//行
				int column=i-(row-1)*8+1;//列
				TempString="";
				if(data[row][column]==-1)
				{
					TempString+="雷";
				}
				else
				{
					TempString+=data[row][column];
				}
				jbt[i].setText(TempString);
				jbt[i].setEnabled(false);
				if(data[row][column]==0)
				{
					//
				}
				jf.repaint();
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		MineSweeping_1 frame=new MineSweeping_1();
		// TODO Auto-generated method stub
		
	}
}
