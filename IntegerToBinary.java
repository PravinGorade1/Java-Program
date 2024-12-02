import java.util.*;
public class IntegerToBinary
{
	public static void main(String x[])
	{
      	Scanner abc = new Scanner(System.in);
        double n = abc.nextInt();
        int bib[] = new int[5];
		int l = bib.length-1;
        for(int i=l;i>=0;i--)
		{
         if(Math.pow(2,i)<=n)
		 {
			 bib[i] = 1;
			 n = n - Math.pow(2,i);
			 if(n==0)
			 {
			   break;
			 }
		 }
		}	
        for(int i=l;i>=0;i--)
		{			
          System.out.printf("%d",bib[i]);
		}
	}
}