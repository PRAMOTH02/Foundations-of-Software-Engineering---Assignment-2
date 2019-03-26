
public class StringUtils
{
	//Method UpperCase

	public static String upperCase(String string)
	{
		return string.toUpperCase();
	}

	//Method withoutSpecials
	public static String withoutSpecials(String string)
	{
		return string.replaceAll("[^a-zA-Z0-9]", "");
	}

	//Method Reverse
	public static String reverse(String string)
	{
		String reverse = "";
		for(int a=string.length()-1; a>=0; a--)
		{
			reverse += string.charAt(a);
		}

		return reverse;

	}

	//Method NumberofWords

	public static int numberOfWords(String string){

		String trim = string.trim();

		if(trim.length()==0)

			return 0;

		return trim.split("\\s+").length;

	//Method Splitsentences
	public static String[] splitSentences(String string)
	{
		return string.split("\\.");
	}
}
