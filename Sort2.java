import java.util.*;
import java.io.*;

public class Sort2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("small_descending.txt"));
		int numlines = scan.nextInt();
		String[] arr = new String[numlines];
		for(int i = 0; i < numlines; i++)
		{
			arr[i] = scan.next();
		}
		System.out.println(Arrays.toString(arr));
		sort(arr);
		
		String[] arr2 = new String[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		
		String[] arr3 = new String[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr3[i] = arr[i];
		}
		
		Arrays.sort(arr2);
		//sort2(arr3);
		boolean bool = Arrays.equals(arr, arr2);
		System.out.println(arr.length + " " + bool);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	private static void sort(String[] list) {
		/*String[] list = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			list[i] = array[i];
		}*/
		//System.out.println(Arrays.toString(list));
		int size = list.length;
		String temp;
		int minIDX;
		for(int i = 0; i < size-1; i++)
		{
			minIDX = i;
			//System.out.println("i value " + i);
			for(int j = i+1; j < size; j++)
			{
				//System.out.println("j value " + j);
				if(list[j].compareTo(list[minIDX]) <= 0)
				{
					minIDX = j;
					//System.out.println("minidx changed " + j);
				}
			}
			if(minIDX != i)
			{
				//System.out.println("lkjdlakjdf " + list[i] + " " + list[minIDX] + " " + i + " " + minIDX);
				temp = list[i];
				list[i] = list[minIDX];
				list[minIDX] = temp;
				
				//System.out.println(Arrays.toString(list));
				
			}
		}
		//array = list;
	}
	
	void sort2(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}