package in.dsa.zloop.logical2;

public class PelindromeNum{

	public static boolean pelindrome(int a){
		
		int temp =a;

		int rev = 0;

		for(int i =0; a>0 ;a/=10){               
       
			int rem =a%10;
       
			rev = (rev*10)+rem;
  
		}

		if(rev==temp){
			return true;
		}
		else{
			return false;
		}
	}


	public static void main(String[] args){

		boolean b = pelindrome(121);


		System.out.println("Its Pelindrome if true comes either its Not pelindrome : "+b);
	}
}