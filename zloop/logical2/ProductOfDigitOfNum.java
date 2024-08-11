package in.dsa.zloop.logical2;

public class ProductOfDigitOfNum{


	public static int product(int a){

		int pro = 1;

		for(int i =0; a>0 ;a/=10){               
       
			int rem =a%10;
			pro = pro*rem;      
		}
		return pro; 
	}



	public static void main(String[] args){


		int result1 = product(123456);
		System.out.println("The product of the digit of given number is : "+result1);
	}
}