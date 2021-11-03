// add import statements
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

// create class AliceCount
public class AliceCount3
{


	// create main method - remember to catch the exception
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
		// instantiate Scanner object using text file
		Scanner scan = new Scanner(new File("alice.txt"));
		
		// instatiate PrintWriter with output file name
			
		PrintWriter out = new PrintWriter(new FileOutputStream ("alice.output.txt"));
		// create variable to track the number of words in the text
		int wordCount = 0;
		String word;
		
		// create variable to track each of the letters
		double eCount = 0;
		double tCount = 0;
		double aCount = 0;
		double oCount = 0;
		double iCount = 0;
		boolean hasE = false;
		boolean hasT = false;
		boolean hasA = false;
		boolean hasO = false;
		boolean hasI = false;
		String atIDX;
		
		// loop through the file		
		while(scan.hasNext())
		{
			// read in the word one at a time
			word = scan.next();
			
			// increment the word counter
			wordCount++;
			
			// check to see if the letter occurs in the word
			for(int i = 0; i<word.length(); i++)
			{
				atIDX = "" + word.charAt(i);
				// increment the letter counter
				if(atIDX.equals("e") || atIDX.equals("E"))
				{
					hasE = true;
				}
				
				if(atIDX.equals("t") || atIDX.equals("T"))
				{
					hasT = true;
				}
				
				if(atIDX.equals("a") || atIDX.equals("A"))
				{
					hasA = true;
				}
				
				if(atIDX.equals("o") || atIDX.equals("O"))
				{
					hasO = true;
				}
				
				if(atIDX.equals("i") || atIDX.equals("I"))
				{
					hasI = true;
				}
				
				// write the word to the output file

			}
			
			if(hasE == true)
			{
				eCount++;
			}
			
			if(hasT == true)
			{
				tCount++;
			}
			
			if(hasA == true)
			{
				aCount++;
			}
			
			if(hasO == true)
			{
				oCount++;
			}
			
			if(hasI == true)
			{
				iCount++;
			}
			
			if(hasE == true || hasT == true || hasA == true || hasO == true || hasI == true)
			{
				for(int i = 0; i<word.length(); i++)
				{
					atIDX = "" + word.charAt(i);
					
					if(atIDX.equals("a") || atIDX.equals("A") || atIDX.equals("b") || atIDX.equals("B") || atIDX.equals("c") || atIDX.equals("C") || atIDX.equals("d") || atIDX.equals("D") || atIDX.equals("e") || atIDX.equals("E") || atIDX.equals("f") || atIDX.equals("F") || atIDX.equals("g") || atIDX.equals("G") || atIDX.equals("h") || atIDX.equals("H") || atIDX.equals("i") || atIDX.equals("I") || atIDX.equals("j") || atIDX.equals("J") || atIDX.equals("k") || atIDX.equals("K") || atIDX.equals("l") || atIDX.equals("L") || atIDX.equals("m") || atIDX.equals("M") || atIDX.equals("n") || atIDX.equals("N") || atIDX.equals("o") || atIDX.equals("O") || atIDX.equals("p") || atIDX.equals("P") || atIDX.equals("q") || atIDX.equals("Q") || atIDX.equals("r") || atIDX.equals("R") || atIDX.equals("s") || atIDX.equals("S") || atIDX.equals("t") || atIDX.equals("T") || atIDX.equals("u") || atIDX.equals("U") || atIDX.equals("v") || atIDX.equals("V") || atIDX.equals("w") || atIDX.equals("W") || atIDX.equals("x") || atIDX.equals("X") || atIDX.equals("y") || atIDX.equals("Y") || atIDX.equals("z") || atIDX.equals("Z") || atIDX.equals("-"))
					{
						out.print(word.charAt(i));
					}
				}
				out.println();
			}
			
			hasE = false;
			hasT = false;
			hasA = false;
			hasO = false;
			hasI = false;


			
		}
		// calculate the percentage of words containing the character
		double ep = (eCount * 100)/wordCount;
		double tp = (tCount * 100)/wordCount;
		double ap = (aCount * 100)/wordCount;
		double op = (oCount * 100)/wordCount;
		double ip = (iCount * 100)/wordCount;
		double eProb = Math.round((ep)*100.0)/100.0;
		double tProb = Math.round((tp)*100.0)/100.0;
		double aProb = Math.round((ap)*100.0)/100.0;
		double oProb = Math.round((op)*100.0)/100.0;
		double iProb = Math.round((ip)*100.0)/100.0;
		System.out.println("The percentage of words containing an \"e\" is " + eProb + "%.");
		System.out.println("The percentage of words containing an \"t\" is " + tProb + "%.");
		System.out.println("The percentage of words containing an \"a\" is " + aProb + "%.");
		System.out.println("The percentage of words containing an \"o\" is " + oProb + "%.");
		System.out.println("The percentage of words containing an \"i\" is " + iProb + "%.");
		System.out.println("There are " + wordCount + " words in the document.");
		System.out.println("There are " + eCount + " words with e's in them.");
		System.out.println("There are " + tCount + " words with t's in them.");
		System.out.println("There are " + aCount + " words with a's in them.");
		System.out.println("There are " + oCount + " words with o's in them.");
		System.out.println("There are " + iCount + " words with i's in them.");
		// close the files
		scan.close();
		out.close();

	}
}