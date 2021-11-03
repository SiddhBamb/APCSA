public class Deal
{
	//instance variables
	private int prizeLoc;
	private int userGuess;
	private int doorRevealed;
	
	//constructor
	public Deal()
	{
		setPrizeLoc();
		setUserGuess();
	}
	
	//modifier method for userGuess (should call random number method)
	public void setUserGuess()
	{
		userGuess = getRandom();
	}
	
	//modifier method for prizeLoc (should call random number method)
	public void setPrizeLoc()
	{
		prizeLoc = getRandom();
	}
	
	//accessor method for userGuess
	public int getUserGuess()
	{
		return userGuess;
	}
	
	//accessor method for prizeLoc
	public int getPrizeLoc()
	{
		return prizeLoc;
	}
	
	//method to generate random number between 1 & 3
	public int getRandom()
	{
		return (int)(Math.random()*3 + 1);
	}
	
	//method to reveal the door
	public int door()
	{
		int doorNum = getRandom();
		while(doorNum == prizeLoc || doorNum == userGuess)
		{
			doorNum = getRandom();
		}
		doorRevealed = doorNum;
		return doorNum;
	}
	
	//method to update user's guess
	public int newGuess()
	{
		int doorNum = getRandom();
		while(doorNum == userGuess || doorNum == doorRevealed)
		{
			doorNum = getRandom();
		}
		return doorNum;
	}
	
	//toString method
	public String toString()
	{
		return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
	}
}