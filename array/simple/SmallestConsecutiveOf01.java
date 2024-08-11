package in.dsa.array.simple;

public class SmallestConsecutiveOf01 {

	public static void main(String[] args){
		
		int e = smallestConsecutive(new int[]{1,1,1,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0,1});
		System.out.println(e);
	}
	
	
	public static int smallestConsecutive(int[]a){
		
		int smallest = 1;
		int maxSmallestt = Integer.MAX_VALUE;
		
		for(int i=1; i<a.length; i++){
			
			if(a[i]==a[i-1])
				smallest++;
			
			else if(smallest < maxSmallestt){
				maxSmallestt = smallest;
				smallest = 1;
			}
		}
		
		return maxSmallestt;
	}

}
