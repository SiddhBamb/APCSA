public class InOrder2
{
	private int numOne;
	private int numTwo;
	private int numThree;
	private int tempOne, tempTwo, tempThree;
	
	public InOrder2()
	{
		// complete default constructor
		numOne = 1;
		numTwo = 2;
		numThree = 3;
	}
	
	public InOrder2(int n1, int n2, int n3)
	{
		// complete initialization constructor
		numOne = n1;
		numTwo = n2;
		numThree = n3;
	}
	
	public void setNumOne(int n1)
	{
		// complete modifier method for numOne
		numOne = n1;
	}
	
	// add modifier method for numTwo
	public void setNumTwo(int n2)
	{
		numTwo = n2;
	}
	
	// add modifier method for numThree
	public void setNumThree(int n3)
	{
		numThree = n3;
	}
	
	public int getNumOne()
	{
		// complete accessor method for numOne
		return numOne;
	}
	
	// add accessor method for numTwo
	public int getNumTwo()
	{
		return numTwo;
	}
	
	// add accessor method for numThree
	public int getNumThree()
	{
		return numThree;
	}
	
	// create method to determine if the numbers are in order
	public boolean ordered()
	{
		boolean isOrdered;
		if((numOne <= numTwo) && (numTwo <= numThree) )
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	public void sort()
	{
		if((numOne <= numTwo) && (numTwo <= numThree) )
		{
			numOne = numOne;
			numTwo = numTwo;
			numThree = numThree;
		} else if ((numOne >= numTwo) && (numTwo >= numThree))
		{
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
			numOne = numThree;
			numThree = tempOne;				
		} else if((numOne >= numTwo) && (numTwo <= numThree) && (numOne <= numThree))
		{
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
			numOne = numTwo;
			numTwo = tempOne;
		} else if((numOne >= numTwo) && (numTwo <= numThree) && (numOne >= numThree))
		{
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
			numOne = numTwo;
			numTwo = numThree;
			numThree = tempOne;
		} else if((numOne <= numTwo) && (numTwo >= numThree) && (numThree >= numOne))
		{
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
			numTwo = numThree;
			numThree = tempTwo;
		} else if((numOne <= numTwo) && (numTwo >= numThree) && (numThree <= numOne))
		{
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
			numOne = numThree;
			numTwo = tempOne;
			numThree = tempTwo;
		} else
		{
			System.out.println("Error");
			tempOne = numOne;
			tempTwo = numTwo;
			tempThree = numThree;
		}
			
		/*	if(numOne <= numTwo)
			{
				
				System.out.println("The sorted numbers are: " + numOne + " <= " + numThree + " <= " + numTwo + ".");
				return false;
			} else 
			{

			}
		} else if((numOne >= numTwo))
		{
			
			return false;
		}	*/
	}
	public int getMiddle()
	{
		return numTwo;
	}
	
	public String toString()
	{
		return "" + numOne + " " + numTwo + " " + numThree;
	}
}