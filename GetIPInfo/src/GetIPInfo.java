// Charles Carper
// 3.4.2015
// Chapter 25 – Lab 1
// Get IP Address 
import java.net.*;
public class GetIPInfo
{
	public static void main(String[] args) throws Exception, UnknownHostException
	{
		InetAddress local = InetAddress.getLocalHost();
		InetAddress mysite = InetAddress.getByName("www.dtcc.edu");
		InetAddress addr = InetAddress.getByName ("138.123.178.1");
		System.out.println(local);
		System.out.println(mysite);
		System.out.println(addr);
		System.out.println("\nThe local host name is: " + local.getHostName());
		System.out.println("The IP address for www.dtcc.edu is: " + mysite.getHostAddress());
		System.out.println("The host name for 138.123.178.1 is: " + addr.getHostName());
	}
}