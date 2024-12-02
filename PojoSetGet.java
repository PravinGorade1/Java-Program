class Componey
{
 private String name,address;
 private int salary,id;

  void addnewemployee(String name,int id,int salary,String address)
  {
   this.name=name;
   this.id=id;
   this.address=address;
   this.salary=salary;
  }
  void showemployee()
  {
	System.out.printf(name+"\t"+id+"\t"+salary+"\t"+address);	
  }
} 
  public class PojoSetGet
  {
	  public static void main(String x[])
	  {
		  Componey c = new Componey();
		  c.addnewemployee("ram",1,1000,"pune");
		  c.showemployee();
	  }
  }












/*
class Employee
{
 private int id;
 private String name;
 
 public void setid(int id)
 {
   this.id=id;
 }
  public int getid()
 {
	 return id;
 }
 public void setname(String name)
 {
	 this.name=name;
 }
 public String getname()
 {
	 return name;
 }
}

  public class PojoSetGet
  {
	  public static void main(String x[])
	  {
		  Employee e = new Employee();
		  e.setid(2);
		  e.setname("Pravin");
		  int empid= e.getid();
		  String empname= e.getname();
		  System.out.println(empid+"\t"+empname);
		  
	  }
  }
  */