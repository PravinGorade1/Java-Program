public class Kichkat1
{
	public static void main(String x[])
	{
		 int m=3;		
	  for(int i=1;i<=8;i++)
	   {     
		 int k=1;

         for(int j=1;j<=4;j++)	
		 {
			if(i<=4 && j<=i )
		     {
               System.out.printf("%d",k++);
			   if(j<i)
			   {
				   System.out.print("*");
			   }
			 }
			 else if(i>4 && j<=9-i)
			 {
				 System.out.printf("%d",m--); 
				  if(j<9-i)
			   {
				   System.out.print("*");
			   }
			 }
			else
			{
			   System.out.printf(" ");
			}
    	 }
			m=8-i;
		 System.out.println();
		 
	   }		 
	}
}

/*

1
1*2
1*2*3
1*2*3*4
4*3*2*1
3*2*1
2*1
1
*/