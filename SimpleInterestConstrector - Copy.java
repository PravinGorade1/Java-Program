class Interest
{
	int pamt;
	int irate;
	int dur;
	void setPRD(int pamt,int irate,int dur)
	{
		this.pamt = pamt;
		this.irate = irate;
		this.dur = dur;
	}
}
	 class Calculate extends Interest
	 {
		 void callinterest()
		 {
			 int simpleInt =(pamt*irate*dur)/100;
			 System.out.printf("%d\t",simpleInt);
		 }
	 }

public class SimpleInterestConstrector
{
	public static void main(String x[])
	{
		Calculate c1 = new Calculate();
		c1.setPRD(1000,5,12);
		c1.callinterest();
	}
}