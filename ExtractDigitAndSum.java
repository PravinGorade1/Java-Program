class Extract
{
	char arr[];
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
public class ExtractDigitAndSum
{
	public static void main(String x[])
	{
      char a[] = "abc123mno45".toCharArray();
	  Extract e = new Extract();
      e.setvalue(a);
      e.getsum();
	}
}	