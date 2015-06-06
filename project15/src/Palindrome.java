
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "Pull up if i pull up";
		String string2 = "Race car";
		
		boolean isString1Palindrome = isPalindrome(string1);
		boolean isString2Palindrome = isPalindrome(string2);
		
		if (isString1Palindrome)
		{
		System.out.println(string1 + " is a palindrome.");
		}
		else
		{
		System.out.println(string1 + " is not a palindrome.");
		}
		if (isString2Palindrome)
		{
		System.out.println(string2 + " is a palindrome.");
		}
		else
		{
		System.out.println(string2 + " is not a palindrome.");
		}
		
	}

	public static boolean isPalindrome(String wordInput)
	{
		boolean isPalindrome = true;
		
		if (wordInput != null)
		{
			String wordInputNoSpace = wordInput.replace(" ","").toLowerCase();
			char[] wordInputChars = wordInputNoSpace.toCharArray();
			
			for (int i = 0, k = wordInputChars.length - 1; i < wordInputChars.length/2; i++, k--)
			{
				if (wordInputChars [i] != wordInputChars[k])
				{
					isPalindrome = false;
					break; 
				}
			}
		}
		else
		{
			System.out.println("You gave me a null string.");
		}
		return isPalindrome;
	}
}
