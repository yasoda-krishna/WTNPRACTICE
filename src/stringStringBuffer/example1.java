package stringStringBuffer;

public class example1 {

		static boolean isPalindrome(String str) 
	    { 
	  
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	       
	            i++; 
	            j--; 
	        } 
	  

	        return true; 
	    } 
	  

	    public static void main(String[] args) 
	    { 
	        String str = "abba"; 
	  
	        if (isPalindrome(str)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
	    } 

	}

