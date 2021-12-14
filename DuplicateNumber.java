package week1.day2;

public class DuplicateNumber {

	public static void main(String[] args) {
	
		int a[] = {5,15,28,10,28};
				
		System.out.print("The original array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
		
		System.out.println();
		System.out.print("The duplicate number(s) are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				System.out.print("   "+ a[j]);
				}
			}
		}
	
	}

}
