//WAP input character from keyboard and check character is alphabet ,digit or special symbol?
import java.util.*;
public class AlphabetDigitSpecialSymbol
{
	public static void main(String x[])
	{
		Scanner kp = new Scanner(System.in);
		char n;
		System.out.printf("enter the alphabet ,digit or special symbol");
		
		n = kp.next().charAt(0);
		if(n >= '0' && n <= '9')
		{
			System.out.printf("Digit");
		}
		
		else if((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
		{
			System.out.printf("alphabet");
		}
		
		else{
			System.out.printf("special symbol");
		}
	}
}
