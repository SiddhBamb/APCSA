import java.util.*;
public class RockPaperScissors
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
}