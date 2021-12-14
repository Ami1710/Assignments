package week1.day2;

/*
 * Goal: Find the Factorial of a given number
 * 
 * input: 5
 * output: 5*4*3*2*1 = 120
  */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number to find the factorial: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp=1;
		
		System.out.print("The Factorial of "+ num+ " is: ");
		for(int i=num;i>=1;i--)
		{
			temp = temp * i;
			
			if(i>1)
			{
				System.out.print(i + "*");
			}
			else if(i==1)
			{
				System.out.print(i);
			}
			
			
		}
		System.out.print(" = "+temp);
	}

}
