class Product
{
	private int id;
	private String name;
	private int salary;
	
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
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
}
  class shop
  
  {
	  private Product p;
	  void addnewProduct(Product product)
	  {
		  p = product;
	  }
	  public void showbook()
	  {
		  System.out.printf(p.getid()+"\t"+p.getname()+"\t"+p.getsalary());
	  }
  }
  
  public class ProductApp
  {
	  public  static void main(String x[])
	  {
		shop s = new shop();
		Product p1 = new Product();
		p1.setid(1);
		p1.setname("pravin");
		p1.setsalary(1000);
		
		s.addnewProduct(p1);
		s.showbook();
	  }
  }
		
        		