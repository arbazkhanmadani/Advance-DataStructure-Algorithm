package in.dsa.zloop.logical2;

public class CountFirstAndLastDigit{

	
	public static void main(String[] args){

		int result1 = firstDigit(32345);
		int result2 = lastDigit(32345);

		System.out.println("First digit is : "+result1+" and last digit is : "+result2);
	}

	public static int firstDigit(int a){

		for(int i =0; a>10; i++){                // a>10 bcz  after number of division d number will be 0 so preventing from this                                                        //n getting Last digit we take this "a>10" condition..... 
			a/=10;      
		}
	
		return a; 
	}


	public static int lastDigit(int a){

		a = a%10;

		return a;
	}



}