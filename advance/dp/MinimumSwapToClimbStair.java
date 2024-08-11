package in.dsa.advance.dp;

/**
 * Where n = 10; min Steps = 89.
 * 
 * dp[2] = dp[1] + dp[0] = 1 + 1 = 2 dp[3] = dp[2] + dp[1] = 2 + 1 = 3 dp[4] =
 * dp[3] + dp[2] = 3 + 2 = 5 dp[5] = dp[4] + dp[3] = 5 + 3 = 8 dp[6] = dp[5] +
 * dp[4] = 8 + 5 = 13 dp[7] = dp[6] + dp[5] = 13 + 8 = 21 dp[8] = dp[7] + dp[6]
 * = 21 + 13 = 34 dp[9] = dp[8] + dp[7] = 34 + 21 = 55 dp[10] = dp[9] + dp[8] =
 * 55 + 34 = 89
 * 
 */
public class MinimumSwapToClimbStair {

	public static void main(String[] args) {

		int n1 = 2;
		int n2 = 3;
		int n3 = 10;

		System.out.println("Number of distinct ways to climb " + n1 + " stairs: " + climbStairs(n1));
		System.out.println("Number of distinct ways to climb " + n2 + " stairs: " + climbStairs(n2));
		System.out.println("Number of distinct ways to climb " + n3 + " stairs: " + climbStairs(n3));
	}

	public static int climbStairs(int n) {

		if (n == 1)
			return 1;

		int[] dp = new int[n + 1];
		dp[0] = 1; // base case: 1 way to stay on ground
		dp[1] = 1; // base case: 1 way to reach 1st step

		for (int i = 2; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}
}
