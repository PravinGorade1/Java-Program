public class RecApp
{
	public static void main(String x[])
	{
		show(5);
	}
	public static void show(int x)
	{
		if(x!=0)
		{
			System.out.println("good morning");
			show(x-1);
		}
		else{
			  System.out.println("end of the recursion");
		    }
	}
}
		
		
