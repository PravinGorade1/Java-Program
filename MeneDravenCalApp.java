import java.util.*;
abstract class Value
{
	int a,b;
	void setvalue(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void performcalculation();
}

 class Add extends Value
 {
	 void performcalculation()
	 { 
	   System.out.println("Addition id"+(a+b));	 
	 }
 }
 
 class Mul extends Value
 {
	 void performcalculation()
	 {
		 System.out.printf("Multiplication id"+(a*b));
	 }
 }
 
 class Div extends Value
 {
	 void performcalculation()
	 {
	   System.out.printf("Division id"+(a/b));	 
	 }
 }
 
 class Sub extends Value
 {
	 void performcalculation()
	 {
	  System.out.printf("Addition id"+(a-b));	 
	 }
 }
 
 class Calculator
 {
	 void performoperation(Value v)
	 {
		v.performcalculation(); 
	 }
 }
 
 public class MeneDravenCalApp
 {
	 public static void main(String x[])
	 {
		 Scanner abc = new Scanner(System.in);
		 Calculator c = new Calculator();
		 char ch;
		 do
		 {
			 System.out.printf("case 1: Add number\n");
			 System.out.printf("case 2: Multiply number\n");
			 System.out.printf("case 3: Divide number\n");
			 System.out.printf("case 4: Substract number\n");
			 System.out.printf("enter your choice\n");
			 int choice  = abc.nextInt();
			 switch(choice)
			 {
			   case 1: 
			   {
                 System.out.printf("enter the two number\n");
				 int a = abc.nextInt();
				 int b = abc.nextInt();
				 Add a1 = new Add();
				 a1.setvalue(a,b);
				 c.performoperation(a1);
                  break;                
			   }
			   
			   case 2:
			   {
				   System.out.printf("enter the two number");
				   int p = abc.nextInt();
				   int q = abc.nextInt();
				   Mul m1 = new Mul();
				   m1.setvalue(p,q);
				   c.performoperation(m1);
				 break;
			   }
			    
			   case 3:
			   {
                 System.out.printf("enter the two number");
                 int j = abc.nextInt();
                 int k = abc.nextInt();
                 Div d1 = new Div();
				 d1.setvalue(j,k);
				 c.performoperation(d1);
				 break;
			   }
			   
			   case 4:
			   {
				 System.out.printf("enter the two number");
                 int m = abc.nextInt();
                 int l = abc.nextInt();
                 Sub s1 = new Sub();
				 s1.setvalue(m,l);
				 c.performoperation(s1);
				 break;
			   }
			   default :
			   {
				   System.out.printf("Wrong choice\n");
			   }
			 }
			 System.out.printf("\nDo you continue again");
			 ch=abc.next().charAt(0);
		   }while(ch=='s' || ch=='S');
		}
 }