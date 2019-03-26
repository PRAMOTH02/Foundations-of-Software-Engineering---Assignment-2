
public class Palindrome
{
	private static boolean isPalindrome( String string )
	{
		String upper = StringUtils.upperCase(string);
    String reverse = StringUtils.reverse(upper);

		if (upper.equals(reverse))
			return true;
		else
			return false;
	}

	public static void palindromes( String string )
	{
		System.out.println("\nStarting palindromes\n");
		String s = string;
		String [] words = StringUtils.splitSentences(s);

		for(String word:words)
	{
		String  noSpecial = StringUtils.withoutSpecials(word);
		if(isPalindrome(noSpecial))
			System.out.println("'" + word + "'"  + " " +  "is a Palindrome");
		else
			System.out.println("'" + word + "'"  + " " + "is not a Palindrome");
		}
	}

	public static void main ( String [ ] args )
	{

		String input = "a. 0110. madam . Call it a day. nURSes, RUN!!!."
		 + " A man, a plan, a canal, Panama. Was it a car or a cat "
		 + " I saw. No 'x' in Nixon. Break a leg.  Was it Eliot's "
		 + "toilet I saw?";


		palindromes(input);

	}

}
