package week1.day2;

/*
 * Goal: Find the sum of digits of a given number
 * 
 * input: 123
 * output: 1+2+3 = 6
 */

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Please enter a digit:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String s = String.valueOf(num);
		String a[]=s.split("");
		int length=a.length;
		int sum=0;
		
		for(int i=length-1;i>=0;i--)
		{
			sum=sum+(num%10);
			num=num/10; 
		}
		
		System.out.println("Sum="+sum);
	}

}
