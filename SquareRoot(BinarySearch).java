package hw1;

public class Question1 {
	
		  public static int squareRoot(int n) 
		  {
			  int left = 0;
			  int right = n;
			  double middle = (left + right)/2;
			  int nmiddle = (int) middle;
			  while (left<=right) {
				  if (nmiddle * nmiddle < n) {
					left = nmiddle + 1;  
					nmiddle = (left + right)/2;
			      }
				  if (nmiddle * nmiddle > n) {
					  right = nmiddle - 1;
					  nmiddle = (left + right)/2;
				  }
				  if (nmiddle * nmiddle == n) {
					  return nmiddle;
				  }
			  }
			  return nmiddle;
		  }
		  
		  public static void main(String[] args) 
		  {
			  
			  System.out.println(Question1.squareRoot(1));  
			  System.out.println(Question1.squareRoot(2));  
			  System.out.println(Question1.squareRoot(3));   
			  System.out.println(Question1.squareRoot(4));   
			  System.out.println(Question1.squareRoot(5));  
			  System.out.println(Question1.squareRoot(6));  
			  System.out.println(Question1.squareRoot(7)); 
			  System.out.println(Question1.squareRoot(8)); 
			  System.out.println(Question1.squareRoot(9));  
			  System.out.println(Question1.squareRoot(10));  
			  System.out.println(Question1.squareRoot(11));  
			  System.out.println(Question1.squareRoot(12));  
			  System.out.println(Question1.squareRoot(13)); 
			  System.out.println(Question1.squareRoot(14));  
			  System.out.println(Question1.squareRoot(15)); 
			  System.out.println(Question1.squareRoot(16)); 
			  System.out.println(Question1.squareRoot(17));
			  System.out.println(Question1.squareRoot(18)); 
			  System.out.println(Question1.squareRoot(19));
			  System.out.println(Question1.squareRoot(20));  
			  System.out.println(Question1.squareRoot(21)); 
			  System.out.println(Question1.squareRoot(22));  
			  System.out.println(Question1.squareRoot(23));
			  System.out.println(Question1.squareRoot(24)); 
			  System.out.println(Question1.squareRoot(25)); 
		      System.out.println(Question1.squareRoot(256)); 
		  }
}
