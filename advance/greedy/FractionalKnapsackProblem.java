package in.dsa.advance.greedy;

import java.util.ArrayList;

class Item{
	int weigth = 0;
	int value = 0;
	double pwRatio = 0.0;
	public Item(int weigth, int value, double pwRatio){
		this.weigth = weigth;
		this.value = value;
		this.pwRatio = pwRatio;
	}
}


public class FractionalKnapsackProblem{

	public static void main(String[] args){

		int[] weight = {10,40,30,20};
		int[] value = {60,40,100,120};
		int capacity = 50;
		
		double total = Knapsack(weight, value, capacity);
		System.out.println(total);
	}
		
	public static double Knapsack(int[] weight, int[] value, int capacity){
		
		ArrayList<Item> al = new ArrayList<>();
		for(int i = 0; i<weight.length; i++){
			Item kn = new Item(weight[i], value[i], value[i]/weight[i]);	
			al.add(kn);
		}
		al.sort((pw1, pw2)-> Double.compare(pw2.pwRatio, pw1.pwRatio));
		
		//for(int i = 0; i<al.size(); i++)
		//System.out.println(al.get(i).weigth+" "+al.get(i).value+" "+al.get(i).pwRatio);
		
		double totalValue = 0.0;
		for(Item item : al){
			
			if(capacity - item.weigth>=0){
				
				//reduce the capacity bcz that much sack is filled.
				capacity = capacity - item.weigth;
				//total value got
				totalValue = totalValue + item.value;
			}
			else{
				//This is for the fractional if the capacity is less than the remaining weights.
				totalValue = totalValue+(item.value*((double)capacity/item.weigth)); //(t = t + v*cap/w)
				break;
			}
		}
		
	  return totalValue;
	}

}
