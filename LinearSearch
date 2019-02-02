package Lectures;
public class LinearSearch {
	
	public static boolean PLS(int[] items, int itemToSearchFor){
		int index = 0; 
		int lengthA = items.length;
		int counter = 0;
		while (index<lengthA) {
			counter ++;
			if(items[index]==itemToSearchFor) {
				System.out.println("counter = " + counter);
				return true;
			}
			index++;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int target = 3;
		System.out.println(LinearSearch.PLS(A, target));
	}
	
}
