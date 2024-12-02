/*3. WAP to create the class Employee with a following methods  
class Employee 
{   
void setPersonalInfo(String name,int id,int basicSal) 
    { //in this function we need to store name ,id and basicSal in instance variable 
    } 
    void setProgressPer(int progress) 
    { //if progress value is greater than 60 per then increase the basic salary of  
      //employee with 30 percentage  
    } 
    void show() 
    {//in this function we need to show the all details of employee like as  
     //name id and basic salary as well as incremental salary and total salary of employee 
    } 
} 
public class AreaApp 
{ 
    public static void main(String x[]) 
    {  // here create the object of Scanner class and accept the name id and basic salary as well  
       //progress per value not need to calculate it by using formual directly enter e.g 70  
       //means 70% 
      //create the object of Employee class and call setPersonalInfo and pass name id and salary 
     // in it as well as setProgressPer() and pass progress value in it 
    //call the show() method of Employee class. 
    } 
} */
import java.util.*;
class Employee
{
	private int id;
	private char name;
	private int bassalary;
	private int insal;
    void setpersonalinformation(int id,char name,int bassalary)
	{
      this.id=id;
      this.name=name;
	  this.bassalary=bassalary;
	}
	void setprogressper(int progress)
	{
		if(progress>60)
		{
			 insal=insal+(bassalary*30/100);
		}
		
	}
	void show()
	{
		System.out.printf("%\t",id);
		System.out.printf("%c\t",name);
		System.out.printf("%d\t",bassalary);
		System.out.printf("%d\t",id);
		System.out.printf("%d\t",insal);
	}
}
	
	public class EmployeeWithDetail
	{
		public static void main(String x[])
		{
			Scanner k= new Scanner(System.in);
			int id;
			char name;
			int bassalary;
			System.out.printf("ente the id:\n");
			id = k.nextInt();
			System.out.printf("enter the name");
			
			name = k.nextLine().charAt(0);
			System.out.printf("ente the bassalary");
			bassalary = k.nextInt();
			System.out.printf("ente the progress");
			int progress = k.nextInt();
	  
	        Employee  e = new Employee();
			e.setpersonalinformation(id,name,bassalary);
			e.setprogressper(progress);
			e.show();
		}
	}
	  
	  