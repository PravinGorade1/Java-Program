class Rectangle
{
	Rectangle()
	{
		int l=0;
		int b=0;
		int area = l * b;
      System.out.printf("Area is = %d\t",area);
	}
	Rectangle(int l,int b)
	{
		int area = l * b;
		System.out.printf("Area is = %d\t",area);
	}
	Rectangle(int l)
	{
		int area = l * l;
		System.out.printf("Area is = %d\t",area);
	}
}
 
 public class ConstructorRectangle
 {
	 public static void main(String x[])
	 {
		 Rectangle r1 = new Rectangle();
		  Rectangle r2 = new Rectangle(5,3);
		   Rectangle r3 = new Rectangle(5);
	 }
 }
	