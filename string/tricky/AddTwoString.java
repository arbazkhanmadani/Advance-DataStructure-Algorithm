package in.dsa.string.tricky;

public class AddTwoString{
	
	
	 public static void main(String[] args) {
	      
		 	//Test cases
	        String num1 = "11";
	        String num2 = "123";
	        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + addStrings(num1, num2)); // Output: "134"
	        
	        num1 = "456";
	        num2 = "77";
	        System.out.println("Sum of " + num1 + " and " + num2 + " is: " +addStrings(num1, num2)); // Output: "533"
	 }
	
	 
    public static String addStrings(String num1, String num2) {
       
    	StringBuilder result = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        
        //Traverse both strings from right to left
        while(i>=0 || j>=0 || carry>0){
            
        	// Get the digits or 0 if index out of bounds
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            
            //Calculate sum of current digits and carry
            int sum = digit1 + digit2 + carry;
            
            //Update carry for next calculation
            carry = sum/10;
            
            //Append the current digit to result (as character)
            result.append(sum % 10);
            
            // Move to the next digits towards left
            i--;
            j--;
        }
        
        // Reverse the result to get the correct order
        return result.reverse().toString();
    }
    
   
}
