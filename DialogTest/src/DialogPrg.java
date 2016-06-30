// Charles Carper
// 3.4.2015
// Chapter 25 – Lab 2
// Java swing GUI widget toolkit package provides a set of GUI components that
// work across all platforms. 

import javax.swing.*;
public class DialogPrg 
{
	public static void main(String[] args) 
	{
		String UserName = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello " + UserName, "Hi",JOptionPane.INFORMATION_MESSAGE);
		
		int answer = JOptionPane.showConfirmDialog(null, "Would you like to hear a joke " + UserName + "?", "A Yes or No Question", JOptionPane.YES_NO_OPTION);
		
		JOptionPane.showMessageDialog(null,"answer = " + answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
		if (answer == 0 ) 
		{
			JOptionPane.showMessageDialog(null,"There are 10 types of people in the world....", "...", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Those that understand binary and those that don't!", "Ha!", JOptionPane.WARNING_MESSAGE);
		} else 
		{
			JOptionPane.showMessageDialog(null,"Okay", ":-(",JOptionPane.ERROR_MESSAGE);
		}
	}
}
