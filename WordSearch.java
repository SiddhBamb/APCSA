import java.util.Arrays;

public class WordSearch
{
	/** 2D array instance variable*/
	String[][] letters;
	
	/** constructor used to set the number of rows and columns in the 2D array
		* @param row
		* @param col*/
	public WordSearch(int row, int col)
	{
		letters = new String[row][col];
	}
	
	/** method to set an element in the 2D array
		* @param s which is the value to store in the 2D array
		* @param row the row to use
		* @param col the column to use*/
	public void setSpot(String s, int row, int col)
	{
		letters[row][col] = s;
	}
	
	/** methods to check for the word in the 2D array
		* @param word the word to search for
		* @return return true or false*/
	public boolean inGrid(String s)
	{
		String allRows = new String("");
		String allRowsBackwards = new String("");
		String allColumns = new String("");
		String allColumnsBackwards = new String("");
		
		// loop through the rows in the file
		for(int rowNum = 0; rowNum < letters.length; rowNum++)
		{
			// loop through the columns in the file
			for(int colNum = 0; colNum < letters[rowNum].length; colNum++)
			{
				allRows = allRows + letters[rowNum][colNum];
			}
		}
		
		// loop through the columns in the file
		for(int colNum = 0; colNum < letters.length; colNum++)
		{
			// loop through the rows in the file
			for(int rowNum = 0; rowNum < letters[colNum].length; rowNum++)
			{
				allColumns = allColumns + letters[rowNum][colNum];
			}
		}
		
		for(int i = allRows.length()-1; i >= 0; i--)
		{
			allRowsBackwards = allRowsBackwards + allRows.charAt(i);
		}
		for(int i = allColumns.length()-1; i >= 0; i--)
		{
			allColumnsBackwards = allColumnsBackwards + allColumns.charAt(i);
		}
		
		//System.out.println(allRowsBackwards);
		//System.out.println(allRows);
		if(allRows.indexOf(s) == -1 && allRowsBackwards.indexOf(s) == -1 && allColumns.indexOf(s) == -1 && allColumnsBackwards.indexOf(s) == -1)
		{
			return false;
		} else
		{
			return true;
		}
	}
	
	/** toString method
		* @return String containing all elements in the 2D array*/
	public String toString()
	{
		return "";
	}
}