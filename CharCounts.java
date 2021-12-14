package week1.day2;

/* Pseudo Code:
a) Convert the String to character array
b) Traverse through each character (using loop)
c) Find if the given character is what type using (if)
		i)  Character.isLetter
		ii) Character.isDigit
		iii)Character.isSpaceChar
		iv) else -> consider as special character
*/

public class CharCounts {

	public static void main(String[] args) {

		String s="$$ Welcome to 2nd Class of Automation $$ ";
		char c[]=s.toCharArray();
		
		int Letter=0;
		int Space=0;
		int Num=0;
		int SplChar=0;
		
		System.out.print("String = ");
		for (int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			if(Character.isLetter(c[i]))
			{
				Letter = Letter+1;
			}
			else if(Character.isSpaceChar(c[i]))
			{
				Space=Space+1;
			}
			else if(Character.isDigit(c[i]))
			{
				Num=Num+1;
			}
			else
			{
				SplChar=SplChar+1;
			}
			
		}
		
		System.out.println();
		System.out.println("Total Letters: "+ Letter);
		System.out.println("Total Digits: "+ Num);
		System.out.println("Total Spaces: "+ Space);
		System.out.println("Total Special Characters: "+ SplChar);
	}

}
