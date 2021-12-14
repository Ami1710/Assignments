package week1.day2;

/*
 * Goal: To find whether a number is an Armstrong number or not
 * 
 * inputs: 153
 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
 */

public class Armstrong {

	public static void main(String[] args) 
	{
		
		 		int num = 1634;
		 		int t = num;
		 		String snum = String.valueOf(num);
		 		String a[] = snum.split("");
		 		int power = a.length;
		 		
		 		System.out.println("Number = "+num);
		 				 		
		 		int sum=0;
		 		int mul=1;
		 		System.out.print("Calculation =");
		 		
		 		do
		 		
		 		{

		 		    int temp = num % 10;
		 		    sum=sum+mul;
		 		    num = num / 10;
		 		    mul=1;
		 		    for(int i=1;i<=power;i++)
		 		    {
		 		    	mul=mul*temp;
		 		    }
		 		    if (num == 0)
		 		    { System.out.println(mul);	    }
		 		    
		 		    else 
		 		    { System.out.print(mul+ " + "); }
		 		    
			} while (num > 0) ; 
		 		System.out.println();
		 		System.out.println("Output = "+sum);

	
		if(t==sum)
		{
			System.out.println("It is an armstrong number.");
		}
		else
		{
			System.out.println("It is not an armstrong number.");
		}
	}
		 		
}



