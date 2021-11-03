//import Scanner
import java.util.*;

public class GCDRunner
{
	//main method
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner scan = new Scanner(System.in);
		
		//prompt user for numerator
		System.out.println("Please enter a numerator:");
		
		//assign user input to variable
		int numerator = scan.nextInt();
		
		//prompt user for denominator
		System.out.println("Please enter a denominator:");		
		
		//assign user input to variable
		int denominator = scan.nextInt();
		
		//instantiate GCD object
		GCD gcd = new GCD(numerator, denominator);
		System.out.println("" + gcd.GCD());
		//call toString() method
		System.out.println(gcd);
		
	}
}