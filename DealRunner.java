//import Scanner
import java.util.*;

public class DealRunner
{
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner scan = new Scanner(System.in);
		
		//prompt the user for the number of simulations to run
		System.out.println("How many simulations would you like to run?");
		
		//assign input to variable
		int numSims = scan.nextInt();
		
		//declare variables to store stopping condition for loop, prize loc, user guess,
		  //door revealed, the new guess, and wins by changing
		
			int guess = 0;
			int newGuess;
			int prizeloc = 0;
			int door = 0;
			int winCount = 0;
			int temp = winCount;
					
		//loop through the number of simulations
		for(int index = 1; index <= numSims; index++)
		{
			//instantiate a Deal object inside the loop
			Deal deal = new Deal();
			
			//get the user's guess and assign to a variable 
			guess = deal.getUserGuess();
			
			//get the prize location and assign to a variable
			prizeloc = deal.getPrizeLoc();
			
			
			//get the door which is revealed and assign to a variable
			door = deal.door();
			
			//get the new guess and assign to a variable
			newGuess = deal.newGuess();
			
			
			
				
			//output the variables for each simulation
			System.out.println("Guess 1 was: " + guess + "\nThe door revealed was: " + door + "\nThe second guess was: " + newGuess + "\nThe prize was in door " + prizeloc);
			//determine if the new guess matches the prize location
			if(newGuess == prizeloc)
			{
				System.out.println("Game " + index + ": You won!");
				temp = winCount;
				winCount = temp + 1;
			}
			else
			{
				System.out.println("Game " + index + ": The host won!");
			}
				
		}
		
		//output the probability of winning/not winning by switching
		System.out.println("By switching every time, the probability of winning was " + winCount + " / " + numSims);
		int lossCount = numSims - winCount;
		System.out.println("By not switching every time, the probability of winning was " + lossCount + " / " + numSims);
		
	}
}