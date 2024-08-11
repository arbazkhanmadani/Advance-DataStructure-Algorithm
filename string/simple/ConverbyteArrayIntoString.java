package in.dsa.string.simple;

import java.util.Arrays;

public class ConverbyteArrayIntoString {

	public static void main(String[] args) {
		
		byte[] b = "Hyyyyyyyyy".getBytes();
		System.out.println(Arrays.toString(b));
		
		String str = new String(b);
		System.out.println(str);
		
	}
			
}
