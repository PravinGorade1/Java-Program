import java.util.*;
interface Operation
{
	int display(int id);
	String display(String name);
	double display(double sal);
}
class Employee
{
	int id;
	String name;
	double sal;
	void setid(int id)
	{
		this.id = id;
	}
	int getid()
	{
		return id;
	}
	
	void setname(String name)
	{
		this.name = name;
	}
	String getname()
	{
		return name;
	}
	void setsal(double sal)
	{
		this.sal = sal;
	}
	double getsal()
	{
		return sal;
	}
}

 class Setemployee
 {
	 Employee[] e;
	 void addemployee(Employee ...e)
	 {
		 this.e = e;
	 }
	  public void display()
	  {
		  for(int i=0;i<e.length;i++)
		  {
			System.out.println("\tid is = "+e[i].getid()+"\tname is = "+e[i].getname()+"\tsalary is = "+e[i].getsal());
		  }
	  } 
 }
 
  public class Interface1
  {
	  public static void main(String x[])
	  {
		 // Scanner abc = new Scanner(System.in);
		  Employee[] e = new Employee[5];
		//  int id;
		 // String name;
		 // double sal;
		  System.out.printf("enter the employee id name and salary\n");
		  for(int i=0;i<e.length;i++)
		  {
			  Scanner abc = new Scanner(System.in);
			  System.out.printf("enter the id\n");
			  int  id = abc.nextInt();
			  System.out.printf("enter name\n");
			  String  name = abc.next();
			  System.out.printf("enter the salary\n");
			  double sal = abc.nextDouble();
			  
			  e[i] = new Employee();
			  e[i].setid(id);
			  e[i].setname(name);
			  e[i].setsal(sal);
		  }
		  Setemployee s1 = new Setemployee();
		  s1.addemployee(e);
		  s1.display();
	  }
  }