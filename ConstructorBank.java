class Bank
{
	int amount = 50;
	Bank()
	{
		System.out.printf("totalamount = %d\t",totalamount);
	}
	
	Bank(int addamount)
	{
	  int totalamount = amount + addamount;
	  System.out.printf("totalamount = %d\t",totalamount);
	}
	
}

public class ConstructorBank
{
	public static void main(String x[])
	{
		Bank b1 = new Bank();
		Bank b2 = new Bank(200);
	}
}