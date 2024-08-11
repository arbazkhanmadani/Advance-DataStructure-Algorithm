package in.dsa.zloop.logical2;

//palindrome number =>if reverse of a num = num i,e. 121=121, 244442=244442......
//reverse num=> 1234 =4321..........
public class PelindromeORreverseNum{
	

	public static void main(String[] args){

		int num = -121;
		int rev = reverse(-121);
		            
		if(num==rev){
			System.out.println(rev+" is a pelindrome number");
		}
		else{
			System.out.println(rev+" is not a pelindrome number");
		}



	}
    
    public static int reverse(int x) {
            
    	int reversed = 0;
            
    	int sign = (x < 0) ? -1 : 1; // Determine the sign of the input
            
    	x = Math.abs(x); // Work with the absolute value of x
            
            
    	while (x != 0) {
                
    		int pop = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit from x
                
           // Check for overflow before it happens
           if (reversed > (Integer.MAX_VALUE - pop) / 10) {
                return 0; // Return 0 in case of overflow
           }
                
          reversed = reversed * 10 + pop; // Append the digit
       }
            
        System.out.println(Integer.MAX_VALUE );
    	return sign * reversed; // Reapply the original sign
   }
  
}