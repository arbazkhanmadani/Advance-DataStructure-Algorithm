package in.dsa.string.simple;

public class Check1StringIsSubsequenceOfAnother {


	public static void main(String[] args){
		System.out.println(check("abc", "ahbgdc"));
	}
	
	
	public static boolean check(String s1, String s2){
	
		if(s1.length()==0) return true;
		
		int i =0,j=0;
		while(j<s2.length()){
			
			if(s1.charAt(i)==s2.charAt(j)){
				i++;
				if(i==s1.length()) return true;	
			}
		  j++;	
		}


		System.out.println(j);
		return false;
	
	}

}
