package in.dsa.string.tricky;

import java.util.HashMap;

public class LongestPalindrome {
   

    public static void main(String[] args) {
        
    	LongestPalindrome solution = new LongestPalindrome();
        
        // Example 1:
        String s1 = "abccccdd";
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + solution.longestPalindrome(s1)); // Expected: 7
        
        // Example 2:
        String s2 = "aabbcc";
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: " + solution.longestPalindrome(s2)); // Expected: 6
        
        // Example 3:
        String s3 = "abc";
        System.out.println("Input: s = \"" + s3 + "\"");
        System.out.println("Output: " + solution.longestPalindrome(s3)); // Expected: 1
    }

    
	public int longestPalindrome(String s) {
        
		HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray())
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        
        
        //System.out.println(charCount);
        
        int length = 0;
        boolean hasOddCount = false;
        
        // Calculate the length of the longest palindrome
        for(int count : charCount.values()) {
           
        	if(count%2 == 0)
                length += count; // Add all even counts
        	else{
                length += count - 1; // Add the largest even number less than the odd count
                hasOddCount = true; // We can have one odd character in the center
            }
        }
        
        // If there is at least one character with an odd frequency, we can place one in the center
        if (hasOddCount) 
            length += 1;
        
        return length;
    }
	

}

