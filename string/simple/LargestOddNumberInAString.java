package in.dsa.string.simple;

public class LargestOddNumberInAString{
   

    public static void main(String[] args) {
        
        // Test cases
        System.out.println(largestOddNumber("52")); // Output: "5"
        System.out.println(largestOddNumber("4206")); // Output: ""
        System.out.println(largestOddNumber("35427")); // Output: "35427"
    }

	
	public static String largestOddNumber(String num){
        
		int n = num.length();
        
        // Traverse from right to left bcz largest num places at last. 
        for (int i = n-1; i>=0; i--)
            if(num.charAt(i)%2!=0)
                return num.substring(0, i + 1);//Found the first odd digit, return substring    
        
        
        return ""; // No odd number found
    }

}
