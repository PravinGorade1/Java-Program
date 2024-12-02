import java.util.*;
public class RecursionPattern1
{    
	public static void main(String x1[])
	{
		Scanner abc = new Scanner(System.in);
		//System.out.println("enter the row and column");
		//int x = abc.nextInt();
       // int y = abc.nextInt();		
		show(1,1);
	}

   public static void show(int row,int col)
   {
	   if(row<=5)
	   {
		   if(col<=row)
		   {
		      System.out.printf("*");
		      show(row,col+1);
		   }
		   else{
			   System.out.println();
			   show(row+1,1);
		   }
	   }
   }
}