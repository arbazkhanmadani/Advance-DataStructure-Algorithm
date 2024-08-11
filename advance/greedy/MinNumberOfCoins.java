package in.dsa.advance.greedy;

import java.util.ArrayList;

public class MinNumberOfCoins {

	public static void main(String[] args){

		int[] a = {2000,500,200,100,50,20,10,5,2,1};
		int sum = 143;
		minCoin(a,sum);

	}

	
	public static void minCoin(int[]a, int sum){
		
		ArrayList<Integer> al = new ArrayList<>();
		int notes = 0;
		int i = 0;
		
		while(sum>0){
			
			//143/100 -> in 1 times
			notes = sum/a[i];
			
			while(notes>0){
				al.add(a[i]);
				notes--;
			}
		
			//143/100 -> rem 43, 43/20->rem 3, 3/2 rem 1, 1/1 rem 0.
			sum = sum%a[i];
			i++;
		}
		
		
		System.out.println("target"+al);
	}
}
