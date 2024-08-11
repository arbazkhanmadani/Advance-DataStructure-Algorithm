package in.dsa.string.simple;

import java.math.BigInteger;

public class SumTwoString {

	public static void main(String[] args) {

		BigInteger sum= sum("5000", "3000");
		System.out.println(sum);
	}
	
	
	public static BigInteger sum(String s1 , String s2){
		
		BigInteger bi1 = new BigInteger(s1);
		BigInteger bi2 = new BigInteger(s2);
		
		return bi1.add(bi2);
		
	}
}
