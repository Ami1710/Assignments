package week1.day2;

import java.util.Scanner;

/*
Goal: Find the odd numbers in the specific range of numbers
* 
* Input: range of numbers (starting to end) [1 to 20]
* Output: Printing only odd numbers [1,3,5,7,9...,19]
		*/
		
public class OddNumbers {

	public static void main(String[] args) {

		System.out.println("Please enter the number to check if its odd or even:");
		Scanner input= new Scanner(System.in);
		int num = input.nextInt();
		
		if(num%2==0)
		{	
			System.out.println(num+" is an even number."); 
		}
		else
		{	
			System.out.println(num+" is an odd number.");
		}
	}
}
