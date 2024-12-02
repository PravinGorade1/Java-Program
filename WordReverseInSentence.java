public class WordReverseInSentence
{
	public static void main(String x[])
	{
		String str = "Java is best programming language";
		for(int i=0;i<str.length();i++)
		{
			int j=i;
			while(j<str.length() && str.charAt(j)!=' ')
			{
				j++;
			}
		 
			for(int k=j-1;k>=i;k--)
			{
				System.out.printf("%s",str.charAt(k));
			}
			System.out.print(' ');
			i=j;
		}
	}
}