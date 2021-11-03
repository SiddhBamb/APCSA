import java.io.*;
import java.util.*;

public class MergeTest
{
/**
	* Sorts the given array in ascending order.
	* DO NOT MODIFY THIS METHOD SIGNATURE.
	* @param array The array to be sorted.
	* @return The sorted array.
	*/
	private static String[] sort(String[] array) {
		//System.out.println(array.length);
		if (array.length <= 1) return array; // base case
		// recursively sort two sub arrays ("divide")
		int mid     = array.length / 2;
		String[] arr = new String[mid];
		for(int i = 0; i < mid; i++)
		{
			arr[i] = array[i];
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr));
		String[] left  = sort(arr);
		String[] arr2 = new String[array.length - mid];
		for(int i = 0; i < array.length-mid; i++)
		{
			//System.out.println(i + " " + arr2.length + " " + array.length);
			arr2[i] = array[i+mid];
		}
		System.out.println(Arrays.toString(arr2));
		String[] right = sort(arr2);
		//System.out.println("HELLO");
		// merge the left and right arrays ("conquer")
		int l = 0, r = 0;
		for (int i = 0; i < array.length; i++)
		{
			// if at the end of left or right array
			if (r >= right.length){       array[i] = left[l];  l++;}
			else if (l >= left.length){   array[i] = right[r]; r++;}
			// find the minimum of the left and right array
			else if(left[l].compareTo(right[r]) < 0){ array[i] = left[l];  l++;}
			else{                         array[i] = right[r]; r++;}
		}
		// return the merged and sorted array
		return array;
	}


	/**
	* Reads an entire file into an array of Strings, where each element
	* represents a new line in the file. Assumes the file's first line is an
	* integer indicating the number of following lines.
	* @param filename The filename of the file to read.
	* @return An array of strings read from the file.
	* @throws IOException If the file doesn't exist or an error occurs during the
	*     reading.
	*/
	private static String[] load(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String[] lines = new String[Integer.parseInt(reader.readLine())];
		for (int i = 0; i < lines.length; i++) {
			lines[i] = reader.readLine();
		}
		return lines;
	}


	public static void main(String[] args) throws IOException {
		String[] arr = {"ying", "yang", "yee", "yellow", "zebra", "alphabet", "ching"};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}