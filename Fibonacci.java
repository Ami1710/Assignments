package week1.day2;

/*
 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 */

public class Fibonacci {

	public static void main(String[] args) {
				
				int range = 8;
				int n1=0;
				int n2=1;
				int n3;
				System.out.print("Fibonacci Series for "+range+" digits = "+n1+" "+n2);
				
				for(int i=3;i<=range;i++)
				{	
					n3=n1+n2;
					System.out.print(" "+n3);
					n1=n2;
					n2=n3;
				}
	}

}
