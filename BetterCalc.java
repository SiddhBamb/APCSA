import java.util.*;
public class BetterCalc
{
public static double CalcPerform(String equation)
	{
		double result;
		Scanner scan = new Scanner(equation);
		double num1 = (double) scan.nextDouble();
		String operation = new String("" + scan.next());
		double num2 = (double) scan.nextDouble();
		Random rand = new Random();
		String[] JokeList = {"Did you hear about the crook who stole a calendar? He got twelve months.", "Q. Why is an island like the letter T? A. They're both in the middle of water!", "The world tongue-twister champion just got arrested. I hear they're gonna give him a really tough sentence.", "I've just written a song about tortillas; actually, it's more of a rap.", "Velcro – what a rip-off!", "I recently decided to sell my vacuum cleaner as all it was doing was gathering dust.", "Don't you hate it when someone answers their own questions? I do.", "I hate Russian dolls, they're so full of themselves.", "Do I lose when the police officer says papers and I say scissors?", "If I got 50 cents for every failed math exam, I'd have $ 6.30 now.", "A lot of people cry when they cut onions. The trick is not to form an emotional bond."};
		String joke = JokeList[rand.nextInt(11)];
		System.out.println(joke);
		if(operation.equals("*"))
		{
			result = num1*num2;
			return result;
		} else if(operation.equals("/"))
		{
			result = num1/num2;
			return result;
		} else if(operation.equals("+"))
		{
			result = num1+num2;
			return result;
		} else if(operation.equals("-"))
		{
			result = num1-num2;
			return result;
		} else if(operation.equals("^"))
		{
			result = Math.pow(num1, num2);
			return result;
		} else if(operation.equals("%"))
		{
			result = num1%num2;
			return result;
		} else
		{
			System.out.println("Error: Operator not found.");
			return 0.0;
		}
	}
public static double NoJoke(String equation)
	{
		double result;
		Scanner scan = new Scanner(equation);
		double num1 = (double) scan.nextDouble();
		String operation = new String("" + scan.next());
		double num2 = (double) scan.nextDouble();
		if(operation.equals("*"))
		{
			result = num1*num2;
			return result;
		} else if(operation.equals("/"))
		{
			result = num1/num2;
			return result;
		} else if(operation.equals("+"))
		{
			result = num1+num2;
			return result;
		} else if(operation.equals("-"))
		{
			result = num1-num2;
			return result;
		} else if(operation.equals("^"))
		{
			result = Math.pow(num1, num2);
			return result;
		} else if(operation.equals("%"))
		{
			result = num1%num2;
			return result;
		} else
		{
			System.out.println("Error: Operator not found.");
			return 0.0;
		}
	}
}