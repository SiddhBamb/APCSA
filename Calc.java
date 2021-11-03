public class Calc
{
	//instance variables
	private double num1;
	private double num2;
	private char operand;
	private double result;
	
	//default constructor
	public Calc()
	{
		num1 = 0;
		num2 = 0;
		operand = 0;
	}
	
	//inialization constructor
	public Calc(double numA, double numB, char operator)
	{
		num1 = numA;
		num2 = numB;
		operand = operator;
	}
	
	//modifier method for num1
	public void setNum1(double n1)
	{
		num1 = n1;
	}
	
	//modifider method for num2
	public void setNum2(double n2)
	{
		num2 = n2;
	}
	
	//modifier method for operator
	public void setOperand(char operator)
	{
		operand = operator;
	}

	
	//accessor method for num1
	public double getNum1()
	{
		return num1;
	}
	
	//accessor method for num2
	public double getNum2()
	{
		return num2;
	}
	
	//accessor method for operator
	public char getOperand()
	{
		return operand;
	}

	
	//Create method to calculate the result
	public double calc()
	{
		String operation = new String("" + operand);
		if(operation.equals("*"))
		{
			result = num1*num2;
		} else if(operation.equals("/"))
		{
			result = num1/num2;
		} else if(operation.equals("+"))
		{
			result = num1+num2;
		} else if(operation.equals("-"))
		{
			result = num1-num2;
		} else if(operation.equals("^"))
		{
			result = Math.pow(num1, num2);
		} else if(operation.equals("%"))
		{
			result = num1%num2;
		} else{}
		return result;
	}

	
	//Create the toString() method
	public String toString()
	{
		return "" + num1 + " " + operand + " " + num2 + " = " + calc();
	}
	
}