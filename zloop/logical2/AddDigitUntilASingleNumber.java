package in.dsa.zloop.logical2;

/**
Step-by-Step Process
Initial Number: 574632

Sum the Digits:

Add the digits of 574632: 
5+7+4+6+3+2=27
Sum the Resulting Digits:

Since 27 is not a single digit, add the digits of 27: 
2+7=9
The single-digit result is 9.

Verification Using Formula
To verify the result using the digital root formula:

result = 1+(num−1)%9
For num = 574632:
Compute 574632 − 1 = 574631 
Compute 574631 % 9 = 8
Comupute 1 + 8     = 9
*/
public class AddDigitUntilASingleNumber{

	public static void main(String[] args){
		int num = 574632;
        System.out.println(addDigits(num));
	}

	
	public static int addDigits(int num){
        
		if(num == 0) return 0;
        
        return 1 + (num-1)%9;
    }
}
