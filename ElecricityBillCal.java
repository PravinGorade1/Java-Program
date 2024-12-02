import java.util.*;
public class ElecricityBillCal
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the units");
		int units = abc.nextInt();
		if(units<=50)
		{
	     double bill = units*0.50;
		 double total = bill*20/100;
		 
         System.out.printf("%f",total+bill);		 
		}
		if(units > 50 && units <= 150)
		{
		 double bill =(50*0.50)+ (units-50)*0.75;
		 double total = bill*20/100;
         System.out.printf("%f",bill+total);	
		}
		if(units > 150 && units <= 250)
		{
		 double bill =(50*0.50) + (100)*0.75 + (units-150)*1.20;
		 double total = bill*20/100;
         System.out.printf("%f",bill+total);	
		}
		if(units > 250)
		{
		double bill =(50*0.50) + (100)*0.75 + (100)*1.20 + (units-250)*1.50;
		double total = bill*20/100;
        System.out.printf("%f",total+bill);	
		}
	}
}