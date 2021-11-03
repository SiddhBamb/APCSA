import java.util.*;

public class GallonsWasted 
{
   
   public static void main( String[] args ) 
   {
		System.out.println("Hello! This is a calculator to find out how much water \nyour dripping faucet is wasting. This program uses the \naverage of 15140 drips per gallon (source US Geological \nService website) to calculate total water wastage.");
		System.out.println();
		System.out.print("Please enter the number of drips that fall from your \nfaucet each minute (please enter decimals for higher accuracy): ");
		Scanner scan = new Scanner(System.in);
		double drips = scan.nextDouble();
		System.out.println("Confirmation: your faucet drips " + drips + " times per minute.");
		System.out.println();
		System.out.print("Please enter the amount of time your faucet has been \ndripping (in a whole number of days): ");
		int days = scan.nextInt();
		System.out.println("Confirmation: your faucet has been dripping for " + days + " days.");
		System.out.println();
		System.out.println("Calculating...");
		double gallonsWasted = DripCalc(drips, days);
		System.out.println("Your faucet wasted " + gallonsWasted + " gallons so far. Quick! Go turn it off!");
   }
   public static double DripCalc(double drips, int days)
   {
		double gallonsWasted = (drips * 60 * 24 * days)/15140;
		return gallonsWasted;
   }
}