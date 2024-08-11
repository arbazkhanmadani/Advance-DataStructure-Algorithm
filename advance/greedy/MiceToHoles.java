package in.dsa.advance.greedy;

import java.util.Arrays;

public class MiceToHoles {

	public static void main(String[] args){

		int mice[] = {5,1,3,0,5,8};
		int holes[] = {9,2,4,6,7,9};
		minTimeToPutMiceInHoles(mice,holes);

		int mice1[] = {4,2};
		int holes1[] = {1,7};
		minTimeToPutMiceInHoles(mice1,holes1);
	}
	
	
	public static void minTimeToPutMiceInHoles(int[] mice, int[] holes){
		
	
		Arrays.sort(mice);
		Arrays.sort(holes);
	
		int maxTime = 0;
		for(int i = 0; i<mice.length; i++){
			
			int diff = Math.abs(mice[i] - holes[i]);
			maxTime = Math.max(maxTime, diff);
		}
		
		System.out.println(maxTime);
	}
}
