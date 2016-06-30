// Charles Carper
// 3.4.2015
// Chapter 25 – Lab 4
// Java swing GUI widget toolkit package provides a set of GUI components that
// work across all platforms. 

import java.net.*;
import javax.swing.JOptionPane;

public class Lab4 {

	public static void main(String[] args) throws Exception, UnknownHostException
	{
		String url = JOptionPane.showInputDialog("Enter an IP Address?");
		InetAddress addr = InetAddress.getByName (url);
		JOptionPane.showMessageDialog(null, addr.getHostName(), "Hi",JOptionPane.INFORMATION_MESSAGE);
	}

}
