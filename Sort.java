import java.io.*;
import java.util.*;

public class Sort {

  /**
   * Sorts the given array in ascending order.
   * DO NOT MODIFY THIS METHOD SIGNATURE.
   * @param array The array to be sorted.
   */
  private static void oldSort(String[] array) {
		int size = array.length;
		String temp;
		int minIDX;
		for(int i = 0; i < size-1; i++)
		{
			minIDX = i;
			//System.out.println("i value " + i);
			for(int j = i+1; j < size; j++)
			{
				//System.out.println("j value " + j);
				if(array[j].compareTo(array[minIDX]) <= 0)
				{
					minIDX = j;
					//System.out.println("minidx changed " + j);
				}
			}
			if(minIDX != i)
			{
				//System.out.println("lkjdlakjdf " + list[i] + " " + list[minIDX] + " " + i + " " + minIDX);
				temp = array[i];
				array[i] = array[minIDX];
				array[minIDX] = temp;
			}
		}
  }
  
  private static void sortEnhancedSelection(String[] array) {
		int size = array.length;
		String temp;
		int minIDX;
		if(isSorted(array))
		{
			return;
		}
		/*if(isSortedBackwards(array))
		{
			String[] b = new String[array.length]; 
			int j = array.length;
			for (int i = 0; i < array.length; i++)
			{
				b[j - 1] = array[i];
				j = j - 1;
			}
		}*/ //somehow this actually slows it down	
		for(int i = 0; i < size-1; i++)
		{
			minIDX = i;
			//System.out.println("i value " + i);
			for(int j = i+1; j < size; j++)
			{
				//System.out.println("j value " + j);
				if(array[j].compareTo(array[minIDX]) <= 0)
				{
					minIDX = j;
					//System.out.println("minidx changed " + j);
				}
			}
			if(minIDX != i)
			{
				//System.out.println("lkjdlakjdf " + list[i] + " " + list[minIDX] + " " + i + " " + minIDX);
				temp = array[i];
				array[i] = array[minIDX];
				array[minIDX] = temp;
			}
		}
	}
	
	private static void sort(String[] input)
	{
		//insertion
		/*String key;
		int j = 0;
		for(int i = 2; i < array.length; i++)
		{
			key = array[j];
			j = i-1;
			while(j>0 && array[j].compareTo(key) > 0)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}*/
		for (int i = 1; i < input.length; i++) { 
        String key = input[i]; 
        int j = i - 1;
        while (j >= 0 && input[j].compareTo(key)>0) {
            input[j + 1] = input[j];
            j = j - 1;
        }
        input[j + 1] = key; 
    }
	}
	
	private static void mergesort(String[] array)
	{
		if(array.length == 1)
		{
			return;
		}
		String[] arr1 = new String[(int)(array.length/2)];
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = array[i];
		}
		String[] arr2 = new String[(int)(array.length -(array.length/2 + 1))];
		for(int i = array.length/2 + 1; i < array.length; i++)
		{
			arr2[i] = array[i];
		}
		
		sort(arr1);
		sort(arr2);
		
		array = merge(arr1, arr2);
	}
	
	private static String[] merge(String[] a, String[] b)
	{
		String[] c = new String[a.length + b.length];
		String[] temp;
		while(a.length > 0 && b.length > 0)
		{
			if(a[0].compareTo(b[0]) > 0)
			{
				c[c.length-1] = new String(b[0]);
				temp = new String[b.length - 1];
				for(int i = 0; i < b.length-1; i++)
				{
					temp[i] = b[i+1];
				}
				b = temp;
			}
			else
			{
				c[c.length-1] = new String(a[0]);
				temp = new String[a.length - 1];
				for(int i = 0; i < a.length-1; i++)
				{
					temp[i] = a[i+1];
				}
				a = temp;
			}
		}
		
		while(a.length > 0)
		{
			c[c.length-1] = new String(a[0]);
			temp = new String[a.length - 1];
			for(int i = 0; i < a.length-1; i++)
			{
				temp[i] = a[i+1];
			}
			a = temp;
		}
		
		while(b.length > 0)
		{
			c[c.length-1] = new String(b[0]);
			temp = new String[b.length - 1];
			for(int i = 0; i < b.length-1; i++)
			{
				temp[i] = b[i+1];
			}
			b = temp;
		}
		
		return c;
	}
	
	
	
	private static boolean isSorted(String[] array)
	{
		for(int i = 0; i < array.length-1; i++)
		{
			if(!(array[i].compareTo(array[i+1]) <= 0))
			{
				return false;
			}
		}
		return true;
	}
	
	private static boolean isSortedBackwards(String[] array)
	{
		for(int i = 0; i < array.length-1; i++)
		{
			if(!(array[i].compareTo(array[i+1]) >= 0))
			{
				return false;
			}
		}
		return true;
	}

	public static void reverseArray(int arr[], int start, int end)
	{
		int len = end - start;
		if(len <= 0) return;

		int len2 = len >> 1;
		int temp;

		for (int i = 0; i < len2; ++i)
		{
			temp = arr[start + i];
			arr[start + i] = arr[end - i - 1];
			arr[end - i - 1] = temp;
		}
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
    String[] prefixes = {"small", "medium", "large"};
    String[] suffixes = {"ascending.txt", "descending.txt", "random.txt"};
    for (String prefix : prefixes) {
      for (String suffix : suffixes) {
        String filename = prefix + "_" + suffix;
        String[] array = load(filename);
        long start, end;

        System.out.println("Sorting " + filename + " with " + array.length + " words");

        String[] copy = Arrays.copyOf(array, array.length);
        start = System.currentTimeMillis();
        Arrays.sort(copy);
        end = System.currentTimeMillis();
        System.out.println("\tArrays.sort() took:\t" + (end - start) + " ms");

        start = System.currentTimeMillis();
        sort(array);
        end = System.currentTimeMillis();
        if (Arrays.equals(array, copy)) {
          System.out.println("\tYour sort method took:\t" + (end - start) + " ms");
        } else {
          System.err.println("\tYour sort does not properly sort the array in ascending order!");
        }

        System.out.println();
      }
    }
  }
}
