import java.util.*;
public class NumberToWords
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		int no;
		System.out.printf("enterr the number");
		no=k.nextInt();

         if(no<1 || no>9999)
		 {
			 System.out.printf("number is invalid");
		 }
			 else {
				 int a=no%10;
				 int b=no/10;
				 int c=b%10;
				 int g=no/100;
				 int d=g%10;
				 int e=no/1000;
				 
				 
				 String SD[]={"","one","two","three","four","five","six",
				 "seven","eight","nine","ten","eleone","twelve","thrteen","fourteen",
				 "fifteen","sixteen","siventeen","eighteen","nineteen"};
				 String ty[]={"","ten","twenty","thrty","fourty","fifty","sixty",
				 "siventy","eighty","ninety"};
				 String h="hundred";
				 String t="thousand";
				 if(no<20)
					System.out.println(SD[no]);
				else if(no>=20 && no<100)
				     System.out.println(ty[c]+""+SD[a]);
				else if(no>=100 && no<999)
				     System.out.println(SD[d]+""+h+""+ty[c]+""+SD[a]);
				 else
				 	System.out.println(SD[e]+""+t+""+SD[d]+""+h+""+ty[c]+""+SD[a]);
			 }
	}
}