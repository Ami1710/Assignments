package week1.day2;

/*
  Create a class called Calculator with the below methods
- add() with 2 int arguments and return the sum
- sub() with 2 doible arguments and return the substraction result
- mu() with 2 double arguments and return the result
- divide() with 2 int arguments and return the sum
*/

public class Calculator {

	public int add(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition: " + a + "+" + b + " = " + sum);
		return sum;
	}
	
	public double subtraction(double a, double b)
	{
		double minus=a-b;
		System.out.println("Subtraction: " + a + "-" + b + " = " + minus);
		return minus;
	}
	
	public double multiplication(double c, double d)
	{
		double mul=c*d;
		System.out.println("Multiplication: " + c + "*" + d + " = " + Math.round(mul));
		return mul;
	}
	
	public int division(int c, int d)
	{
		int div=c/d;
		System.out.println("Division: " + c + "/" + d + " = " + div);
		return div;
	}
	
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.add(5, 5);
		c.subtraction(10.75, 5.50);
		c.multiplication(12, 15.55);
		c.division(25, 25);
	}

}
