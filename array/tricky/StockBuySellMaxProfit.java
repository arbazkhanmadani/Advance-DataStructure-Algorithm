package in.dsa.array.tricky;

public class StockBuySellMaxProfit {

	public static void main(String[] args){
  
        // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int max_profit = maxProfit(price);
        System.out.println("max profit is : "+max_profit);
	  }
	
	 static int maxProfit(int prices[]){
	  
	     //maxProfit adds up the difference between 
		 //adjacent elements if they are in increasing order
	     int maxProfit = 0;
	     //The loop starts from 1 as its comparing with the previous
	     for(int i = 1; i < prices.length; i++)
	    	
	    	 //comparing value of i to its less idxs values bcz 
	    	 //we have to find max profit......................
	         if(prices[i]>prices[i-1])
	        	 //prices[i] - prices[i - 1] -> finding price difference of next day...
	             maxProfit = maxProfit + ( prices[i] - prices[i-1]);
	         
	     
	     return  maxProfit>0 ? maxProfit: 0;
	    }
	  	   
}
