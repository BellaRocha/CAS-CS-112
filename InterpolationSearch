package hw1;
public class Question2 {

	public static boolean interpolationSearch(int[] a, int desiredItem)
	{
		int left = 0;
		int right = a.length-1;
		int counter = 0;
		int index = findIndex(a, left, right, desiredItem);
		while (left<=right) {
			counter ++;
			if (a[index] == desiredItem) {
				System.out.println("counter = " + counter);
				return true;
			}
			if (a[index] < desiredItem) {
				index = findIndex(a, left, right, desiredItem);
				left = index + 1;
			}
			if (a[index] > desiredItem) {
				index = findIndex(a, left, right, desiredItem);
				right = index -1;
			}
			System.out.println("counter: " +counter);
		}
		return false;	
	} 

	private static int findIndex(int[] a, int first, int last, int desiredItem) {
		double p = ((double)desiredItem - a[first]) / (a[last] - a[first]);
		int index = first + (int)Math.ceil((last - first) * p);
		if (index>last)
			return last;
		return index;
	}

	public static void main(String[] args) 
	{
		int a[] = {-10, -5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
					13, 14, 15, 16, 20, 34, 99, 100, 200, 10000};

		System.out.println("Searching the array");
		for (int element : a)
			System.out.print(element + " ");
		System.out.println();	
		System.out.println();

		if (Question2.interpolationSearch(a, 14)) 
			System.out.println("PASSES: 14 was found");
		else 
			System.out.println("FAILS: 14 was not found");
		
		if (Question2.interpolationSearch(a,-10)) 
			System.out.println("PASSES: -10 was found");
		else 
			System.out.println("FAILS: -10 was not found");

		if (Question2.interpolationSearch(a, 10000)) 
			System.out.println("PASSES: 10000 was found");
		else 
			System.out.println("FAILS: 10000 was not found");

		if (Question2.interpolationSearch(a, 200)) 
			System.out.println("PASSES: 200 was found");
		else 
			System.out.println("FAILS: 200 was not found");

		if (Question2.interpolationSearch(a, 23456)) 
			System.out.println("FAILS: 23456 was found");
		else 
			System.out.println("PASSES: 23456 was not found");

		if (Question2.interpolationSearch(a, -6)) 
			System.out.println("FAILS: -6 was found");
		else 
			System.out.println("PASSES: -6 was not found");

		if (Question2.interpolationSearch(a, 35)) 
			System.out.println("FAILS: 35 was found");
		else 
			System.out.println("PASSES: 35 was not found");
	}
} 
