// Charles Carper
// 3.4.2015
// Chapter 25 � Lab 4
// Java swing GUI widget toolkit package provides a set of GUI components that
// work across all platforms. 

import java.net.*;
import javax.swing.JOptionPane;
public class Lab3 {

	public static void main(String[] args)  throws Exception, UnknownHostException
	{
		String url = JOptionPane.showInputDialog("What is your URL Address?");
		InetAddress mysite = InetAddress.getByName(url);
		JOptionPane.showMessageDialog(null,"Hello " + mysite, "Hi",JOptionPane.INFORMATION_MESSAGE);
	}

}
