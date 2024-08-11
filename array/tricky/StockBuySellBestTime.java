package in.dsa.array.tricky;

public class StockBuySellBestTime {

	public static void main(String[] args){
		  
        // stock prices on consecutive days
        int price[] = {7,1,5,3,6,4};
        int bestTime = bestTime(price);
        System.out.println("Best Time is : "+bestTime);
	  }
  
	
	 static int bestTime(int prices[]){
	  
		    int maxProfit = 0;
		    //Loop through the prices array starting from the first day
		    for(int i = 1; i < prices.length; i++){
		    	
		        //Calculate the difference between the current day's price and the previous day's price
		        int difference = prices[i] - prices[i - 1];
		        
		        // If the difference is positive, add it to the maxProfit
		        if(difference > 0) 
		            maxProfit += difference;
		    }

		    //Return the maximum profit, which will be zero if no profit can be made
		    return maxProfit;
		}

}
