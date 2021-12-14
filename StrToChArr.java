package week1.day2;
/* Pseudo Code: 1
a) Convert the String to character array
b) Traverse through each character (using loop in reverse direction)
c) Print the character (without newline -> like below
   System.out.print(ch);
*/

/* Pseudo Code: 2
a) Find the length of the string
b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
c) Find the character of the String using its index
*/

public class StrToChArr {

	public static void main(String[] args) {

		String s = "Feeling Good";
		char c[]=s.toCharArray();
		
		System.out.print("Original String: ");
		for (int j=0; j<c.length;j++)
		{
			System.out.print(c[j]);
		}
		
		System.out.println();
		System.out.print("Reverse String: ");
		for (int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		System.out.println();
		System.out.println("Character at 5th Index is: "+c[4]);
	}

}
