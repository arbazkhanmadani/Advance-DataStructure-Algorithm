package in.dsa.advance.greedy;

import java.util.Arrays;

public class CandyDistribution {

	public static void main(String[] args){

		int ratings[] = {1,0,2};
		
		int totalC = minCandy(ratings);
		System.out.println(totalC);
	}


	public static int minCandy(int[] ratings){
	
		int n = ratings.length;
		int[] candies = new int[n];
		//bcz at least min cost could be 1.
		Arrays.fill(candies, 1);
		System.out.println(Arrays.toString(candies));
		
		for(int i = 1; i<n; i++)
			if(ratings[i]>ratings[i-1])
				candies[i] = Math.max(candies[i], candies[i-1] + 1 );
			
	
		for(int i = n-2; i>=0; i--)
			if(ratings[i]>ratings[i+1])
				candies[i] =Math.max(candies[i], candies[i+1] + 1);
			
	
		//Sum of all candies
		int totalC = 0;
		for(int candy : candies)
			totalC += candy;
		
		
		return totalC;
	}
}
