package Week1Day4;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		//checking length of the String is equal in size
		
		if (text1.length()!=text2.length())
		{
			System.out.println("Not Anagram");
			
			//Convert the string t character array
			char[]charArray1=text1.toCharArray();
			char[]charArray2=text2.toCharArray();
			
			//sorting in order
					
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray1,charArray2))
			{
				System.out.println("The string is Anagram");
			}
				else
				{
					System.out.println("The straing is not Anagram");
				}
			}
				}
			
				
			
		}
		

	


