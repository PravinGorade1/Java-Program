import java.util.*;
import java.lang.*;
public class QuadraticEquationRoot
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the value of the a");
		double a=abc.nextInt();
		System.out.printf("enter the value of the b");
		double b=abc.nextInt();
		System.out.printf("enter the value of the c");
		double c=abc.nextInt();
		
		double d = (b*b)-(4*a*c);
		System.out.printf("value of determinant"+d);
		double root1,root2;
		if(d>0)
		{
			System.out.printf("hello");
			root1= (-b-Math.sqrt(d))/2*a;
			root2= (-b+Math.sqrt(d))/2*a;
			System.out.println("d>0"+"rooot are real and different"+"\t"+root1+"\t"+root2);
		}
		else if(d == 0)
		{
			root1=(-b/2*a);
			System.out.printf("d=0"+"roots are real and equal"+"root1=root2"+root1);
		}
		else{
			double real=-b/2*a;
			double imaginary=(-b+Math.sqrt(d))/2*a;
			System.out.printf("d<0"+"root are unequal emagnary"+real+""+imaginary);
		}
	}
}