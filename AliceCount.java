// add import statements
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

// create class AliceCount
public class AliceCount
{


	// create main method - remember to catch the exception
	public static void main(String[] args) throws FileNotFoundException
	{
		
		// instantiate Scanner object using text file
		Scanner scan = new Scanner(new File("alice.txt"));
		
		// instatiate PrintWriter with output file name
			
				PrintWriter out = new PrintWriter(new FileOutputStream ("Alice.output.txt"));
		
		// create variable to track the number of words in the text
		int wordCount = 0;
		String word;
		
		// create variable to track each of the letters
		int eCount = 0;
		int tCount = 0;
		int aCount = 0;
		int oCount = 0;
		int iCount = 0;
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
				
				if(hasI = true)
				{
					iCount++;
				}
				// write the word to the output file
				hasE = false;
				hasT = false;
				hasA = false;
				hasO = false;
				hasI = false;
			}
			String str;
			boolean hasETAOI = false;
			for(int i = 0; i<word.length(); i++)
			{
				str = "" + word.charAt(i);
				if(str.equals("e")|| str.equals("E") || str.equals("t") || str.equals("T") || str.equals("a") || str.equals("A") || str.equals("o") || str.equals("O") || str.equals("i") || str.equals("I"))
				{
					hasETAOI = true;
				} else
				{
					hasETAOI = hasETAOI;
				}
			}
			if(hasETAOI = true)
			{
				out.println(word);
			}
				
			hasE = false;
			hasT = false;
			hasA = false;
			hasO = false;
			hasI = false;
			
		}
		
		// calculate the percentage of words containing the character
		double ep = eCount/wordCount;
		double tp = tCount/wordCount;
		double ap = aCount/wordCount;
		double op = oCount/wordCount;
		double ip = iCount/wordCount;
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
		// close the files
		scan.close();
		out.close();

	}
}