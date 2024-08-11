package in.dsa.zloop.logical2;

public class FibonaciSeries{


	//fibonaci series = 0+1=1+2=2+3=3+5=8+5=13.......+,
	public static void main(String[] args){

		long a=0, b=1 , c=0;
		System.out.println(a);
		System.out.println(b);
    

		for(long i = 1; i<=93; i++){
    
    
			//System.out.println(a);
			c=a+b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}
}