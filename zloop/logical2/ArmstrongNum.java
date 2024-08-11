package in.dsa.zloop.logical2;

public class ArmstrongNum{

	public static void main(String[] args){
		armstrongNum(153);
	}

	
	//153 = 1^3+5^3+3^3........
	public static void armstrongNum(int num){

		int Arm =0;
		int temp;
		temp = num;
		int length = len(num);
		
		while(temp>0){
    
			int rem=temp%10;
			Arm= Arm+(int)Math.pow(rem, length);
			
		temp=temp/10;
	  }
		

		if(num==Arm){
			System.out.println(Arm+" is a Armstrong number");
		}
		else{
			System.out.println(Arm+" is not a Armstrong number");
		}
}


	private static int len(int num){
		int count =0;
		while(num!=0){
			count++;
		 num/=10;
		}
		return count;
	}
	
	
}