package in.dsa.zloop.logical2;

public class BinaryToDecimal{

	public static void main(String[] args){
		BinaryToDecimal bd = new BinaryToDecimal();

		int result = bd.Decimal(10001);
		System.out.println(result);

		int result1 = bd.Decimal(0);
		System.out.println(result1);

		int result3 = bd.Decimal(1);
		System.out.println(result3);

		int result2 = bd.Decimal(11111);
		System.out.println(result2);
	}


	public int Decimal(int bin){
		
		if(bin<=1) return bin;
		
		int rem = 0;
		int decimal = 0;
		int i =0;
		
		while(bin!=0){
			rem =bin%10;
			decimal = decimal+(int)Math.pow(2, i)*rem;
			bin = bin/10;    
		 
		 i++;	
		}
		
		return decimal;
	}

}