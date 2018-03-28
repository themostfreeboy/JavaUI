import javax.swing.*;
import java.awt.*;
//import com.sun.xml.internal.ws.api.server.Container;
public class MyFrame
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Test Frame");
		//Dimension frameSize=frame.getSize();
		//Tookit.getDefaultTookit().getScreenZize();
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		//frame.setTitle("Hello");
		//Container container=getContentPane();
		//container.setLayout(new FlowLayout());
		Color c1=new Color(255,128,0);
		Color c2=new Color(128,255,0);
		frame.setBackground(c1);
		frame.setForeground(c2);
		frame.setVisible(true);
	}
}
