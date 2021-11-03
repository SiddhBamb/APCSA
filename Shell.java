package usaco;
import java.util.*;
import java.io.*;

public class Shell {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Scanner scan = new Scanner(new File("shell.in"));
		PrintWriter pw = new PrintWriter(new File("shell.out"));
		int[] shells = new int[3];
		int numGuesses = scan.nextInt();
		int swap1 = 0;
		int swap2 = 0;
		int guessed = 0;
		int temp = 0;
		int mostRight = 0;
		int numRight = 0;

		int ignoreguesses = 0;
		for(int i = 0; i < shells.length; i++)
		{
			Scanner scan2 = new Scanner(new File("shell.in"));
			ignoreguesses = scan2.nextInt();
			shells = new int[3];
			shells[i] = 1;
			for(int x = 0; x < numGuesses; x++)
			{

					swap1 = scan2.nextInt() - 1;
		            
		        	swap2 = scan2.nextInt() - 1; 

					guessed = scan2.nextInt() - 1;
		            
				temp = shells[swap1];
				shells[swap1] = shells[swap2];
				shells[swap2] = temp;
				if(shells[guessed] == 1)
				{
					numRight++;
				}
			}
			mostRight = Math.max(mostRight, numRight);
			numRight = 0;
		}
		pw.println(mostRight);
		//System.out.println(mostRight);
		pw.close();
		scan.close();
	}
}
