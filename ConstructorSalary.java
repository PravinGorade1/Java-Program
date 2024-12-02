class Salary
{
	int id;
	String name;
	int perdaysal;
	int presentday;
	int contact;
	int salary;
	Salary(int id,String name,int perdaysal,int presentday,int contact)
	{
		this.id = id;
		this.name = name;
		this.perdaysal = perdaysal;
		this.presentday = presentday;
		this.contact = contact;
	}
	void calculateSalary()
	{
		salary = presentday*perdaysal;
	}
	void showsalary()
	{
		System.out.printf("%d",salary);
	}
}
 public class ConstructorSalary
 {
	 public static void main(String x[])
	 {
		 Salary s1 = new Salary(1,"pravin",1000,20,384935);
		 s1.calculateSalary();
		 s1.showsalary();
	 }
 }