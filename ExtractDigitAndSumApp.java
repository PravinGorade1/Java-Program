/*class Extract
{
	char[] arr;
	void setvalue(char b[])
	{
      arr=b;
	}
   
    void getsum()
    {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
			  sum=sum+arr[i]-48;
			}
		}
		System.out.printf("sum of array is %d",sum);
	}		
}
public class ExtractDigitAndSumApp
{
	public static void main(String x[])
	{
      char a[] = "abc123mno45".toCharArray();
	  Extract e = new Extract();
      e.setvalue(a);
      e.getsum();
	}
}*/

//Extract Digit And calculte sum of digit  EX: ra1hu38j=39
import java.util.*;
public class ExtractDigitAndSumApp
{
	public static void main(String x[])
	{	
		String a="ra30hu80j292";
		int sum=0;
		int num=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				num=num*10+(a.charAt(i)-'0');
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		System.out.printf("Sum is =%d",sum+num);
	}
}	