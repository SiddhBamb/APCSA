// name:
// purpose: experience the thrill of methods

public class Task 
{
	// method favorite(): returns ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1
	public static int favorite() 
	{		
		return ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1; // change method body to produce correct answer
	}


	// method wasted(): prints line that is number of wasted gallons of water 
	public static void wasted( double drips, int days ) 
	{
		int gallonsWasted = (int) (((drips * 60 * 24 * days)/15140) + 0.5);
		System.out.println(drips + " drips per day for " + days + " days will waste " + gallonsWasted + " gallons of water.");
	}

	// method count(): returns estimated number of beans in jar
	public static int count( double length, double width, int jarSize ) 
	{
		double pi = Math.PI;
		double widthSquared = Math.pow(width, 2);
		double beansVolume = pi*5*widthSquared*length/24;
		double beanOccupancy = jarSize*0.698;
		double beansCount = beanOccupancy/beansVolume;
		int beanCount = (int) (beansCount);
		return beanCount;
	}    
}