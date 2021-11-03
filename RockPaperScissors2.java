import java.util.*;
public class RockPaperScissors2
{
	public static void main(String[] args)
	{
		System.out.println("Hello! Welcome to Rock, Paper, Scissors. \nThe computer's AI will compute a random object from the three, and it will test your rock, paper, scissors skills. /nDo you have what it takes to beat the computer?");
		System.out.println("Please enter your choice: rock, paper, or scissors? (Please don't capitalize anything): ");
		Scanner scan = new Scanner(System.in);
		String playerChoice = new String(scan.next());
		String AIChoice = new String(AI());
		System.out.println("The computer chose " + AIChoice);
		System.out.println(whoWins(playerChoice, AIChoice));
	}
	public static String AI()
	{
		String[] RPS = {"rock", "paper", "scissors"};
		Random rand = new Random();
		String choice = new String(RPS[rand.nextInt(2)]);
		return choice;
	}
	public static String whoWins(String user, String AI)
	{
		if(user.equals(AI))
		{
			return "It's a tie!";
		} else if(user.equals("rock"))
		{
			if(AI.equals("scissors")){
				return "You win!";
			} else if(AI.equals("paper"))
			{
				return "You lose. Try again by restarting the program!";
			} else
			{
				return "Error! Please retry.";
			}
		} else if(user.equals("paper"))
		{
			if(AI.equals("rock")){
				return "You win!";
			} else if(AI.equals("scissors"))
			{
				return "You lose. Try again by restarting the program!";
			} else
			{
				return "Error! Please retry.";
			}
		} else if(user.equals("scissors"))
		{
			if(AI.equals("paper")){
				return "You win!";
			} else if(AI.equals("rock"))
			{
				return "You lose. Try again by restarting the program!";
			} else
			{
				return "Error! Please retry.";
			}
		} else
		{
			return "Error! Please retry.";
		}
	}
	public static void printSign(string type)
	{
		if(type.equals("rock"))
		{
			System.out.println("╱╱┏╮");
			System.out.println("╱╱┃┃");
			System.out.println("▉━╯┗━╮");
			System.out.println("▉.┈┈┈┈┈┃");
			System.out.println("▉╮.┈┈┈┈┃");
			System.out.println("╱╰━━━╯");
		} else if(type.equals("paper"))
		{
			System.out.println(" __________");
			System.out.println("|==========|");
			System.out.println("|O=========|");
			System.out.println("|==========|");
			System.out.println("|O=========|");
			System.out.println("|==========|");
			System.out.println("|O=========|");
			System.out.println("|__________|");
		} else if(type.equals("scissors"))
		{
			System.out.println("^________^");
			System.out.println("\\______//");
			System.out.println("_\\___ //_");
			System.out.println("__\\__//__");
			System.out.println("___\\//___");
			System.out.println("___(())___");
			System.out.println("__/∩)(∩\__");
			System.out.println("_(_U||U_)_");
			System.out.println("_(--)(--)_");
		} else
		{
			System.out.println("¯\_(ツ)_/¯");
		}
	}
}