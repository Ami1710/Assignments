package week1.day2;

/* Find the missing number from the list of array*/
/* Programmed for missing number fromm 1-10*/

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {5,2,6,3,7,4,10,9,8};
		int n = a.length +1;
		int sum = (n*(n+1))/2;
		
		for (int i=0;i<a.length;i++)
		{
			sum=sum-a[i];
		}
		
		System.out.println("The missing number is "+sum);
		

	}

}
