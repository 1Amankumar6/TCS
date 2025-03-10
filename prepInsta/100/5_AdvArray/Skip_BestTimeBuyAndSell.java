public class Skip_BestTimeBuyAndSell {
  // Input: Prices[] = [7, 1, 5, 3, 6, 4]
  // Output: 5

  public static void main(String[] args) {
    // Given prices
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int ans = maxProfit(prices);
    // Print answer
    System.out.println("Best time to buy and sell stock = " + ans);
  }

  // Recursive DP with Memoization
  static int findMaximumProfit(int[] prices, int i, int k, int buy, int[][][] dp) {
    // Base cases
    if (i >= prices.length || k <= 0) return 0;  // No more days or no more transactions allowed
    if (dp[i][k][buy] != -1) return dp[i][k][buy];  // Return the saved result if already computed

    // If we are in 'buy' state (buy == 1)
    if (buy == 1) {
      // Max profit can be either:
      // 1. Skip buying today and move to the next day (stay in the same state)
      // 2. Buy today (subtract the price from profit) and move to the next day with 0 transactions left
      return dp[i][k][buy] = Math.max(-prices[i] + findMaximumProfit(prices, i + 1, k, 0, dp), 
                                      findMaximumProfit(prices, i + 1, k, 1, dp));
    } else { // If we are in 'sell' state (buy == 0)
      // Max profit can be either:
      // 1. Skip selling today and move to the next day (stay in the same state)
      // 2. Sell today (add price to profit) and move to the next day with 1 less transaction
      return dp[i][k][buy] = Math.max(prices[i] + findMaximumProfit(prices, i + 1, k - 1, 1, dp), 
                                      findMaximumProfit(prices, i + 1, k, 0, dp));
    }
  }

  // Wrapper function for the DP approach
  static int maxProfit(int[] prices) {
    int n = prices.length;
    int k = 1; // We are allowed only 1 transaction (buy and sell once)
    
    // Create a DP table with dimensions [days][transactions][buy (0 or 1)]
    int[][][] dp = new int[n][k + 1][2];
    
    // Initialize the DP table with -1
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= k; j++) {
        dp[i][j][0] = dp[i][j][1] = -1;
      }
    }

    // Start from day 0 with 1 transaction allowed and the ability to buy
    return findMaximumProfit(prices, 0, k, 1, dp);
  }
}
