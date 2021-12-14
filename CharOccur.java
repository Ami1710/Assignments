package week1.day2;
/* Check number of occurrences of a char (eg 'e') in a String
		
			String str = "welcome to chennai";*/
//Cant check after space

import java.util.Scanner;
import java.util.stream.IntStream;


public class CharOccur {

	public static void main(String[] args) {
		
		System.out.println("Please enter a String: ");
		Scanner input = new Scanner(System.in);
		String a=input.next();
		char c[]=a.toCharArray();				
	//	String ar[]= a.split("");
		
		
		System.out.println("Please enter the character to find the  number of occurances: ");
		Scanner i = new Scanner(System.in);
		String fs=i.next();
		char f=fs.charAt(0);
		int count = 0;
		
		for(int k=0;k<c.length;k++)
		{
			if(c[k]==f)
			{
				count=count+1;
			}
		}
	
		System.out.println("Total number of occurances of " + f+ " is: "+count);
	}

}
