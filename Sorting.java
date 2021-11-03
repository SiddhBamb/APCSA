import java.util.*;

public class Sorting
{
	public static void main(String[] args)
	{
		//int x  = (int)(Math.random() * 20);
		int x = 10;
		int[] tester = new int[x];
		for(int i = 0; i < tester.length; i++)
		{
			//tester[i] = (int)(Math.random()*100);
			tester[i] = (int)(Math.random()*20)+1;
		}
		ArrayList<Integer> tester2 = new ArrayList<Integer>();
		for(int i = 0; i < x; i++)
		{
			//tester2.add((int)(Math.random() * 100));
			tester2.add((int)(Math.random()*20)+1);
		}
		/*System.out.println(Arrays.toString(tester));
		System.out.println();
		System.out.println(Arrays.toString(bubbleSort(tester)));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(tester2);
		System.out.println();
		System.out.println(bubbleSort(tester2));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(tester));
		System.out.println();
		System.out.println(Arrays.toString(selectionSort(tester)));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(tester2);
		System.out.println();
		System.out.println(selectionSort(tester2));*/
		System.out.println("ArrayList: " + tester2);
		System.out.println();
		System.out.println();
		System.out.println("Sorted ascending using bubbleSort: " + bubbleSort(tester2, true));
		System.out.println();
		System.out.println("Sorted descending using bubbleSort: " + bubbleSort(tester2, false));
		System.out.println();
		System.out.println();
		///System.out.println(tester2);
		System.out.println();
		System.out.println("Sorted ascending using selectionSort: " + selectionSort(tester2, true));
		System.out.println();
		System.out.println("Sorted descending using selectionSort: " + selectionSort(tester2, false));
		System.out.println("GapSort: Invented Sort: " + gapSort(tester2, true));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Array: " + Arrays.toString(tester));
		System.out.println();
		System.out.println("Sorted ascending using bubbleSort: " + Arrays.toString(bubbleSort(tester, true)));
		System.out.println();
		System.out.println("Sorted descending using bubbleSort: " + Arrays.toString(bubbleSort(tester, false)));
		System.out.println();
		System.out.println();
		///System.out.println(tester2);
		System.out.println();
		System.out.println("Sorted ascending using selectionSort: " + Arrays.toString(selectionSort(tester, true)));
		System.out.println();
		System.out.println("Sorted descending using selectionSort: " + Arrays.toString(selectionSort(tester, false)));
	}
	
	
	/*
	* Takes input of an ArrayList of Integers and a boolean, and sorts the given ArrayList in ascending order if the boolean is true, or in descending order if the boolean is false.
	* @param list the given ArrayList to be sorted
	* @param ascending input to choose the direction in which the ArrayList is sorted
	* @return the ArrayList, sorted in the specified order
	*/
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> input, boolean ascending)
	{
		//Better way: use if(ascending&&condition)
		ArrayList<Integer> list = new ArrayList<Integer>(input);
		int size = list.size();
		int temp;
		boolean swapped;
		
		//System.out.println(list);
		if(ascending)
		{
				for(int i = 0; i < size-1; i++)
				{
					swapped = false;
					for(int j = 0; j < size-i-1; j++)
					{
						if(list.get(j) > list.get(j+1))
						{
							temp = list.get(j);
							list.set(j, list.get(j+1));
							list.set(j+1, temp);
							swapped = true;
					
							//System.out.println(list);
							
						}
					}
					if(!swapped)
					{
						break;
					}
				}
				return list;
		}
		else
		{
			for(int i = 0; i < size-1; i++)
				{
					swapped = false;
					for(int j = 0; j < size-i-1; j++)
					{
						if(list.get(j) < list.get(j+1))
						{
							temp = list.get(j);
							list.set(j, list.get(j+1));
							list.set(j+1, temp);
							swapped = true;
					
							//System.out.println(list);
							
						}
					}
					if(!swapped)
					{
						break;
					}
				}
				return list; 
		}
	}
	
	
		/*
	* Takes input of an Array of Integers and a boolean, and sorts the given Array in ascending order if the boolean is true, or in descending order if the boolean is false.
	* @param inputList the given Array to be sorted
	* @param ascending input to choose the direction in which the Array is sorted
	* @return the Array, sorted in the specified order
	*/
	public static int[] bubbleSort(int[] inputList, boolean ascending)
	{
		int[] list = new int[inputList.length];
		for(int i = 0; i < inputList.length; i++)
		{
			list[i] = inputList[i];
		}
		int temp;
		int size = list.length;
		boolean swapped;
		int minIDX;
		
		//System.out.println(list);
		if(ascending)
		{
				for(int i = 0; i < size-2; i++)
				{
					swapped = false;
					for(int j = 0; j < size-i-1; j++)
					{
						if(list[j] > list[j+1])
						{
							temp = list[j];
							list[j] = list[j+1];//.set(i, list.get(minIDX));
							list[j+1] = temp;//.set(minIDX, temp);
							swapped = true;
					
							//System.out.println(list);
							
						}
					}
					if(!swapped)
					{
						break;
					}
				}
				return list;
		}
		else
		{
			for(int i = 0; i < size-2; i++)
				{
					swapped = false;
					for(int j = 0; j < size-i-1; j++)
					{
						if(list[j] < list[j+1])
						{
							temp = list[j];
							list[j] = list[j+1];//.set(i, list.get(minIDX));
							list[j+1] = temp;//.set(minIDX, temp);
							swapped = true;
					
							//System.out.println(list);
							
						}
					}
					if(!swapped)
					{
						break;
					}
				}
				return list; 
		}
	}
	
	
	
	/*
	* Takes input of an ArrayList of Integers and a boolean, and sorts the given ArrayList in ascending order if the boolean is true, or in descending order if the boolean is false.
	* @param inputList the given ArrayList to be sorted
	* @param ascending input to choose the direction in which the ArrayList is sorted
	* @return the ArrayList, sorted in the specified order
	*/
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> inputList, boolean ascending)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(inputList);
		int size = list.size();
		int temp;
		boolean swapped;
		int minIDX;
		if(ascending)
		{
				for(int i = 0; i < size-1; i++)
				{
						minIDX = i;
						for(int j = i+1; j < size-1; j++)
						{
							if(list.get(j) < list.get(minIDX))
							{
								minIDX = j;
							}
						}
						if(minIDX != i)
						{
							temp = list.get(i);
							list.set(i, list.get(minIDX));
							list.set(minIDX, temp);
				
							//System.out.println(list);
				
						}
				}
				return list;
		}
		else
		{
				for(int i = 0; i < size-1; i++)
				{
						minIDX = i;
						for(int j = i; j < size; j++)
						{
							if(list.get(j) > list.get(minIDX))
							{
								minIDX = j;
							}
						}
						if(minIDX != i)
						{
							temp = list.get(i);
							list.set(i, list.get(minIDX));
							list.set(minIDX, temp);
				
							//System.out.println(list);
						}
				}
				return list;
		}
	}
	
	/*
	* Takes input of an Array of integers and a boolean, and sorts the given Array in ascending order if the boolean is true, or in descending order if the boolean is false.
	* @param inputList the given Array to be sorted
	* @param ascending input to choose the direction in which the ArrayList is sorted
	* @return the Array, sorted in the specified order
	*/
	public static int[] selectionSort(int[] inputList, boolean ascending)
	{
		int[] list = new int[inputList.length];
		for(int i = 0; i < inputList.length; i++)
		{
			list[i] = inputList[i];
		}
		int temp;
		int size = list.length;
		boolean swapped;
		int minIDX;
		if(ascending)
		{
				for(int i = 0; i < size-1; i++)
				{
						minIDX = i;
						for(int j = i+1; j < size-1; j++)
						{
							if(list[j] < list[minIDX])
							{
								minIDX = j;
							}
						}
						if(minIDX != i)
						{
							temp = list[i];
							list[i] = list[minIDX];//.set(i, list.get(minIDX));
							list[minIDX] = temp;//.set(minIDX, temp);
				
							//System.out.println(list);
				
						}
				}
				return list;
		}
		else
		{
				for(int i = 0; i < size-1; i++)
				{
						minIDX = i;
						for(int j = i; j < size; j++)
						{
							if(list[j] > list[minIDX])
							{
								minIDX = j;
							}
						}
						if(minIDX != i)
						{
							temp = list[i];
							list[i] = list[minIDX];//.set(i, list.get(minIDX));
							list[minIDX] = temp;//.set(minIDX, temp);
				
							//System.out.println(list);
						}
				}
				return list;
		}
	}
	
	
	
	
	
	/*
	* Takes input of an ArrayList of Integers and a boolean, and sorts the given ArrayList in ascending order if the boolean is true, or in descending order if the boolean is false.
	* @param inputList the given ArrayList to be sorted
	* @param ascending input to choose the direction in which the ArrayList is sorted
	* @return the ArrayList, sorted in the specified order
	*/
	public static ArrayList<Integer> gapSort(ArrayList<Integer> inputList, boolean ascending)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(inputList);
		int temp;
		int idx;
		list.add(0, Integer.MIN_VALUE);
		list.add(Integer.MAX_VALUE);
		int size = list.size();
		list.remove(0);
		list.remove(list.size()-1);
		int num1;
		int num2;
		while(!isSortedAscending(list))
		{
		list.add(0, Integer.MIN_VALUE);
		list.add(Integer.MAX_VALUE);
		if(ascending)
		{
			for(int i = 0; i < size-1; i++)
			{
				num1 = list.get(i);
				num2 = list.get(i+1);
				for(int j = 0; j < size; j++)
				{
					if(list.get(j)>num1 && list.get(j)<num2)
					{
						list.add(i+1, list.remove(j));
						//System.out.println(num1 + " " + num2);
						//System.out.println(list);
					}
				}
			}
		}
		list.remove((Integer)Integer.MAX_VALUE);
		list.remove((Integer)Integer.MIN_VALUE);
		}
		
		//System.out.println(list);
		return list;
	}
	
	public static boolean isSortedAscending(ArrayList<Integer> arr)
	{
		for(int i = 0; i < arr.size()-1; i++)
		{
			if(arr.get(i) > arr.get(i+1)) return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int[] bubbleSort(int[] input)
	{
		int[] list = new int[input.length];
		for(int i = 0; i < input.length; i++)
		{
			list[i] = input[i];
		}
		int temp;
		int size = list.length;
		boolean swapped;
		
		System.out.println(Arrays.toString(list));
		
		for(int i = 0; i < size-2; i++)
		{
			swapped = false;
			for(int j = 0; j < size-i-1; j++)
			{
				if(list[j] > list[j+1])
				{
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					swapped = true;
					
					System.out.println(Arrays.toString(list));
					
				}
			}
			if(!swapped)
			{
				break;
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> input)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(input);
		int size = list.size();
		int temp;
		boolean swapped;
		
		System.out.println(list);
		
		for(int i = 0; i < size-2; i++)
		{
			swapped = false;
			for(int j = 0; j < size-i-1; j++)
			{
				if(list.get(j) > list.get(j+1))
				{
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
					swapped = true;
					
					System.out.println(list);
					
				}
			}
			if(!swapped)
			{
				break;
			}
		}
		return list;
	}
	
	public static int[] selectionSort(int[] input)
	{
		int[] list = new int[input.length];
		for(int i = 0; i < input.length; i++)
		{
			list[i] = input[i];
		}
		int size = list.length;
		int temp;
		boolean swapped;
		int minIDX;
		for(int i = 0; i < size-1; i++)
		{
			minIDX = i;
			for(int j = i+1; j < size-1; j++)
			{
				if(list[j] < list[minIDX])
				{
					minIDX = j;
				}
			}
			if(minIDX != i)
			{
				temp = list[i];
				list[i] = list[minIDX];
				list[minIDX] = temp;
				
				System.out.println(Arrays.toString(list));
				
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> input)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(input);
		int size = list.size();
		int temp;
		boolean swapped;
		int minIDX;
		for(int i = 0; i < size-1; i++)
		{
			minIDX = i;
			for(int j = i+1; j < size-1; j++)
			{
				if(list.get(j) < list.get(minIDX))
				{
					minIDX = j;
				}
			}
			if(minIDX != i)
			{
				temp = list.get(i);
				list.set(i, list.get(minIDX));
				list.set(minIDX, temp);
				
				System.out.println(list);
				
			}
		}
		return list;
	}
}