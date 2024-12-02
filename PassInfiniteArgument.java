/*import java.util.*;
class Argument
{
 int sum=0; 
 void calsum(int ...x)
 {
	 for(int i=0;i<x.length;i++)
	 {
		 sum=sum+x[i];
	 }
   System.out.printf("sum is %d\n",sum);
 }
}
public class PassInfiniteArgument
{
	public static void main(String x[])
	{
		Argument s = new Argument();
		s.calsum(10,20,30,40,50);
	}
}
*/

import java.util.*;
class Argument
{
 int sum=0; 
 void calsum(int[]...x)
 {
	 for(int i=0;i<x.length;i++)
	 {
		 for(int j=0;j<x[i].length;j++)
		 {
			System.out.printf("%d\t",x[i][j]); 
		 }
		 System.out.println();
	 }
 }
}
public class PassInfiniteArgument
{
	public static void main(String x[])
	{
		Argument s = new Argument();
		s.calsum(new int[]{1,2,3}, new int[]{4,5,6}, new int[]{7,8,9});
	}
}
