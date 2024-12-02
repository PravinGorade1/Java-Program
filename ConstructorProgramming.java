class Programming
{
	Programming()
	{
		System.out.printf("I Love Programming");
	}
	Programming(String language)
	{
		System.out.println("I love"+ language);
	}
}
  public class ConstructorProgramming
  {
	  public static void main(String x[])
	  {
		  Programming p1 = new Programming();
		  Programming p2 = new Programming("java");
	  }
  }