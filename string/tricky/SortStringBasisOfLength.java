package in.dsa.string.tricky;

public class SortStringBasisOfLength {

	public static void main(String[] args){
	
		sortBasisOfLen(new String[]{"arbaz","zaid","sarfaraz","aman"});
	}
	
	
	
	public static void sortBasisOfLen(String[] s){
	
		
		String temp = "";
		
		
		for(int i = 0; i<s.length; i++){
			for(int j = i+1; j<s.length; j++){
				
				if(s[i].length() > s[j].length()){
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		
		
		for(int i = 0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
	}
	
}
