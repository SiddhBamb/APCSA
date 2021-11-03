public class CalcRun
{
	public static void main(String[] args)
	{
		System.out.println(BetterCalc.NoJoke("9.0 % 2.0"));
		System.out.println(BetterCalc.NoJoke("9.0 * 2.0"));
		System.out.println(BetterCalc.NoJoke("9.0 + 2.0"));
		System.out.println(BetterCalc.NoJoke("9.0 - 2.0"));
		System.out.println(BetterCalc.NoJoke("9.0 / 2.0"));
		// Should print:
		//1.0
		//18.0
		//11.0
		//7.0
		//4.5
	}
}