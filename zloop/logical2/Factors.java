package in.dsa.zloop.logical2;

public class Factors{

	public static void main(String[] args){

		int n =20;


		for(int i = 1; i<=n; i++){

			if(n%i==0){
				System.out.println("The factors of given number are "+i);
			}
		}


	}
}