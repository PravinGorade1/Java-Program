 
abstract class Area
{
  abstract void showArea();
}	

class Circle extends Area
{
	int radius;
	void setRadius(int radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		double area = 3.14 * radius * radius;
		System.out.printf(area+" ");
	}
}

class Rectangle extends Area
{
	int l;
	int wid;
	void setlenandwidth(int l,int wid)
	{
		this.l = l;
		this.wid = wid;
	}
	void showArea()
	{
		int area = l * wid;
		System.out.printf("%d",area);
	}
}

public class AbstractClassArea
{
	public static void main(String x[])
	{
		Circle c1 = new Circle();
		c1.setRadius(10);
		c1.showArea();
		Rectangle r1 = new Rectangle();
		r1.setlenandwidth(10,20);
		r1.showArea();
	}
}