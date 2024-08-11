package in.dsa.string.tricky;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args){
		longest("aabcbccccgggggeee");
	}
	
	
	public static void longest(String s){
	
		if(s.length()<=1) return;
				
		String longest = "";
		String current = ""+s.charAt(0);
		
		for(int i =1; i<s.length(); i++){
			
			if(s.charAt(i) > current.charAt( current.length()-1 ))
				current += s.charAt(i);
			else{
				current = ""+s.charAt(i);
			}
			
			if(current.length() > longest.length())
				longest = current;
			
		}
		
		System.out.println(longest);
	}

}
