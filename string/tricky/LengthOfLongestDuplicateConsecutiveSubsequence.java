package in.dsa.string.tricky;

public class LengthOfLongestDuplicateConsecutiveSubsequence {

	public static void main(String[] args){
		longest("aabceeebeeee");
	}
	
	
	public static void longest(String s){
	
		if(s.length()<=1) return;
		
		s = s+"-1";
		
		int longest = 1;
		int maxLongest = 1;
		
		for(int i =1; i<s.length(); i++){
			
			if(s.charAt(i)==s.charAt(i-1))
				longest++;
			else if(longest>maxLongest){
				maxLongest = longest;
				longest = 1;
			}
		}
		
		System.out.println(maxLongest);
	}
}
