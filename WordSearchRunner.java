import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WordSearchRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// instantiate Scanner object to read in from file
		Scanner scan = new Scanner(new File("hidden.txt"));
		
		// read in rows
		int rows = scan.nextInt();
		//System.out.println(rows);
		
		// read in columns
		int cols = scan.nextInt();
		//System.out.println(cols);
		
		scan.nextLine();
		
		/*
		
		while(scan.hasNextLine()){
		System.out.println(scan.nextLine());
		}
			
		*/
		
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		WordSearch2 search = new WordSearch2(rows, cols);
		
		
		// loop through the rows in the file
		for(int rowNum = 0; rowNum < rows; rowNum++)
		{
			// loop through the columns in the file
			for(int colNum = 0; colNum < cols; colNum++)
			{
				if(scan.hasNext()){
				
					// read in value from file using local variable
					String word = (scan.next());
					char letter = word.charAt(0);
					
					// pass row, column, and value into the 2D array
					search.setSpot("" + word, rowNum, colNum);
					//System.out.print(word + " ");
				} else{
					break;
				}
			}
			//System.out.println();
		}
		
		//System.out.println(search.letters);
		
		
		
		/* 
		
		for(int rowNum = 0; rowNum < search.letters.length; rowNum++)
		{
			// loop through the columns in the file
			for(int colNum = 0; colNum < search.letters[rowNum].length; colNum++)
			{
				if(scan.hasNext()){
				// read in value from file using local variable
				
				// pass row, column, and value into the 2D array
				System.out.print(word + "");
				} else{
					break;
				}
				System.out.println();
			}
			
		}
	
		*/
		
				
		// read number of words to search for from file
		int numWords = scan.nextInt();
		//System.out.println(numWords);
		
		// loops through the words
		for(int wordNum = 0; wordNum < numWords; wordNum++)
		{
		
			// read in word from file
			String word = new String(scan.next());
			
			// method call to search for the word in the 2D array
			boolean isThere = search.inGrid(word);
			
			// print out word to search for and true/false
			System.out.println(word + ": " + isThere);
		}
			
	}
}