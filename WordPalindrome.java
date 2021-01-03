package hw2;
/*
 * Your First Name: Isabella
 * Your Last Name: Rocha
 * Your BU username: bellailr
 * 
 * Honor Code: 
 * 
 */
import java.util.Scanner;

public class WordPalindrome { 
	/*
     * TODO: Complete this method as per the requirements of the assignment handout. 
     * Make sure not to change the function signature. 
     */
    public static boolean isWordPalindrome( String line ) 
    {
    	
    	/*We are providing you with a list of punctuations that we will use to test your code.
    	 * make sure that you use this same list of punctuations only and not something else.  
    	 */
    	
    	char[] punctuation = { '.', ',', ';', ':', '?', '/', '\'', '\'', '!', '-', '~', '(', ')' };
    	char[] lchar = line.toCharArray();
    	int plength = punctuation.length;
    	int llength = lchar.length;
    	for (int a = 0; a < llength; a++) {
    		for (int b = 0; b < plength; b++) {
    			if (lchar[a] == punctuation[b]) {
    				lchar[a] = ' ';
    			}
    			else {
    				continue;
    			}
    		}
    	}
    	String sline = new String (lchar);
    	sline = sline.replaceAll(" ", "");
    	sline = sline.toLowerCase();
    	char [] finalline = sline.toCharArray();
    	int nfllength = finalline.length;
    	int middle = nfllength/2;
    	int nmiddle = (int) middle;	
    	int right = nfllength - 1;
    	int left = 0;
    	while (left < nmiddle && right > nmiddle) {
    		if (finalline[left] == finalline [right]) {
    			left ++;
    			right --;
    		}
    		else {
    			return false;
    		}
    	}
    	return true;
    } 
    
    	
    	
    	
    	
    	
    	

	/*
	 * DO NOT MODIFY THE MAIN FUNCTION.
	 * ANY CODE THAT YOU WRITE, MUST BE 
	 * INSIDE THE isWordPalindrome function. 
	 * Any code that you write inside the main 
	 * function will not be marked and will be completely ignored. 
	 */
    public static void main(String[] args) {
        
        // Print out welcome message
        System.out.println("\nWelcome to the Word Palindrome Test Program!");
        
        // Define a scanner for user input
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nType in a sentence to be tested or Control-d to end:"); 
        
        while(userInput.hasNextLine()) {
            
            String line = userInput.nextLine();
            
            if(isWordPalindrome( line )) 
                System.out.println("Word Palindrome!");
            else
                System.out.println("Not a Word Palindrome!");
        }
        
        System.out.println("bye!");
    } // main() 

} 
