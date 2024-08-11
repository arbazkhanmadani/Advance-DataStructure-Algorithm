package in.dsa.zloop.logical2;

public class LoopPractice4 {

	public static void main(String[] args) {

		
	/*//Question 8.to find the first and last digit of a number
	 int rem1 = 0;
	 int fdigit1 = 0;
	 int num1 = 12345;
	 int temp1 = num1;
	 for(; num1>0; num1 = num1/10){
			rem1 = num1%10;
			if(temp1==num1){
			fdigit1 = rem1;
			}
	}
		System.out.println(rem1);
		System.out.println(fdigit1);
		
		
	
		
   //Question 9.to find sum of first and last digit of a number	
	int rem2 = 0;
	int fdigit2 = 0;
	int num2 = 1234234567;
	int temp2 = num2;
	for(; num2>0; num2 = num2/10){
		rem2 = num2%10;
		if(temp2==num2){
			fdigit2 = rem2;
		}
	}
	System.out.println(rem2+fdigit2+" : sum of first and last digit of a number.");
	
		
		
	
		
    //Question 10.to swap first and last digits of a number	
    int rem3 = 0;
    int fdigit3 = 0;
    int ldigit3 = 0;
    String digit3 = "";
    int num3 = 45123454;
    int temp3 = num3;
	for(; num3>0; num3 = num3/10){
		rem3 = num3%10;
			if(temp3==num3){
			 fdigit3 = rem3;
			}
			if(temp3==0){
				 ldigit3 = rem3;
			}
			if(rem3>fdigit3 && rem3<ldigit3){
				digit3 = digit3+rem3;
			}
			
	}
	System.out.println(digit3);
	
	String s = "";
	for(int i = digit3.length()-1; i>=0; i--){
		
		char ch = digit3.charAt(i);
		s = s+ch;
	}
	System.out.println(fdigit3+s+ldigit3);
	
	
	
	
	//Question 11.to calculate sum of digits of a number.
    int rem4 = 0;
	int sum4 = 0;
	int num4 = 12345;
	for(; num4>0; num4 = num4/10){
		rem4 = num4%10;
		sum4 = sum4+rem4;
	}
	System.out.println(sum4+" :sum of digits of a number.");
		
	
	
	
	//Question 12.to calculate product of digits of a number.
    int rem5 = 0;
	int pro5 = 1;
	int num5 = 12304;
	for(; num5>0; num5 = num5/10){
		
		rem5 = num5%10;
		//Condition for excluding zeros.....
		if(rem5>0){
			pro5 = pro5*rem5;
		}
		else
			continue;
	}
	System.out.println(pro5+" :product of digits of a number.");
	
	
	//Question 12s.to calculate subtraction of digits of a number.
    int rem6 = 0;
	int sub6 = 0;
	int num6 = 1234;
	for(; num6>0; num6 = num6/10){
		
		rem6 = num6%10;
		//Condition for excluding zeros.....
		if(rem6>0){
			sub6 = rem6-sub6;
		}
		else
			continue;
	}
	System.out.println(sub6+" :subtraction of digits of a number.");
	
	
	
	
	//Question 13.to enter a number and print its reverse	
	int rem7 = 0;
	int num7 = 12345;
	String rev7 = "";
	for(; num7>0; num7 = num7/10){
		rem7 = num7%10;
		//To convert int into String to send num outta LOOP
		// because int cant hold more than 1 number........
		rev7 = rev7+rem7;
	}
	//To convert String into number.....
	int number7 = Integer.parseInt(rev7);
	System.out.print(number7+": reverse of given number.");
	
	
		
		
	//14.to check whether a number is palindrome or not.
	int num8 = 1244421;
	int temp8 =num8;
	int rev8 = 0;
	for(;num8>0 ;num8/=10){               
		       int rem8 = num8%10;
		       rev8 = (rev8*10)+rem8;
	}
	if(rev8==temp8)
		System.out.print("Given number is pelindrome.");
	else
		System.out.print("Given number is not pelindrome.");
		
	*/
		
		
		
	
	//Question 15.to find frequency of each digit in a given integer.
	int num9 = 124442;
		
	
	}
	
	
	












}








