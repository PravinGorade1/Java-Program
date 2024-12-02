class Encript
{
	String string;
	Encript(String string)
	{
		this.string = string;
		
	}
	void beforeencript()
	{
		 char a[]=string.toCharArray();
		int count;
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++) 
			{
			  if(a[j]!=0){
			    if(a[i] == a[j])
			    {
				 count++;
				 a[j]=0;
			    }
			  }
			  b=count;                                                                                
			}
			if(b!=1)
			{
			  System.out.printf("%c--->%d\n",a[i],b);
			  b=0;
			}
		}
	}
	void afterencript()
	{
	 System.out.println("after encript string");	
	}
	
}
public class ConstructorEncriptString
{
	public static void main(String x[])
	{
		Encript e1 = new Encript("abcdabcdccbbddaa");
		e1.beforeencript();
		e1.afterencript();
	}
}