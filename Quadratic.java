public class Quadratic
{
	private double a, b, c;
	private double result1, result2;
	private String resulti1, resulti2;
	private String numResults, typeResults;
	
	public Quadratic(){numResults = "unsolved";}
	
	public Quadratic(double A, double B, double C)
	{
		a = A;
		b = B;
		c = C;
		numResults = "unsolved";
	}
	
	public void setA(double A)
	{
		a = A;
	}
	
	public void setB(double B)
	{
		b = B;
	}
	
	public void setC(double C)
	{
		c = C;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public double solve()
	{
		
		if(((Math.pow(b, 2)) - (4*a*c)) == 0)
		{
			result1 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			result2 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			typeResults = "real";
			numResults = "one";
			if(result1 == result2)
			{
				return result1;
			} else
			{
				return 0.0;
			}
		} else if(((Math.pow(b, 2)) - (4*a*c)) > 0)
		{
			result1 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			result2 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			
			typeResults = "real";
			numResults = "two";
			
			return 0.0;
		} else if(((Math.pow(b, 2)) - (4*a*c)) < 0)
		{
			/*double sqrtTerm = Math.pow(Math.abs(b), 2) - (4*Math.abs(a)*Math.abs(c));
			System.out.println("" + sqrtTerm);
			result1 = ((Math.pow(Math.abs(b), 2))/(2*Math.abs(a)) + (Math.sqrt(Math.abs((Math.pow(Math.abs(b), 2) - (4*Math.abs(a)*Math.abs(c))))))/(2*Math.abs(a)));
			result2 = ((Math.pow(Math.abs(b), 2))/(2*Math.abs(a)) - (Math.sqrt(Math.abs((Math.pow(Math.abs(b), 2) - (4*Math.abs(a)*Math.abs(c))))))/(2*Math.abs(a)));
			resulti1 = "" + result1 + "i";
			resulti2 = "" + result2 + "i";

			typeResults = "imaginary";
			numResults = "two";
			
			return 0.0;
		} else 
		{
			return 0.0;
		}*/
			double bsqrminus4ac = (b * b - 4 * a * c);
			double discriminant = -b / (2 * a);
				//String test = "" + discriminant + " + " + (Math.sqrt(-1 * bsqrminus4ac) / (2 * a));
				//System.out.println("" + test + "i");
				resulti1 = "" + discriminant + " + " + (Math.sqrt(-1 * bsqrminus4ac) / (2 * a)) + "i";
				resulti2 = "" + discriminant + " - " + (Math.sqrt(-1 * bsqrminus4ac) / (2 * a)) + "i";
				//System.out.println(resulti1);
				typeResults = "imaginary";
				numResults = "two";
			return 0.0;
		} else{return 0.0;}
	} 
	
	public String toString()
	{
		if(numResults.equals("unsolved")){
			return "" + a + "x^2 + " + b + "x + " + c + " has not been solved yet.";
		} else {
				if(typeResults.equals("real") && numResults.equals("two"))
			{
				return "" + a + "x^2 + " + b + "x + " + c + " has " + numResults + " " + typeResults + " roots at " + result1 + " and " + result2;
			} else if(typeResults.equals("real") && numResults.equals("one"))
			{
				return "" + a + "x^2 + " + b + "x + " + c + " has " + numResults + " " + typeResults + " root at " + result1;
			} else if(typeResults.equals("imaginary") && numResults.equals("two"))
			{
				return "" + a + "x^2 + " + b + "x + " + c + " has " + numResults + " " + typeResults + " roots at " + resulti1 + " and " + resulti2;
			} else {return "Error.";}
		}
	}
}
