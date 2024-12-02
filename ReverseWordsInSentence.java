public class ReverseWordsInSentence 
{
	public static void main(String x[])
	{
	  String str = "Java is best programming language";
      for(int i=str.length()-1;i>=0;i--)
	  {
		  int j = i;
        while(j>=0 && str.charAt(j)!=' ')
		{
			j--;
		}
		for(int k=j+1;k<=i;k++)
		{
			System.out.printf("%s",str.charAt(k));
		}
		 System.out.print(' ');
		 i=j;
	  }		  
	}
}