package in.dsa.zloop.logical2;

public class NumIntoChar{

	public static void main(String[] args){

		int i =0;

		for(i=0; i<=128; i++){
       
			char ch = (char)i;
			System.out.println(ch+" : "+i);
		}

	}
} 