import java.util.*;

public class Dateable
{
	public static void main(String[] args)
	{
		System.out.println("Hello! There is a folk rule that you should only date people over a \ncertain age relative to yourself. This calculator will let you know that age.");
		System.out.print("Please enter your age: ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int dateable = (int) (age/2)+7; 
		System.out.println("You should date someone who is at least " + dateable + " years old");
	}
}