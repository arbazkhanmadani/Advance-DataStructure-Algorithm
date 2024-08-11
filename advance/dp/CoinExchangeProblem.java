package in.dsa.advance.dp;

/**
 * s = 4 {1,1,1,1}, {2,2}, {1,3}, {1,1,2}
 * 
 * so output = 4pairs
 **/
public class CoinExchangeProblem {

	public static void main(String[] args) {

		int coinsCombi = coinExchange(new int[] { 1, 2, 3 }, 4);
		System.out.println(coinsCombi);
	}

	public static int coinExchange(int[] coins, int sum) {

		// Holding possible pairs........
		int[] sumResult = new int[sum + 1];
		// Base condition(if given val is 0...
		sumResult[0] = 1;

		// {1,1,1,1}, {2,2}, {1,3}, {1,1,2}
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= sum; j++) {

				sumResult[j] += sumResult[j - coins[i]];
				// System.out.println(sumResult[j]);
			}
		}

		return sumResult[sum];
	}

}
