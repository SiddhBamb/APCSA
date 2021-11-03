import java.util.*;

public class InOrderRunner
{
	// main(): program starting point
	public static void main( String[] args ) 
	{
		// set up scanner to read input from user
		Scanner scan = new Scanner(System.in);		
		// prompt the user for input
		System.out.print( "Enter x, y, and z: " );
		
		//use the scanner to read in the input
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		// create InOrder object by calling the initialization constructor
		InOrder2 checker = new InOrder2(x, y, z);
		
		// call the method in InOrder you created to determine whether the numbers 
		//were in order. Remember to put the method call inside a print statement
		System.out.println(x + " <= " + y + " <= " + z + " is " + checker.ordered() + ".");
		
		checker.sort();
		System.out.println("The sorted numbers are: " + checker);
		System.out.println("The middle number is: " + checker.getMiddle());
		
    }
}