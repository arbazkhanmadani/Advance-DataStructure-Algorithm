package in.dsa.zloop.logical2;

public class PerfectNum{

	public static void main(String[] args){  

		// perfect num : 1+2+3 = 6 the sum of the factors of a num = to itself excluded it.
		int number = 28; // Example input
        boolean result = isPerfect(number);
        System.out.println(number + " is a perfect number: " + result);
        System.out.println(Math.sqrt(28));
        
	}



	public static boolean isPerfect(int num) {
    
		if (num <= 1) return false; // 1 and negative numbers are not perfect
    
		int sum = 0;
		//Find all divisors from 1 to sqrt(num)
		for(int i = 1; i <= Math.sqrt(num); i++){
        
			if(num%i==0){
            
				//i is a divisor
				if(i!=num) {
					// Exclude the number itself
					sum+=i;
					//System.out.println("sum in if 1 : "+sum);
				// num / i is also a divisor
				}if(i!=1 && i!=num/i && num/i!=num){
					sum += num/i;
					//System.out.println("sum in if 2 : "+sum);
				}
				
			}
		}
    
    
		// Check if sum of proper divisors equals the number
		return sum == num;
	}
	
}