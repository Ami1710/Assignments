package week1.day1;

public class Mobile {

	public void makeCall()
	{
		System.out.println("Make a call");
	}
	
	public void sendMsg()
	{
		System.out.println("Send Message");
	}
	
	public static void main(String[] args) 
	{
		Mobile M = new Mobile();
		M.makeCall();
		M.sendMsg();

	}

}
