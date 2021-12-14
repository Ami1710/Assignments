package week1.day2;

public class Sum {

	
	
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum of two numbers " + a+"+"+b+"="+c);
		return c;
	}
	public static void main(String[] args) 
	{
		Sum add = new Sum();
		add.sum(20,30);

	}

}
