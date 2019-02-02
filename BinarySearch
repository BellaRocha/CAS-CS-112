package Lectures;

public class BinarySearch {

	public static boolean PBS (int[] items, int target) {
		int left = 0;
		int right = items.length-1;
		int counter = 0;
		while (left<=right) {
			int middle = (left + right)/2;
			counter ++;
			if (items[middle] == target) {
				System.out.println("counter = " + counter);
				return true;
			}
			if (items[middle]<target) {
				left = middle + 1;
			}
			if (items[middle]>target) {
				right = middle -1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = {5,6,7,8,9};
 		int target = 7;
		boolean exit = BinarySearch.PBS(a, target);
		System.out.println(exit);
		
	}

}
