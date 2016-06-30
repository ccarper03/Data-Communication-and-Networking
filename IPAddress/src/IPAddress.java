import java.net.*;

public class IPAddress {

	public static void main(String[] args) throws Exception, UnknownHostException
	{
	InetAddress mysite = InetAddress.getByName("www.dtcc.edu");
	InetAddress local = InetAddress.getLocalHost();
	InetAddress addr = InetAddress.getByName("138.123.178.1");
	System.out.println(mysite);
	System.out.println(local);
	System.out.println(addr);
	System.out.println(mysite.getHostAddress());
	System.out.println(local.getHostName());
	System.out.println(mysite.getHostName());
	}//End of class

}
