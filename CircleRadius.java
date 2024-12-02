class Circle
{
	float n,r=0;
	void setvalue(float x)
	{
		n=x;
	}
	void showvalue()
	{
		r=3.14f*n*n;
		System.out.printf("%f",r);
	}
}
public class CircleRadius
{
	public static void main(String x[])
	{
		Circle c=new Circle();
		c.setvalue(5f);
		c.showvalue();
	}
}
