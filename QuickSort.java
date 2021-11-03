import java.io.*;
import java.util.*;

public class QuickSort {

	/**
	* Sorts the given array in ascending order.
	* DO NOT MODIFY THIS METHOD SIGNATURE.
	* @param array The array to be sorted.
	* @return The sorted array.
	*/
	private static String[] sort(String[] arr)
	{
		// base case
		if (arr.length <= 1) return arr;

		// select a pivot and create two sublists ("divide")
		// NOTE: pivot can be any element (I'll use the middle)
		String pivot = arr[arr.length / 2];
		ArrayList<String> left1 = new ArrayList<String>();
		ArrayList<String> right1 = new ArrayList<String>();
		for (String element : arr)
		{
			if (element .compareTo( pivot ) < 0)
				left1.add(element);
			else if(element.compareTo(pivot)>0)
				right1.add(element);
		}
		String[] left = new String[left1.size()];
		for(int i = 0; i < left.length; i++)
		{
			left[i] = left1.get(i);
		}
		String[] right = new String[right1.size()];
		for(int i = 0; i < right.length; i++)
		{
			right[i] = right1.get(i);
		}
		// recursively sort each sublist and return the
		// concatenated result ("conquer")
		//return concatenate(sort(left) , pivot , sort(right));
		String[] result = new String[arr.length];
		ArrayList<String> res = new ArrayList<String>();
		res.addAll(Arrays.asList(sort(left)));
		res.add(pivot);
		res.addAll(Arrays.asList(sort(right)));
		res.toArray(result);
		//System.out.println(Arrays.toString(result));
		for(int i = 0; i < result.length; i++)
		{
			arr[i] = result[i];
		}
		return result;
	}
	
	/*private static String[] sort(String[] array) {
		// base case
		if (array.length <= 1) return array;

		// select a pivot and create two sublists ("divide")
		// NOTE: pivot can be any element (I'll use the middle)
		String pivot = array[array.length / 2];
		String[] left, right;
		ArrayList<String> left2 = new ArrayList<String>();
		ArrayList<String> right2 = new ArrayList<String>();
		for (String element : array)
		{
			if (element.compareTo(pivot) <=0)
				left2.add(element);
			else
				right2.add(element);
		}
		left = new String[left2.size()];
		right = new String[right2.size()];
		left2.toArray(left);
		right2.toArray(right);
		// recursively sort each sublist and return the
		// concatenated result ("conquer")
		String[] pivot1 = {pivot};
		return concatenate(sort(left), pivot1, sort(right));
	}
	
	private static String[] concatenate(String[] arr1, String[] arr2, String[] arr3)
	{
		int alen = arr1.length;
		int blen = arr2.length;
		int clen = arr3.length;
		String[] result = new String[alen+blen+clen];
		System.arraycopy(arr1, 0, result, 0, alen);
		System.arraycopy(arr2, 0, result, alen, blen);
		System.arraycopy(arr3, 0, result, blen, clen);
		return result;
	}*/


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
        String[] sortedArray = sort(array);
        end = System.currentTimeMillis();
        if (Arrays.equals(sortedArray, copy)) {
          System.out.println("\tYour sort method took:\t" + (end - start) + " ms");
        } else {
          System.err.println("\tYour sort does not properly sort the array in ascending order!");
        }

        System.out.println();
      }
    }
  }
}
