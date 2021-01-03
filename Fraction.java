package hw2;

/*
 * Your First Name: Isabella
 * Your Last Name: Rocha
 * Your BU username: bellailr
 * 
 * Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I have also 
// read the collaboration policy on the course syllabus for 
// CS 112 and my program adheres and is consistent with the 
// course syllabus.
 * 
 */
public class Fraction
{
	private	int numerator;
	private	int denominator;

	/*
	 * DO NOT MODIFY THIS CONSTRUCTOR. 
	 * We have already completed this method for you. 
	 * We have set the numerator to 0 and the denominator to 1
	 */
	public Fraction()
	{
		numerator=0;
		denominator=1;
	} // end default constructor

	
	/*
	 * TODO: Refer to the earlier constructor to help you complete this. 
	 * 1. If the initialDenominator is 0, then you must set it to 1. This is not ideal, and
	 * a more ideal solution would throw an exception. However, we have't looked at 
	 * exceptions, and I ask you instead to simply set the denominator of your fraction to 1
	 * only if the initialDenominator is 0.
	 * 
	 * 2. At the very end you must call the methods adjustSigns() and reduceToLowestTerms(). 
	 * The method reduceToLowestTerms() has been already completed for you. However, you must
	 * complete the method adjustSigns(). 
	 */
	public Fraction(int initialNumerator, int initialDenominator)
	{
		if (initialDenominator == 0) {
			initialDenominator = 1;
		}
		numerator = initialNumerator;
		denominator = initialDenominator;
		adjustSigns();
		reduceToLowestTerms();
	}// end constructor


	/*
	 * TODO: You must simply return back the numerator of your fraction. 
	 * This method must contain only 1 line of code inside its body 
	 */
	public int getNumerator()
	{
		return numerator;

	} // end getNumerator

	
	/*
	 * TODO: You must simply return back the denominator of your fraction. 
	 * This method must contain only 1 line of code inside its body 
	 */
	public int getDenominator()
	{
		return denominator;
	} // end getDenominator


	
	/*
	 * TODO: The add method must return back a new fraction which is represented
	 * as the addition of the two fractions i.e., this AND operand.
	 * Here is how you add two fractions: 
	 * a/b + c/d is (ad + cb)/(bd) 
	 *  
	 */
	public Fraction add(Fraction operand)
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = operand.getNumerator();
		int d = operand.getDenominator();
		int n = a * d + c * b;
		int z = b * d;
		return new Fraction (n, z);	
	} // end add

	
	/*
	 * TODO: The subtract method must return back a new fraction which is represented
	 * as the subtraction of the two fractions i.e., this AND operand.
	 * Here is how you add two fractions: 
	 * a/b - c/d is (ad - cb)/(bd) 
	 *  
	 */
	public Fraction subtract(Fraction operand)
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = operand.getNumerator();
		int d = operand.getDenominator();
		int n = a * d - c * b;
		int z = b * d;
		return new Fraction (n, z);
	} // end subtract


	/*
	 * TODO: The multiply method must return back a new fraction which is represented
	 * as the subtraction of the two fractions i.e., this AND multiplier.
	 * Here is how you add two fractions: 
	 * a/b * c/d is (ac)/(bd) 
	 *  
	 */
	public Fraction multiply(Fraction multiplier)
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = multiplier.getNumerator();
		int d = multiplier.getDenominator();
		int n = a * c; 
		int z = b * d;
		return new Fraction (n, z);
	} // end multiply

	
	/*
	 * TODO: The divide method must return back a new fraction which is represented
	 * as the subtraction of the two fractions i.e., this AND divisor.
	 * Here is how you add two fractions: 
	 * (a/b) / (c/d) is (ad)/(bc)
	 * The divide method must make use of the getReciprocal on the divisor 
	 * and the multiply method. 
	 *  
	 */
	public Fraction divide(Fraction divisor)
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = divisor.getNumerator();
		int d = divisor.getDenominator();
		int n = a * d; 
		int z = b * c;
		return new Fraction (n, z);
	} // end divide


	public Fraction getReciprocal() 
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		return new Fraction (b, a);	
	} // end getReciprocal

	/* TODO: If fraction this>other then return back +1
	 *       if fraction this==other then return back 0
	 *       if fraction this<other then return back -1
	 */
	
	public int compareTo(Fraction other)
	{
		int a = this.getNumerator();
		int b = this.getDenominator();
		int c = other.getNumerator();
		int d = other.getDenominator();
		if (a/b > c/d) {
			return 1;
		}
		if (a/b == c/d) {
			return 0;
			
		}
		return -1;
	} // end compareTo

	
	/*
	 * DO NOT MODIFY THIS METHOD
	 * Returns back the textual representation of Fraction. 
	 */
	public String toString()
	{
		return numerator + "/" + denominator;
	} // end toString

	
	/*
	 * DO NOT MODIFY THIS METHOD
	 * Reduces a fraction to lowest terms.
	 */
	private void reduceToLowestTerms()
	{
		int gcd = greatestCommonDivisor(Math.abs(numerator), Math.abs(denominator));

		numerator = numerator / gcd;
		denominator = denominator / gcd;
	} // end reduceToLowestTerms

	
	/*
	 * DO NOT MODIFY THIS METHOD
	 * Returns the greatest common divisor of two integers.
	 */
	private int greatestCommonDivisor(int integerOne, int integerTwo)
	{
		int result;

		if (integerOne % integerTwo == 0)
			result = integerTwo;
		else
			result = greatestCommonDivisor(integerTwo, integerOne % integerTwo);

		return result;
	}	// end greatestCommonDivisor

	
	
	/*
	 * DO NOT MODIFY THIS METHOD. 
	 * We have completed the setSign method for you. 
	 * This method takes in a character i.e., `-' and 
	 * it simply sets it. So for example, if you have a fraction
	 * 3/2, and by calling setSign by passing in `-',
	 * it would simply make it -3/2. If the fraction is -3/2, and 
	 * you call the setSign by passing in `-', then the fraction continues to 
	 * remain -3/2. If you have -3/2, and pass in `+', then the fraction becomes
	 * 3/2. This method is called from adjustSigns(). 
	 */
	public void setSign(char sign)
	{
		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);

		if (sign == '-')
			numerator = -numerator;
	} // end setSign
	
	
	/*
	 * TODO: Adjusts the signs of the numerator and denominator so that the
	 * numerator's sign is the sign of the fraction and the denominator's
	 * sign is +. You will call the method adjustSigns() from the Fraction
	 * constructor. 
	 */
	 
	private void adjustSigns()
	{
		if (denominator < 0){
			denominator = denominator * -1;
			numerator = numerator * -1;
		} 
	} // end adjustSigns 
	
	
	
	
	/*
	 * You can modify the main function in any way you like. 
	 * We will not mark the main function. However, we have provided
	 * some code in the main function that you can use to test your 
	 * code out. Feel free, to add some of your own test cases as 
	 * well to test your code out. 
	 */
	public static void main(String[] args)
	{
		
		System.out.println("----------TESTING CONSTRUCTORS--------------");
		Fraction n1=new Fraction(1,2);
		System.out.println(n1);  //MUST PRINT BACK 1/2
		
		Fraction n2=new Fraction(4,8);
		System.out.println(n2); //MUST PRINT BACK 1/2
		
		Fraction n3=new Fraction(20,0);
		System.out.println(n3); //MUST PRINT BACK 20/1
		
		Fraction n4=new Fraction(10,100);
		System.out.println(n4); //MUST PRINT BACK 1/10
		
		Fraction n5=new Fraction(7,8);
		System.out.println(n5); //MUST PRINT BACK 7/8
				
		System.out.println("----------TESTING GET DENOMINATOR--------------");
		System.out.println(n1.getDenominator()); //MUST PRINT BACK 2
		System.out.println(n2.getDenominator()); //MUST PRINT BACK 2
		System.out.println(n3.getDenominator()); //MUST PRINT BACK 1
		System.out.println(n4.getDenominator()); //MUST PRINT BACK 10
		System.out.println(n5.getDenominator()); //MUST PRINT BACK 8
		System.out.println("-------TESTING GET NUMERATOR-----------------");
		
		System.out.println(n1.getNumerator()); //MUST PRINT BACK 1
		System.out.println(n2.getNumerator()); //MUST PRINT BACK 1
		System.out.println(n3.getNumerator()); //MUST PRINT BACK 20
		System.out.println(n4.getNumerator()); //MUST PRINT BACK 1
		System.out.println(n5.getNumerator()); //MUST PRINT BACK 7
		
		System.out.println("---------TESTING MORE CONSTRUCTORS---------------");
		
		Fraction n6=new Fraction(-7,8);
		System.out.println(n6); //MUST PRINT BACK -7/8
		
		Fraction n7=new Fraction(-7,-8);
		System.out.println(n7); //MUST PRINT BACK 7/8
		
		Fraction n8=new Fraction(7,-8);
		System.out.println(n8); //MUST PRINT BACK -7/8
		
		System.out.println("------------TESTING ADDING------------");
		
		Fraction n9=n1.add(n2);  //adding 1/2 + 1/2
		System.out.println(n9); //MUST PRINT BACK 1/1
		
		Fraction n10=n3.add(n4);  //adding 20/1 + 1/10
		System.out.println(n10); //MUST PRINT BACK 201/10
		
		Fraction n11=n6.add(n8);  
		System.out.println(n11); //MUST PRINT BACK -7/4
		
		System.out.println("--------TESTING SUBTRACTION----------------");
		Fraction n12=n1.subtract(n2);  
		System.out.println(n12); //MUST PRINT BACK 0/1
		
		Fraction n13=n3.subtract(n4);  
		System.out.println(n13); //MUST PRINT BACK 199/10
		
		Fraction n14=n6.subtract(n8);  
		System.out.println(n14); //MUST PRINT BACK 0/1
		
		
		System.out.println("---------TESTING MULTIPLY---------------");
		Fraction n15=n1.multiply(n2);  
		System.out.println(n15); //MUST PRINT BACK 1/4
		
		Fraction n16=n3.multiply(n4);  
		System.out.println(n16); //MUST PRINT BACK 2/1
		
		Fraction n17=n6.multiply(n8);  
		System.out.println(n17); //MUST PRINT BACK 49/64
		
		System.out.println("---------TESTING GET RECIPROCAL---------------");
		
		  
		System.out.println(n1.getReciprocal()); //MUST PRINT BACK 2/1
		System.out.println(n1); //MUST PRINT BACK 1/2
		
		System.out.println(n2.getReciprocal()); //MUST PRINT BACK 2/1
		System.out.println(n2); //MUST PRINT BACK 1/2
		
		System.out.println(n3.getReciprocal()); //MUST PRINT BACK 1/20
		System.out.println(n3); //MUST PRINT BACK 20/1
		
		
		System.out.println(n4.getReciprocal()); //MUST PRINT BACK 10/1 
		System.out.println(n4); //MUST PRINT BACK 1/10
		
		System.out.println(n5.getReciprocal()); //MUST PRINT BACK 8/7
		System.out.println(n5); //MUST PRINT BACK 7/8
		
		System.out.println("---------TESTING DIVIDE---------------");
		Fraction n18=n1.divide(n2);  
		System.out.println(n18); //MUST PRINT BACK 1/1
		
		Fraction n19=n3.divide(n4);  
		System.out.println(n19); //MUST PRINT BACK 200/1
		
		Fraction n20=n6.divide(n8);  
		System.out.println(n20); //MUST PRINT BACK 1/1
		
		
		System.out.println("---------TESTING COMPARE TO---------------");
		System.out.println(n1.compareTo(n2)); //MUST PRINT BACK 0
		System.out.println(n3.compareTo(n4)); //MUST PRINT BACK 1
		System.out.println(n6.compareTo(n8)); //MUST PRINT BACK 0
		System.out.println(n4.compareTo(n3)); //MUST PRINT BACK -1
		System.out.println(n8.compareTo(n6)); //MUST PRINT BACK 0
	}
	
} 
