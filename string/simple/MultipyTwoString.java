package in.dsa.string.simple;

import java.math.BigInteger;

public class MultipyTwoString {

	public static void main(String[] args) {

		BigInteger mul= mul("5000", "3000");
		System.out.println(mul);
	}
	
	
	public static BigInteger mul(String s1 , String s2){
		
		BigInteger bi1 = new BigInteger(s1);
		BigInteger bi2 = new BigInteger(s2);
		
		return bi1.multiply(bi2);
		
	}
}
