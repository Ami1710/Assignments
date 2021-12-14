package week1.day2;

/*
Assignment 8: Using Array
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
 */
		 
public class ArrayPseudo {

	public void printArray(int[] array)
	{
		for(int i=0;i<array.length; i++)
		{
			System.out.print(" "+array[i]);
		}
	}
	
	
	public static void main(String[] args) {

		ArrayPseudo ap=new ArrayPseudo();
		
		int arr[] = {9,6,4,3,1,0,2,5,8,7};
		int temp = 0;
		
		System.out.print("Original Array: ");
		ap.printArray(arr);
		
		
		for (int j=0; j<arr.length; j++)
		{
			for (int k=j+1; k<arr.length; k++)
			{
				if(arr[j]>arr[k])
				{
					temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Ascending Order: ");
		
		ap.printArray(arr);
		
				
	}

}
