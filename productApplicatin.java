class Product
{
	private int id;
	private String name;
	private int qty;
	private int rate;
	
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
	public void setqty(int qty)
	{
		this.qty=qty;
	}
	public int getqty()
	{
		return qty;
	}
	public void setrate(int rate)
	{
		this.rate=rate;
	}
	public int getrate()
	{
		return rate;
	}
}

  class CalculateBill
  {
	  private Product P[];
	  void SetProduct(Product...p)
	  {
		  System.out.println("id\t name\t qty\t rate");
	    for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getqty()+"\t"
			+p[i].getrate());
		}
		int sum=0;
		
		for(int i=0;i<p.length;i++)
		{
		  sum=sum+p[i].getqty()*p[i].getrate();
		}
		System.out.println("===========================================");
		System.out.printf("Total bill is%d",sum);
	  }
	  
  }
  
  public class ProductApplicatin
  {
	  public static void main(String x[])
	  {
		 CalculateBill c = new CalculateBill();
		 Product p1 = new Product();
		 p1.setid(1);
		 p1.setname("pizza");
		 p1.setqty(10);
		 p1.setrate(10);
		 
		 Product p2 = new Product();
		 p2.setid(2);
		 p2.setname("Burger");
		 p2.setqty(20);
		 p2.setrate(20);
		 
		 Product p3 = new Product();
		 p3.setid(3);
		 p3.setname("samosa");
		 p3.setqty(30);
		 p3.setrate(10);
		              
		 Product p4 = new Product();
		 p4.setid(4);
		 p4.setname("pav");
		 p4.setqty(20);
		 p4.setrate(10);
		 
		 c.SetProduct(p1,p2,p3,p4);
	  }
  }