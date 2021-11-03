import java.util.*;

public class HelloInput{
	public static void main(String[] args)
	{
		System.out.print("Hello! Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = new String(scan.nextLine());
		System.out.println("Hello, " + name + "!");
		System.out.print("Please enter your age in years: ");
		int age = scan.nextInt();
		int monthAge = age*12;
		System.out.println("Your age in months is: " + monthAge);
		System.out.println("What are your 2 favorite bands? (Put and between band names): ");
		String dummyString = new String(scan.nextLine());
		String band1and2 = new String(scan.nextLine());
		System.out.println("Cool! I like " + band1and2 + " too!");		
	}
}