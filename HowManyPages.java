import java.util.*;

public class HowManyPages
{
	public static void main(String[] args)
	{
		System.out.println("There is a folk rule stating the number of pages you \nshould read before giving up on a book is 100 - your age. \nFor example, a 21 year old needs to read 79 pages ( 100 - 21 ).");
		System.out.println("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int pages = 100-age;
		System.out.println();
		System.out.println("You should read at least " + pages + " pages before giving up on a book.");
	}
}