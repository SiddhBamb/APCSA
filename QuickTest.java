import java.util.*;
public class QuickTest
{
	/*private static String[] sort(String[] array) {
		// base case
		if (array.length <= 1) return array;

		// select a pivot and create two sublists ("divide")
		// NOTE: pivot can be any element (I'll use the middle)
		String pivot = array[array.length / 2];
		//System.out.println(pivot);
		String[] left, right;
		ArrayList<String> left2 = new ArrayList<String>();
		ArrayList<String> right2 = new ArrayList<String>();
		for (String element : array)
		{
			//System.out.println(element.compareTo(pivot));
			if (element.compareTo(pivot) <=0)
				left2.add(element);
			else
				right2.add(element);
		}
		//System.out.println(left2 + " " + right2);
		left = new String[left2.size()];
		right = new String[right2.size()];
		left2.toArray(left);
		right2.toArray(right);
		//System.out.println(Arrays.toString(left) + " " + Arrays.toString(right));
		// recursively sort each sublist and return the
		// concatenated result ("conquer")
		//String[] pivot1 = {pivot};
		//String[] arrleft = sort(left);
		//String[] arrright = sort(right);
		//System.out.println(Arrays.toString(pivot1));
		//return concatenate(sort(left), pivot1, sort(right));
		return concatenate(sort(left), pivot, sort(right));
	}*/
	
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
	
	private static String[] concatenate(String[] arr1, String arr2, String[] arr3)
	{
		int alen = arr1.length;
		//int blen = arr2.length;
		int clen = arr3.length;
		String[] result = new String[alen+1+clen];
		//System.arraycopy(arr1, 0, result, 0, alen);
		//System.arraycopy(arr2, 0, result, alen, blen);
		//System.arraycopy(arr3, 0, result, blen, clen);
		for(int i = 0; i < arr1.length; i++)
		{
			result[i] = arr1[i];
		}
			result[arr1.length] = arr2;
		for(int i = 0; i < arr3.length; i++)
		{
			result[i+arr1.length+1] = arr3[i];
		}
		//System.out.println(Arrays.toString(result));
		return result;
	}

	public static void main(String[] args){
		String[] arr = {"ying", "yang", "yee", "peenor", "zebra", "alphabet", "ching"};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}