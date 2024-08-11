package in.dsa.zloop.logical2;

public class DecimalToBinary{

	public static void main(String[] args){

		DecimalToBinary db = new DecimalToBinary();
		db.Binary(10);
	}

	public void Binary(int dec){

		StringBuffer sb = new StringBuffer();		
		
		while(dec>0){
			sb.insert(0, dec%2);
			
		 dec = dec/2;   
		}
		System.out.print(Integer.parseInt(sb.toString()));
	}
	

}