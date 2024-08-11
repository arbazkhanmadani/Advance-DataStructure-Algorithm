package in.dsa.array.simple;

public class LongestConsecutiveSequenceOf01 {

	public static void main(String[] args){
		
		int e = longetConsecutive(new int[]{1,1,0,1,1,1});
		System.out.println(e);
	}
	
	
	public static int longetConsecutive(int[]a){
		
		int longest = 1;
		int maxLongest = 1;
		
		for(int i=1; i<a.length; i++){
			
			if(a[i]==a[i-1])
				longest++;
			
			if(longest>maxLongest){
				maxLongest = longest;
				longest = 1;
			}
		}
		
		return maxLongest;
	}
}
