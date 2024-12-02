class Square
{
	int n;
	void setvalue(int x)
	{
		n=x;
	}
	void showvalue()
	{
		System.out.printf("%d",n*n);
	}
}
 public class SquareApp
 {
	 public static void main(String x[])
	 {
		 Square s = new Square();
		 s.setvalue(10);
		 s.showvalue();
	 }
 }