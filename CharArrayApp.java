class CharArray
{
	char str1[],str2[];
	void setvalue(char a[],char b[])
	{
		str1=a;
		str2=b;
	}
	void getcompare()
	{
		int flag=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!=str2[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.printf("\nstring are not equal");
		}
		else{
			 System.out.printf("\nstring are equal");
		}
	}
	
	 void getlength()
	 {
		int count=0;
		int count1=0;
		for(int i=0;i<str1.length;i++)
		{
			count++;
		}
		for(int i=0;i<str2.length;i++)
		{
			count1++;
		}
		System.out.printf("\nlength of the string 1=%d\t",count);
		System.out.printf("\nlength of the string 2=%d\t",count1);
	}
	void gateconcate()
	{
	  int size=str1.length+str2.length;
      char str3[] = new char[size];	  
	  for(int i=0;i<str1.length;i++)
	  {
		 str3[i]=str1[i];
         		  
	  }
	  for(int i=0;i<str2.length;i++)
	  {
		 str3[str1.length+i]=str2[i];
          		  
	  }
	  System.out.printf("concate");
	  for(int i=0;i<str3.length;i++)
	  {
		 	System.out.printf("%c",str3[i]);  
	  }
	}
	
	void getuppercase()
	{
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]>='a' && str2[i]<='z')
			{
			  str1[i]=(char)(str1[i]-32);
			}
		}
		for(int i=0;i<str1.length;i++)
		{
		  System.out.printf("%c",str1[i]);
		}		  
	}		
}
	public class CharArrayApp
	{
		public static void main(String x[])
		{
			char ch1[]="pravin".toCharArray();
			char ch2[]="gorade".toCharArray();
			CharArray ch = new CharArray();
			ch.setvalue(ch1,ch2);
			ch.getcompare();
			ch.getlength();
			ch.gateconcate();
			ch.getuppercase();
		}
	}