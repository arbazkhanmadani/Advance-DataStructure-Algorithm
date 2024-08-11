package in.dsa.string.simple;

import java.util.Arrays;

public class ReverseStringInPlace {

	public static void main(String[] args){
		remove("arbaz");
	}
	
	
	public static void remove(String s){
	
		if(s.length()==0) return;
		
		char[] carr = s.toCharArray();
		int i=0, j=carr.length-1;
		char temp=' ';
		
		while(i<j){
			
			temp = carr[i];
			carr[i] = carr[j];
			carr[j] = temp;
			
			
			i++;
			j--;
		}
		
		System.out.println(new String(carr));
	}

}
