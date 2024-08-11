package in.dsa.zloop.logical2;


public class StrongNum{

	public static void main(String[] args){
		strongNum(145);
	}


	public static void strongNum(int num){

		int sum = 0,  temp;
		temp = num;

		while(temp>0){
			int rem=temp%10;
    

			int fact = 1;
			for(int i = 1; i<=rem; i++){
				fact=fact*i;
			}
			sum=sum +fact;
		  
		 temp=temp/10;
		}

		if(num==sum){
			System.out.println(sum+" is a strong number");
		}
		else{
			System.out.println(sum+" is not a strong number");
		}
	
	}


}