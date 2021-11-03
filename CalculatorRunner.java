import java.util.Scanner;

public class CalculatorRunner
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		char operator;
		
		Scanner scan = new Scanner(System.in); //instantiate a Scanner


		System.out.println("Enter an operator:"); //prompt the user for the operator (how do you read in a character?)
		operator = (char) (scan.next()).charAt(0); //assign the input from the user to operator variable
		String compOper = new String("" + operator);
		if(!(compOper.equals("+") || compOper.equals("-") || compOper.equals("*") || compOper.equals("/") || compOper.equals("%") || compOper.equals("^")))	//setup a set of conditions below to determine if the operator is valid and check for division by zero
		{
			System.out.println("Error: Invalid operator.");
		} else{		
		
			System.out.println("Enter the first number:"); //get the remaining inputs from the user
			num1 = scan.nextDouble();
			System.out.println("Enter the second number:");
			num2 = scan.nextDouble(); 

		
			if(compOper.equals("/") && num2 == 0)
			{
				System.out.println("Error: Cannot divide by 0.");
			} else{
				Calc myCalc = new Calc(num1, num2, operator); //instantiate Calculator object with the values entered by the user
				myCalc.calc();
				System.out.println(myCalc);//call the toString() method to print the results
			}
		}
		// Check statement: System.out.println("" + operator);


	
		



	}
}