import java.util.*;
import java.lang.*;
public class BeanCount 
{
	public static void main(String[] args)
	{
		System.out.println("Hello! This program helps estimate the number of beans in a jar.");
		System.out.println("Please enter the jelly bean length (include decimal for accuracy): ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		double length = scan.nextDouble();
		System.out.println("Please enter the jelly bean width (include decimal for accuracy): ");
		double width = scan.nextDouble();
		System.out.println("Enter the jar size (in mL): ");
		double jarSize = scan.nextDouble();
		System.out.println();
		int beanCount = BeanCounter(length, width, jarSize);
		System.out.println("The number of jelly beans in your jar is about " + beanCount + ".");
	}
	public static int BeanCounter(double length, double width, double jarSize)
	{
		double pi = Math.PI;
		double widthSquared = Math.pow(width, 2);
		double beansVolume = pi*5*widthSquared*length/24;
		double beanOccupancy = jarSize*0.698;
		double beansCount = beanOccupancy/beansVolume;
		int beanCount = (int) beansCount;
		return beanCount;
	}
}

