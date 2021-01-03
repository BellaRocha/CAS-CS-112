/*
 * Student First Name: Isabella
 * Student Last Name: Rocha
 * Student BU Number: bellailr
 * Honor Code:
 */
 
package lab4;

import java.util.Arrays;
// so that we can print out arrays using Arrays.toString(...)

public class BigInt  { 
    
    public static final int SIZE = 20;      
    // length of arrays representing big ints
    
    public static final int[] NaBI = { -1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };  
    // error value
    
    public static int[] intToBigInt(int n) {
    	int flength = 20;
    	int [] a = new int [SIZE];
    	int lengthn = String.valueOf(n).length();
    	String b = Integer.toString(n);
    	if (lengthn > SIZE||n < 0) {
    		return NaBI;
    	}
    	for (int i = 0; i < b.length(); i++) {
    		char extra = b.charAt(i);
    		int integer = Character.getNumericValue(extra);
    		a[flength - b.length()] = integer;
    		flength++;
    	}
        return a;    
    }
    
    public static int[] stringToBigInt(String s) {
    	int i = 0;
    	int flength = 20;
    	int [] a = new int [SIZE];
    	int lengths = s.length();
    	for (int h = 0; h < s.length(); h++) {
    		char b = s.charAt(h);
    		if (Character.isLetter(b) == true) {
    			return NaBI;
    		}
    	}
    	if (lengths > SIZE) {
    		return NaBI;
    	}
    	int actualn = Character.getNumericValue(s.charAt(i));
    	while (i < lengths) {
    		if (actualn < 0 || actualn > 9) {
    			return NaBI;
    		}
    		else {
    			i++;
    		}
    	}
    	for (int j = 0; j < lengths; j++) {
    		char extra = s.charAt(j);
    		int integer = Character.getNumericValue(extra);
    		a[flength - s.length()] = integer;
    		flength++;
    	}
        return a;    // just to get it to compile
    }
    	
    public static String bigIntToString(int[] A) {
    	String b = "";
    	int right = 0;
        for (int i = 0; i < A.length; i++) {
        	if (Character.isLetter(A[i])||A[i] > 9||A[i] < 0) {
        		return "NaBI";
        	}
        	if (A[i] > 0 && A[i] < 9){
				right = i;
				break;
			}
        }
        String a = Arrays.toString(A);
        b = a.substring(right, a.length()-1);
        String d = b.replaceAll(",", "");
        String e = d.replaceAll(" ", "");
        e = e.replace("[", "");
        e = e.replace("]", "");
        for (int i = 0; i < e.length(); i++) {
        	if (e.charAt(i) != '0'){
				right = i;
				break;
			}
        	if (i == e.length()-1 && e.charAt(i) == '0') {
        		return "0";
        	}
        }
        String f = e.substring(right, e.length());
        return f;
    }
    
    // Compare the two big integers A and B and return -1, 0, or 1, depending
    //  on whether A < B, A == B, or A > B, respectively.
    
    public static int compareTo(int[] A, int[] B) {
    	int twenty = 20;
    	int largenuma = 0;
    	int largenumb = 0;
        for (int i = 0; i < twenty; i++) {
        	if (A[i] > 0) {
        		largenuma = i;
        	}
        	if (B[i] > 0) {
        		largenumb = i;
        	}
        	if (largenuma > largenumb) {
        		return 1;
        	}
        	if (largenuma < largenumb) {
        		return -1;
        	}
        	if(A[i] < B[i]) {
        		if(i == twenty - 1) {
        			return -1;
        		}
        		if (i == 0) {
        			return  -1;
        		}
        	}
        	if (A[i] > B[i]) {
        		if (i == twenty - 1) {
        			return 1;
        		}
        		if (i == 0) {
        			return  1;
        		}
        		return 1;
        	}
        	if (A[i] == B[i]) {
        		if(i == twenty - 1) {
        			return 0;
        		}
        	}
        }
        return 0;    // just to get it to compile 
   }

    
    // Add two big integers and return a new array representing their sum; if the result overflows,
    //   i.e., contains more than SIZE digits, return NaBI. 
    
	public static int[] mul(int[] A, int[] B) {
		int[] main = new int[20];
		int adder = 0;
		int perm = 0;
		int extra = 0;
		int f = 0;
		for (int i = 19; i >= 0; i--) {
			if (B[i] == 0){
				continue;
			}
			for (int j = 19; j >= 0; j--){
				if (A[j] == 0){
					continue;
				}
				f = j + i - 20 + 1; 
				if (f >= 20){ 
					return null;
				}
				main[f] = main[f] + A[j] * B[i];
				if (main[f] > 9){
					perm = main[f] % 10;
					extra = (main[f] - perm)/10;
					adder = extra;
					if (f > 0){
						main[f - 1] = main[f - 1] + adder;
					}
					main[f] = perm;
					if (f == 0){ 
						return null;
					}
				}
				else{
					adder = 0;
				}
			}
		}
		return main;
	}
	
    public static int[] add(int[] A, int[] B) {
    	int r = 19;
    	int additional = 0;
    	int [] last = new int [SIZE];
    	if (additional == 1) {
    		return NaBI;
    	}
    	while (r >=0) {
    		int added = A[r] + B[r];
    		if (additional == 1) {
    			added += 1;
    			additional = 0;
    		}
    		if (added > 9) {
    			additional = 1;
    			added -= 10;
    		}
    		last[r] = added;
    		r--;
    	}
    	int z = 0;
    	while (0 < last.length) {
    		if (last[z] == 0) {
    			z++;
    			if (z == last.length) {
    				return NaBI;
    			}
    		}
    		if (last[z] > 0) {
    			break;
    		}
    	}
        return last;    // just to get it to compile  
    }
    
}
