package showInputDialog;
import javax.swing.*;
//import java.net.*;

public class showInputDialog 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("InputDialog Example #1");
		
		String name = JOptionPane.showInputDialog(frame,"What's your name?");
		
		System.out.printf("The user's name is '%s'.\n", name);
		
		// hello test program
		//system.out.println("hello world!");
		JOptionPane.showMessageDialog(null,"Hello world!","Hi", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	
}
