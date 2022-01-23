class Solution {
    public int twoEggDrop(int n) {
         int[] dp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= i; j++)
                dp[i] = Math.min(dp[i], Math.max(j - 1, dp[i - j]));
            dp[i] += 1;
        }
        return dp[n];
        
    }
}
