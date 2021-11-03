public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;

	
	//default constructor
	/*public GCD()
	{
		numerator = 1;
		denominator = 1;
		if(numerator == denominator)
		{
			s = "equal";
		} else{
			smaller = Math.min(numerator, denominator);
		}
	}*/
	
	//initialization constructor
	public GCD(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	//modifier method for numerator
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	//modifier method for denominator
	public void setDenominator(int den)
	{
		denominator = den;
	}
	
	//accessor method for numerator
	public int getNumerator()
	{
		return numerator;
	}
	
	//accessor method for denominator
	public int getDenominator()
	{
		return denominator;
	}
	
	//method to determine gcd
	public int GCD()
	{
		int smaller = 0;
		String s = new String("default");
		if(numerator == denominator)
		{
			s = "equal";
		} else{
			smaller = Math.min(numerator, denominator);
		}
		
		int gcd = smaller;
		if(s.equals("equal"))
		{
			return numerator;
		} else
		{
			while(gcd>0 && !(numerator%gcd == 0 && denominator%gcd == 0))
			{
					gcd--;
					//System.out.println("" + gcd);
			}			
		}
		return gcd;
    }


	
	//method to determine lowest term of numerator
	public int lowestNumerator()
	{
		return (numerator)/(GCD());
	}
	
	//method to determine lowest term of denominator
	public int lowestDenominator()
	{
		return (denominator)/(GCD());
	}
	
	//toString() method
	public String toString()
	{
		return "The GCD is " + GCD() + " and the fraction in lowest terms is " + lowestNumerator() + " / " + lowestDenominator();
	}
}