package week1.day2;

/* Find the prime numbers between 1 to 20.
 * PS. Program not working well.. Showing 9 and 15 !!!
 */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Prime_number {

	public static void main(String[] args) {
		
		List<Integer> primeNums = new ArrayList<>();
		System.out.println("To find the Prime numbers please enter the start number:");
		Scanner input1 = new Scanner(System.in);
		int start = input1.nextInt();
		
		
		System.out.println("To find the Prime number please enter the end number:");
		Scanner input2 = new Scanner(System.in);
		int end = input2.nextInt();
		
		for(int num=start; num<=end;num++)
		{
			boolean isPrime = true;
			for(int factor=2; factor<=num/2; factor++)
			{
			
				if(num%factor==0)
				isPrime = false;
					break;
			}
			if(isPrime==true && num!=1)
			{
				primeNums.add(num);	
			}
		}
		System.out.println("Prime numbers between " + start + " and "+ end + " are:" + primeNums);
	}
}
