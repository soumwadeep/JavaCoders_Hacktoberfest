import java.io.*;
class Palindrome
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The String:");
		String str = br.readLine();
		String temp = str;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		if(temp.equalsIgnoreCase(str))
		{
			System.out.println(temp + " Is Palindrome.");
		}
		else
		{
			System.out.println(temp + " Is Not Palindrome.");
		}
	}
}
