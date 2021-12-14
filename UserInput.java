package week1.day2;

import java.util.Scanner;

/* Goal: Perform calculation based on the user input operations
* 
* inputs: 2,3 and "add"
* output: added value: 5*/

public class UserInput {

	public static void main(String[] args) {

		System.out.print("Please add number1: ");
		Scanner i1= new Scanner(System.in);
		int n1=i1.nextInt();
		
		System.out.println();
		System.out.print("Please add number2: ");
		Scanner i2= new Scanner(System.in);
		int n2=i2.nextInt();

		System.out.println();
		
		 
		System.out.print("Please select one of the operation- Add, Sub, Mul, Div : ");
		Scanner i3= new Scanner(System.in);
		String op=i3.next();
		
		int temp;
		
		if(op.equalsIgnoreCase("Add")) 
		{
			temp=n1+n2;
			System.out.println(n1+" + "+n2+" = "+temp);
		}
		else if(op.equalsIgnoreCase("Sub"))
		{
			temp=n1-n2;
			System.out.println(n1+" - "+n2+" = "+temp);
		}
		else if(op.equalsIgnoreCase("mul"))
		{
			temp=n1*n2;
			System.out.println(n1+" * "+n2+" = "+temp);
		}
		else if(op.equalsIgnoreCase("div"))
		{
			temp=n1/n2;
			System.out.println(n1+" / "+n2+" = "+temp);
		}
		else
		{
			System.out.print("Wrong input.");
		}
		
	}

}
