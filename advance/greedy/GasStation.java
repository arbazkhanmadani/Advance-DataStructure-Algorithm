package in.dsa.advance.greedy;

// problem = > can we cover all gas station without burn whole fuel.

public class GasStation {

	public static void main(String[] args) {

		int gas[] = {1,2,3,4,5};
		int cost[] = {3,4,5,1,2};
		
		int totalC = gasStation(gas, cost);
		System.out.println(totalC);
	}
	
	public static int gasStation(int[]g, int[]c){
		
		int totalGas = 0;
		int totalCost = 0;
		int tank = 0;
		int startIdx = 0;
		
		for(int i =0; i<g.length; i++){
			
			totalGas += g[i];
			totalCost += c[i];
			
			tank = g[i] - c[i];
			//If -ve reset=0, and forward to next station bcz current has no fuel. i+1
			if(tank<0){
				startIdx = i+1;
				tank=0;
			}
		}
		
		if(totalGas<totalCost) return -1;
		else return startIdx;
	}

}
