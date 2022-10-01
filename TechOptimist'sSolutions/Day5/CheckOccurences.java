import java.io.*;
class Occurence
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The String:");
		String s = b.readLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.print("Enter String:");
		char c=(char)b.read();
		int count=0;
		for(int i=0;i<sb.length();i++)
		{
			if(c==sb.charAt(i))
			{
				count++;
			}
		}
		System.out.println(c+"has occured in"+s+" "+count+" times.");
	}
}
